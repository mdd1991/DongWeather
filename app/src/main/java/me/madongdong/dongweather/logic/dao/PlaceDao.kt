package me.madongdong.dongweather.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import me.madongdong.dongweather.DongWeatherApplication
import me.madongdong.dongweather.logic.model.Place

/**
 * @author Donny
 * @date 2020/5/11
 * GitHub：https://github.com/mdd1991
 * email：donnymoving@gmail.com
 * description：单例类，存储城市
 */
object PlaceDao {

    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() = DongWeatherApplication.context.
        getSharedPreferences("dong_weather", Context.MODE_PRIVATE)
}