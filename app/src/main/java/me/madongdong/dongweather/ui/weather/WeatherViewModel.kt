package me.madongdong.dongweather.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import me.madongdong.dongweather.logic.Repository
import me.madongdong.dongweather.logic.model.Location

/**
 * @author Donny
 * @date 2020/5/10
 * GitHub：https://github.com/mdd1991
 * email：donnymoving@gmail.com
 * description：逻辑层刷新天气信息
 */
class WeatherViewModel : ViewModel() {

    private val locationLiveData = MutableLiveData<Location>()

    var locationLng = ""

    var locationLat = ""

    var placeName = ""

    val weatherLiveData = Transformations.switchMap(locationLiveData) {
        location -> Repository.refreshWeather(location.lng, location.lat)
    }

    //刷新天气信息
    fun refreshWeather(lng: String, lat: String) {
        locationLiveData.value = Location(lng, lat)
    }
}