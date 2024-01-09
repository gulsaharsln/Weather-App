package com.example.weatherapp.Presentation

import com.example.weatherapp.Domain.Weather.WeatherInfo

data class WeatherState(
    val weatherInfo: WeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)