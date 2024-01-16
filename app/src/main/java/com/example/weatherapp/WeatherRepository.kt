package com.example.weatherapp


class WeatherRepository {
    suspend fun getWeather(location: String): WeatherResponse {
        return fetchWeatherData(location)
    }
}