package com.example.weatherapp

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


private const val OPEN_WEATHER_MAP_API_KEY = "f3342c6292f102c7c8d905c9bf1d1f8a"

interface WeatherApiService {
    @GET("weather")
    suspend fun getWeatherData(
        @Query("q") location: String = "London,uk",
        @Query("units") units: String = "metric", // Use "imperial" for Fahrenheit
        @Query("appid") apiKey: String = OPEN_WEATHER_MAP_API_KEY
    ): Response<WeatherResponse>
}

object RetrofitInstance {
    private const val BASE_URL = "https://api.openweathermap.org/data/2.5/"

    val retrofit: Retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val weatherApiService: WeatherApiService by lazy {
        retrofit.create(WeatherApiService::class.java)
    }
}

suspend fun fetchWeatherData(location: String = "London,uk"): WeatherResponse {
    return try {
        val response = withContext(Dispatchers.IO) {
            RetrofitInstance.weatherApiService.getWeatherData(location)
        }

        if (response.isSuccessful) {
            // Use response.body()?.main?.temperature to get the temperature
            response.body()?.let {
                WeatherResponse(main = it.main, weather = it.weather)
            } ?: WeatherResponse(Main(0.0), listOf(Weather("N/A")))
        } else {
            println("API call failed with code: ${response.code()}")
            val errorBody = response.errorBody()?.string()
            println("Error Body: $errorBody")
            WeatherResponse(Main(0.0), listOf(Weather("N/A")))
        }
    } catch (e: Exception) {
        e.printStackTrace()
        println("Exception message: ${e.message}")
        WeatherResponse(Main(0.0), listOf(Weather("N/A")))
    }
}

