package me.madongdong.dongweather.logic.model

/**
 * @author Donny
 * @date 2020/5/9
 * GitHub：https://github.com/mdd1991
 * email：donnymoving@gmail.com
 * description：将Realtime和Daily对象封装
 */
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailyResponse.Daily)