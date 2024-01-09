package com.example.weatherapp.Data.Repository

import com.example.weatherapp.Data.Mappers.toWeatherInfo
import com.example.weatherapp.Data.Remote.WeatherApi
import com.example.weatherapp.Domain.Weather.WeatherInfo
import com.example.weatherapp.Domain.Repository.WeatherRepository
import com.example.weatherapp.Domain.Utils.Resource
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {

    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch(e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }
}