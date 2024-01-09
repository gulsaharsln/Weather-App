package com.example.weatherapp.Domain.Repository

import com.example.weatherapp.Domain.Utils.Resource
import com.example.weatherapp.Domain.Weather.WeatherInfo

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}