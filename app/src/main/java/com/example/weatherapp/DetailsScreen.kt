package com.example.weatherapp


import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.rotate
import com.google.gson.annotations.SerializedName
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query


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

@Composable
fun SafeAreaBox(content: @Composable () -> Unit) {
    Box(modifier = Modifier.padding(top = 20.dp)) {
        content()
    }
}

@Composable
fun DetailsScreen(modifier: Modifier = Modifier) {
    var weatherData by remember { mutableStateOf<WeatherResponse?>(null) }

    LaunchedEffect(Unit) {
        try {
            // Make the API call and update the state
            weatherData = fetchWeatherData("London,uk")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


    SafeAreaBox {

        Box(
            modifier = Modifier
                .requiredWidth(417.dp)
                .requiredHeight(872.dp)
                .background(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            Color(0xFF352163),
                            Color(0xFF331972),
                            Color(0xFF33143C)
                        ),
                        start = Offset(208.5f, 0f),
                        end = Offset(208.5f, 872f)
                    )
                )
        )
        {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 15.dp,
                        y = 10.dp
                    )
                    .requiredWidth(width = 387.dp)
                    .requiredHeight(height = 16.dp)
            )

            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 15.dp,
                        y = 65.dp
                    )
                    .requiredSize(size = 35.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.arrowleftthin),
                    contentDescription = "arrow-left-thin",
                    colorFilter = ColorFilter.tint(Color.White),
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 6.dp,
                            y = 25.dp
                        )
                        .requiredSize(size = 24.dp)
                )
                Box(
                    modifier = Modifier
                        .requiredSize(size = 35.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 35.dp)
                            .offset(x = 0.dp,
                                y = 20.dp)
                            .clip(shape = RoundedCornerShape(5.dp))
                            .background(color = Color.White.copy(alpha = 0.3f))
                    )
                }
            }
            Text(
                text = "7 Days",
                color = Color.White,
                fontSize = 18.sp,
                lineHeight = 0.67.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 179.dp, y = 72.dp)
                    .padding(top = 16.dp)
            )

            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 59.dp,
                        y = 772.dp
                    )
                    .requiredWidth(width = 300.dp)
                    .requiredHeight(height = 50.dp)
            )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 15.dp,
                        y = 118.dp
                    )
                    .padding(top= 5.dp)
                    .requiredWidth(width = 387.dp)
                    .requiredHeight(height = 255.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(
                        brush = Brush.linearGradient(
                            0f to Color(0xff957dcd),
                            1f to Color(0xff523d7f),
                            start = Offset(193.5f, 0f),
                            end = Offset(193.5f, 255f)
                        )
                    )
            )
            Image(
                painter = painterResource(id = R.drawable.cloudyweather331175827548921),
                contentDescription = "cloudy-weather-3311758-2754892 2",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 36.dp,
                        y = 124.dp
                    )
                    .requiredWidth(width = 169.dp)
                    .requiredHeight(height = 132.dp)
            )
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 241.dp,
                        y = 138.dp
                    )
                    .requiredWidth(width = 127.dp)
                    .requiredHeight(height = 106.dp)
            ) {
                Text(
                    text = "17",
                    color = Color.White,
                    fontSize = 25.sp,
                    lineHeight = 3.2.em,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 94.dp, y = 26.dp)
                )

                Divider(
                    color = Color.White,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 68.99995437264442.dp,
                            y = 38.dp
                        )
                        .requiredWidth(width = 35.dp)
                        .rotate(degrees = 109.65f)
                )
                Text(
                    text = "${weatherData?.main?.temperature ?: "N/A"}°",
                    color = Color.White,
                    fontSize = 55.sp,
                    lineHeight = 1.45.em
                )


                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 65.dp,
                            y = 11.dp
                        )
                        .requiredSize(size = 10.dp)
                        .clip(shape = CircleShape)
                        .border(
                            border = BorderStroke(2.dp, Color.White),
                            shape = CircleShape
                        )
                )
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 128.dp,
                            y = 25.dp
                        )
                        .requiredSize(size = 8.dp)
                        .clip(shape = CircleShape)
                        .border(
                            border = BorderStroke(1.dp, Color.White),
                            shape = CircleShape
                        )
                )
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 58.dp,
                        y = 283.dp
                    )
                    .requiredWidth(width = 306.dp)
                    .requiredHeight(height = 68.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 78.dp)
                        .requiredHeight(height = 68.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.insurance3),
                        contentDescription = "insurance 1",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 27.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 24.dp)
                    )
                    Text(
                        text = "30% ",
                        color = Color.White,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 24.dp, y = 30.dp)
                    )

                    Text(
                        text = "Precipitation",
                        color = Color(0xffdedddd),
                        fontSize = 12.sp,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp, y = 50.dp)
                    )

                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 128.dp,
                            y = 0.dp
                        )
                        .requiredWidth(width = 56.dp)
                        .requiredHeight(height = 68.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.insurance2),
                        contentDescription = "insurance 1",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 16.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 24.dp)
                    )

                    Text(
                        text = "20% ",
                        color = Color.White,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 13.dp, y = 30.dp)
                    )


                    Text(
                        text = "Humidity",
                        color = Color(0xffdedddd),
                        fontSize = 12.sp,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp, y = 50.dp)
                    )

                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 233.dp,
                            y = 0.dp
                        )
                        .requiredWidth(width = 73.dp)
                        .requiredHeight(height = 68.dp)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.insurance1),
                        contentDescription = "insurance 1",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(
                                x = 24.dp,
                                y = 0.dp
                            )
                            .requiredSize(size = 24.dp)
                    )

                    Text(
                        text = "9km/h",
                        color = Color.White,
                        fontSize = 14.sp,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 12.dp, y = 30.dp)
                    )


                    Text(
                        text = "Wind Speed",
                        color = Color(0xffdedddd),
                        fontSize = 12.sp,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp, y = 50.dp)
                    )

                }
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 15.dp,
                        y = 412.dp
                    )
                    .requiredWidth(width = 390.dp)
                    .requiredHeight(height = 40.dp)
            ) {
                Text(
                    text = "Monday",
                    color = Color.White,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp, y = 7.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.cloudyweather331175827548921),
                    contentDescription = "cloudy-weather-3311758-2754892 3",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 127.dp,
                            y = 0.dp
                        )
                        .requiredWidth(width = 51.dp)
                        .requiredHeight(height = 40.dp)
                )


                Text(
                    text = "Sunny",
                    color = Color.White.copy(alpha = 0.6f),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 189.dp, y = 12.dp)
                )


                Text(
                    text = "+31°",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 307.dp, y = 10.dp)
                )


                Text(
                    text = "+51°",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 356.dp, y = 10.dp)
                )


            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 15.dp,
                        y = 467.dp
                    )
                    .requiredWidth(width = 390.dp)
                    .requiredHeight(height = 50.dp)
            ) {
                Text(
                    text = "Tuesday",
                    color = Color.White,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp, y = 11.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.rainyweather),
                    contentDescription = "rainy-weather-4034172-3337336@0 1",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 127.dp,
                            y = 0.dp
                        )
                        .requiredSize(size = 50.dp)
                )

                Text(
                    text = "Cloudy",
                    color = Color.White.copy(alpha = 0.6f),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 189.dp, y = 16.dp)
                )


                Text(
                    text = "+31°",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 307.dp, y = 14.dp)
                )


                Text(
                    text = "+51°",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 356.dp, y = 14.dp)
                )


            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 15.dp,
                        y = 520.dp
                    )
                    .requiredWidth(width = 390.dp)
                    .requiredHeight(height = 57.dp)
            ) {
                Text(
                    text = "Wednesday",
                    color = Color.White,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp, y = 17.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.cloudrainandlightning544561745516111),
                    contentDescription = "cloud-rain-and-lightning-5445617-4551611 1",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 125.dp,
                            y = 0.dp
                        )
                        .requiredSize(size = 57.dp)
                )

                Text(
                    text = "Thunder",
                    color = Color.White.copy(alpha = 0.6f),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 189.dp, y = 22.dp)
                )


                Text(
                    text = "+31°",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 307.dp, y = 20.dp)
                )


                Text(
                    text = "+51°",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 356.dp, y = 20.dp)
                )


            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 15.dp,
                        y = 580.dp
                    )
                    .requiredWidth(width = 390.dp)
                    .requiredHeight(height = 57.dp)
            ) {
                Text(
                    text = "Thursday",
                    color = Color.White,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp, y = 16.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.cloudrainandlightning544561745516111),
                    contentDescription = "cloud-rain-and-lightning-5445617-4551611 2",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 125.dp,
                            y = 0.dp
                        )
                        .requiredSize(size = 57.dp)
                )
                Text(
                    text = "Thunder",
                    color = Color.White.copy(alpha = 0.6f),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 189.dp, y = 21.dp)
                )
                Text(
                    text = "+31°",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 307.dp, y = 19.dp)
                )
                Text(
                    text = "+51°",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 356.dp, y = 19.dp)
                )


            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 15.dp,
                        y = 644.dp
                    )
                    .requiredWidth(width = 390.dp)
                    .requiredHeight(height = 45.dp)
            ) {
                Text(
                    text = "Friday",
                    color = Color.White,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp, y = 11.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.rain331175327548871),
                    contentDescription = "rain-3311753-2754887 1",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 134.dp,
                            y = 0.dp
                        )
                        .requiredSize(size = 45.dp)
                )
                Text(
                    text = "Rain",
                    color = Color.White.copy(alpha = 0.6f),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 189.dp, y = 16.dp)
                )
                Text(
                    text = "+31°",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 307.dp, y = 14.dp)
                )
                Text(
                    text = "+51°",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 356.dp, y = 14.dp)
                )


            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 15.dp,
                        y = 703.dp
                    )
                    .requiredWidth(width = 390.dp)
                    .requiredHeight(height = 45.dp)
            ) {
                Text(
                    text = "Saturday",
                    color = Color.White,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp, y = 11.dp)
                )

                Image(
                    painter = painterResource(id = R.drawable.rain),
                    contentDescription = "rain-3311753-2754887 2",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(
                            x = 135.dp,
                            y = 0.dp
                        )
                        .requiredSize(size = 45.dp)
                )
                Text(
                    text = "Rain",
                    color = Color.White.copy(alpha = 0.6f),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 189.dp, y = 16.dp)
                )

                Text(
                    text = "+31°",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 307.dp, y = 14.dp)
                )

                Text(
                    text = "+51°",
                    color = Color.White,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 356.dp, y = 14.dp)
                )


            }
        }
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


@Preview(widthDp = 417, heightDp = 872)
@Composable
private fun DetailsScreenPreview() {
    DetailsScreen(Modifier)
}