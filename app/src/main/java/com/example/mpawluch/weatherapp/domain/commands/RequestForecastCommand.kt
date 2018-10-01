package com.example.mpawluch.weatherapp.domain.commands

import com.example.mpawluch.weatherapp.data.ForecastRequest
import com.example.mpawluch.weatherapp.domain.mappers.ForecastDataMapper
import com.example.mpawluch.weatherapp.domain.model.ForecastList

class RequestForecastCommand(private val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}