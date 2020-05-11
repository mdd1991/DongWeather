package me.madongdong.dongweather.logic.network

import me.madongdong.dongweather.DongWeatherApplication
import me.madongdong.dongweather.logic.model.DailyResponse
import me.madongdong.dongweather.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * @author Donny
 * @date 2020/5/9
 * GitHub：https://github.com/mdd1991
 * email：donnymoving@gmail.com
 * description：访问天气信息API的Retrofit接口
 */
interface WeatherService {

    @GET("v2.5/${DongWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            Call<RealtimeResponse>

    @GET("v2.5/${DongWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            Call<DailyResponse>
}