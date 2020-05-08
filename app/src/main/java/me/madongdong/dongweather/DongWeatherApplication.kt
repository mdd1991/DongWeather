package me.madongdong.dongweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/**
 * @author Donny
 * @date 2020/5/8
 * GitHub：https://github.com/mdd1991
 * email：donnymoving@gmail.com
 * description：为项目提供一种全局获取Context的方式
 */
class DongWeatherApplication : Application() {
    companion object {
        //令牌值
        const val TOKEN = "vx8MWpYjcOqyHoYj"

        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}