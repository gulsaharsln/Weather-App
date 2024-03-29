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
    // Existing function to get current weather data
    @GET("weather")
    suspend fun getWeatherData(
        @Query("q") location: String,
        @Query("units") units: String = "metric",
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

suspend fun fetchWeatherData(location: String ): WeatherResponse {
    return try {
        val response = withContext(Dispatchers.IO) {
            RetrofitInstance.weatherApiService.getWeatherData(location)
        }

        if (response.isSuccessful) {
            response.body()?.let {
                WeatherResponse(
                    coord = it.coord ?: Coord(0.0, 0.0),
                    weather = it.weather ?: listOf(Weather(0, "N/A", "N/A", "N/A")),
                    base = it.base ?: "",
                    main = it.main ?: Main(0.0, 0, 0, 0.0, 0.0),
                    visibility = it.visibility ?: 0,
                    wind = it.wind ?: Wind(0.0, 0),
                    clouds = it.clouds ?: Clouds(0),
                    dt = it.dt ?: 0,
                    sys = it.sys ?: Sys(0, 0, 0.0, "", 0, 0),
                    id = it.id ?: 0,
                    name = it.name ?: "",
                    cod = it.cod ?: 0
                )
            } ?: WeatherResponse(Coord(0.0, 0.0), listOf(Weather(0, "N/A", "N/A", "N/A")), "", Main(0.0, 0, 0, 0.0, 0.0), 0, Wind(0.0, 0), Clouds(0), 0, Sys(0, 0, 0.0, "", 0, 0), 0, "", 0)
        } else {
            println("API call failed with code: ${response.code()}")
            val errorBody = response.errorBody()?.string()
            println("Error Body: $errorBody")
            WeatherResponse(Coord(0.0, 0.0), listOf(Weather(0, "N/A", "N/A", "N/A")), "", Main(0.0, 0, 0, 0.0, 0.0), 0, Wind(0.0, 0), Clouds(0), 0, Sys(0, 0, 0.0, "", 0, 0), 0, "", 0)
        }
    } catch (e: Exception) {
        e.printStackTrace()
        println("Exception message: ${e.message}")
        WeatherResponse(Coord(0.0, 0.0), listOf(Weather(0, "N/A", "N/A", "N/A")), "", Main(0.0, 0, 0, 0.0, 0.0), 0, Wind(0.0, 0), Clouds(0), 0, Sys(0, 0, 0.0, "", 0, 0), 0, "", 0)
    }
}

fun getWeatherIconResource(description: String): Int {
    return when (description.toLowerCase()) {
        "clear sky"  -> R.drawable.sunny
        "few clouds", "scattered clouds", "broken clouds" -> R.drawable.partial_cloud
        "overcast clouds", -> R.drawable.cloudy
        "shower rain", "light rain", "moderate rain", "heavy intensity rain", "very heavy rain", "extreme rain" -> R.drawable.rain
        "freezing rain", "light intensity shower rain", "shower rain", "heavy intensity shower rain", "ragged shower rain"-> R.drawable.shower_rain
        "light snow", "snow", "heavy snow", "sleet", "light shower sleet", "shower sleet", "light rain and snow", "rain and snow",
        "light shower snow", "shower snow", "heavy shower snow"  -> R.drawable.snow
        "thunderstorm with light rain", "thunderstorm with rain", "thunderstorm with heavy rain", "light thunderstorm",
        "thunderstorm", "heavy thunderstorm", "ragged thunderstorm", "thunderstorm with light drizzle", "thunderstorm with drizzle",
        "thunderstorm with heavy drizzle"  -> R.drawable.thunder
        "mist", "smoke", "haze", "sand/ dust whirls", "fog", "sand", "dust", "volcanic ash", "squalls", "tornado" -> R.drawable.mist
        else -> R.drawable.cloudy
    }
}



