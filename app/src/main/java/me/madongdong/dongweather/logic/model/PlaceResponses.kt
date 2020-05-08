package me.madongdong.dongweather.logic.model

import com.google.gson.annotations.SerializedName

/**
 * @author Donny
 * @date 2020/5/8
 * GitHub：https://github.com/mdd1991
 * email：donnymoving@gmail.com
 * description：数据模型，定义的类与属性完全按照搜索城市数据接口返回的JSON格式来定义
 */
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(val name: String, val location: Location,
                 @SerializedName("formatted_address") val address: String)

data class Location(val lng: String, val lat: String)