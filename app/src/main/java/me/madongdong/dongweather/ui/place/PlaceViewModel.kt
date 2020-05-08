package me.madongdong.dongweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import me.madongdong.dongweather.logic.Repository
import me.madongdong.dongweather.logic.model.Place

/**
 * @author Donny
 * @date 2020/5/8
 * GitHub：https://github.com/mdd1991
 * email：donnymoving@gmail.com
 * description：ViewModel层
 */
class PlaceViewModel : ViewModel() {

    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData = Transformations.switchMap(searchLiveData) { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }
}