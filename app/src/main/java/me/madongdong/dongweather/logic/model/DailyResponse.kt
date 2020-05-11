package me.madongdong.dongweather.logic.model

import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * @author Donny
 * @date 2020/5/9
 * GitHub：https://github.com/mdd1991
 * email：donnymoving@gmail.com
 * description：未来几天天气接口返回JSON数据模型
 */
data class DailyResponse(val status: String, val result: Result) {

    data class Result(val daily: Daily)

    data class Daily(val temperature: List<Temperature>, val skycon: List<Skycon>,
        @SerializedName("life_index") val lifeIndex: LifeIndex)

    data class Temperature(val max: Float, val min: Float)

    data class Skycon(val value: String, val date: Date)

    data class LifeIndex(val coldRisk: List<LifeDescription>, val carWashing:
        List<LifeDescription>, val ultraviolet: List<LifeDescription>,
        val dressing: List<LifeDescription>)

    data class LifeDescription(val desc: String)
}