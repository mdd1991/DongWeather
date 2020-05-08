package me.madongdong.dongweather.logic

import androidx.lifecycle.liveData
import kotlinx.coroutines.Dispatchers
import me.madongdong.dongweather.logic.model.Place
import me.madongdong.dongweather.logic.network.DongWeatherNetwork

/**
 * @author Donny
 * @date 2020/5/8
 * GitHub：https://github.com/mdd1991
 * email：donnymoving@gmail.com
 * description：单例类，仓库层的统一封装入口
 */
object Repository {

    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placesResponse = DongWeatherNetwork.searchPlaces(query)
            if (placesResponse.status == "ok") {
                val places = placesResponse.places
                Result.success(places)
            } else {
                Result.failure(RuntimeException("response status is ${placesResponse.status}"))
            }
        } catch (e: Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result as Result<List<Place>>)
    }
}