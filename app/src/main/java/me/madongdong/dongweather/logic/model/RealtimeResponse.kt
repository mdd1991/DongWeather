package me.madongdong.dongweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @author Donny
 * @date 2020/5/9
 * GitHub：https://github.com/mdd1991
 * email：donnymoving@gmail.com
 * description：实时天气接口返回JSON数据模型
 */
data class RealtimeResponse(val status: String, val result: Result) {

    data class Result(val realtime: Realtime)

    data class Realtime(val skycon: String, val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality)

    data class AirQuality(val aqi: AQI)

    data class AQI(val chn: Float)
}