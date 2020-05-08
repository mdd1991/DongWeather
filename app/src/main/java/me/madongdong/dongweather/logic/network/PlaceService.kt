package me.madongdong.dongweather.logic.network

import me.madongdong.dongweather.DongWeatherApplication
import me.madongdong.dongweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * @author Donny
 * @date 2020/5/8
 * GitHub：https://github.com/mdd1991
 * email：donnymoving@gmail.com
 * description：访问彩云天气城市搜索API的Retrofit接口
 */
interface PlaceService {

    @GET("v2/place?token=${DongWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}