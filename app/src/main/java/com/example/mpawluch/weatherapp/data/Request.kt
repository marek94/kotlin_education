package com.example.mpawluch.weatherapp.data

import android.util.Log
import java.net.URL

class Request(private val url: String) {

    fun run() {
        val forecastJsonString = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonString)
        Log.e("DO IT", forecastJsonString)
    }
}