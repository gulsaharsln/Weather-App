package com.example.weatherapp
import com.google.gson.annotations.SerializedName

data class WeatherResponse(
    @SerializedName("main")
    val main: Main,
    @SerializedName("weather")
    val weather: List<Weather>,
    // Add other fields based on your API response structure
)

data class Main(
    @SerializedName("temp")
    val temperature: Double
)

data class Weather(
    @SerializedName("description")
    val description: String
    // Add other fields based on your API response structure
)