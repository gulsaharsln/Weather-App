package com.example.weatherapp.Screens

import android.content.Context
import android.location.Geocoder
import android.location.Location
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.tooling.preview.Preview
import com.example.weatherapp.R
import com.example.weatherapp.WeatherResponse
import com.example.weatherapp.fetchWeatherData
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.TextStyle
import androidx.compose.material.Typography
import androidx.compose.ui.text.font.Font
import com.example.weatherapp.getWeatherIconResource
import androidx.compose.ui.platform.LocalContext
import com.example.weatherapp.ui.theme.LocationUtility
import com.example.weatherapp.ui.theme.LocationUtility.getCityName
import com.example.weatherapp.ui.theme.LocationUtility.getCountryCode


import java.util.Locale


// Define the font family
val OpenSansFamily = FontFamily(Font(R.font.opensans_regular))

// Define the typography
val AppTypography = Typography(
    h1 = TextStyle(
        fontFamily = OpenSansFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 70.sp
    ),

    h2 = TextStyle(
        fontFamily = OpenSansFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp
    ),

    h3 = TextStyle(
        fontFamily = OpenSansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),

    h4 = TextStyle(
        fontFamily = OpenSansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),

    h5 = TextStyle(
        fontFamily = OpenSansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp
    ),
    h6 = TextStyle(
        fontFamily = OpenSansFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),

    caption = TextStyle(
        fontFamily = OpenSansFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp
    )
)


@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    var weatherData by remember { mutableStateOf<WeatherResponse?>(null) }
    var weatherDataIzmir by remember { mutableStateOf<WeatherResponse?>(null) }
    var weatherDataAnkara by remember { mutableStateOf<WeatherResponse?>(null) }

    var locationName by remember { mutableStateOf("Loading...") }
    val context = LocalContext.current

    LaunchedEffect(Unit) {
        try {
            // Fetch device location
            val location = LocationUtility.getCurrentLocation(context)
            if (location != null) {
                // Use location for API call
                val cityName = getCityName(context, location)
                val countryCode = getCountryCode(context, location.latitude, location.longitude)
                    .lowercase(Locale.ROOT)
                val locationQuery = "$cityName,$countryCode"
                weatherData = fetchWeatherData(locationQuery)
                locationName = "$cityName, $countryCode"
            }

            // Format location for specific cities
            weatherDataIzmir = fetchWeatherData("Izmir,tr")
            weatherDataAnkara = fetchWeatherData("Ankara,tr")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }




    Box(
        modifier = modifier
            .requiredWidth(width = 417.dp)
            .requiredHeight(height = 872.dp)
            .background(brush = Brush.linearGradient(
                0f to Color(0xff352163),
                0.58f to Color(0xff331972),
                1f to Color(0xff33143c),
                start = Offset(208.5f, 0f),
                end = Offset(208.5f, 872f)))
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "25501 1",
            alpha = 0.5f,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(x = (0).dp,
                    y = (0).dp)
                .requiredWidth(width = 493.dp)
                .requiredHeight(height = 1000.dp)
                .graphicsLayer(alpha = 0.5f))




        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 120.dp,
                    y = 180.dp)
                .requiredWidth(width = 196.dp)
                .requiredHeight(height = 305.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = (50).dp,
                        y = 150.dp)
                    .requiredWidth(width = 109.dp)
                    .requiredHeight(height = 80.dp)
            ) {
                Text(
                    text = "${weatherData?.main?.temp?: "N/A"}°",
                    color = Color.White,
                    style = AppTypography.h1,
                    lineHeight = 99.sp
                )


                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 96.dp,
                            y = 0.dp)
                        .requiredSize(size = 16.dp)
                        .clip(shape = CircleShape)
                        .border(border = BorderStroke(3.dp, Color.White),
                            shape = CircleShape))
            }

            Text(
                text = locationName,
                color = Color(0xffdedddd),
                style = AppTypography.h2,
                lineHeight = 1.42.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x =0.dp, y = -50.dp)
            )


            BigWeatherImage(weatherData = weatherData)


            val currentDateTime = LocalDateTime.now()
            val formatter = DateTimeFormatter.ofPattern("EEEE, d MMMM yyyy | HH:mm")

            Text(
                text = currentDateTime.format(formatter),
                color = Color(0xffdedddd),
                style = AppTypography.caption,
                lineHeight = 1.42.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 0.dp, y = 250.dp)
            )

            Text(
                text = "${weatherData?.weather?.getOrNull(0)?.description ?: "N/A"}",
                color = Color(0xffdedddd),
                style = AppTypography.caption,
                lineHeight = 1.42.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopCenter)
                    .offset(x = 0.dp, y = 270.dp)
            )



        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 50.dp,
                    y = 680.dp)
                .requiredWidth(width = 488.dp)
                .requiredHeight(height = 78.dp)
        ) {
            Text(
                text = "Other Cities",
                color = Color(0xffdedddd),
                style = AppTypography.caption,
                lineHeight = 1.5.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 3.dp, y = 0.0479736328125.dp)
            )

            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 15.dp,
                        y = 28.0479736328125.dp)
                    .requiredWidth(width = 156.dp)
                    .requiredHeight(height = 50.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 190.dp)
                        .requiredHeight(height = 50.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(brush = Brush.linearGradient(
                            0f to Color(0xff957dcd),
                            1f to Color(0xff523d7f),
                            start = Offset(78f, 0f),
                            end = Offset(78f, 50f))))

                SmallWeatherImage(weatherData = weatherDataIzmir)

                Text(
                    text = "İzmir",
                    color = Color.White,
                    style = AppTypography.h3,
                    lineHeight = 1.07.em,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 40.dp, y = 8.dp)
                )


                Text(
                    text = "${weatherDataIzmir?.main?.temp?: "N/A"}°",
                    color = Color.White,
                    style = AppTypography.h3,
                    lineHeight = 0.94.em,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 120.dp, y = 18.dp)
                )


                Text(
                    text = "${weatherDataIzmir?.weather?.getOrNull(0)?.description ?: "N/A"}",
                    color = Color(0xffdedddd),
                    style = AppTypography.h5,
                    lineHeight = 1.3.em,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 40.dp, y = 28.dp)
                )

            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 216.dp,
                        y = 28.0479736328125.dp)
                    .requiredWidth(width = 156.dp)
                    .requiredHeight(height = 50.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 196.dp)
                        .requiredHeight(height = 50.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(brush = Brush.linearGradient(
                            0f to Color(0xff957dcd),
                            1f to Color(0xff523d7f),
                            start = Offset(78f, 0f),
                            end = Offset(78f, 50f))))


                SmallWeatherImage(weatherData = weatherDataAnkara)

                Text(
                    text = "Ankara",
                    color = Color.White,
                    style = AppTypography.h3,
                    lineHeight = 1.07.em,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 57.dp, y = 8.dp)
                )


                Text(
                    text = "${weatherDataAnkara?.main?.temp?: "N/A"}°",
                    color = Color.White,
                    style = AppTypography.h4,
                    lineHeight = 0.94.em,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 130.dp, y = 18.dp)
                )


                Text(
                    text = "${weatherDataAnkara?.weather?.getOrNull(0)?.description ?: "N/A"}",
                    color = Color(0xffdedddd),
                    style = AppTypography.h5,
                    lineHeight = 1.3.em,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 57.dp, y = 28.dp)
                )

            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 332.dp,
                        y = 28.0479736328125.dp)
                    .requiredWidth(width = 156.dp)
                    .requiredHeight(height = 50.dp)
            ) {


            }

        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 60.dp,
                    y = 550.dp)
                .requiredWidth(width = 294.dp)
                .requiredHeight(height = 95.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 294.dp)
                    .requiredHeight(height = 95.dp)
                    .clip(shape = RoundedCornerShape(8.dp))
                    .background(brush = Brush.linearGradient(
                        0f to Color(0xff957dcd),
                        1f to Color(0xff523d7f),
                        start = Offset(147f, 0f),
                        end = Offset(147f, 95f))))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 19.dp,
                        y = 13.dp)
                    .requiredWidth(width = 78.dp)
                    .requiredHeight(height = 68.dp)

            ) {
                Image(
                    painter = painterResource(id = R.drawable.insurance3),
                    contentDescription = "insurance 1",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 27.dp,
                            y = 0.dp)
                        .requiredSize(size = 24.dp))

                Text(
                    text = "${weatherData?.main?.pressure?: "N/A"}",
                    color = Color.White,
                    style = AppTypography.h3,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 24.dp, y = 30.dp)
                )


                Text(
                    text = "Pressure",
                    color = Color(0xffdedddd),
                    style = AppTypography.h6,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 10.dp, y = 50.dp)
                )

            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 122.dp,
                        y = 13.dp)
                    .requiredWidth(width = 56.dp)
                    .requiredHeight(height = 68.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.insurance2),
                    contentDescription = "insurance 1",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 16.dp,
                            y = 0.dp)
                        .requiredSize(size = 24.dp))

                Text(
                    text = "${weatherData?.main?.humidity ?: "N/A"}%",
                    color = Color.White,
                    style = AppTypography.h3,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 13.dp, y = 30.dp)
                )


                Text(
                    text = "Humidity",
                    color = Color(0xffdedddd),
                    style = AppTypography.h6,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp, y = 50.dp)
                )

            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 203.dp,
                        y = 13.dp)
                    .requiredWidth(width = 73.dp)
                    .requiredHeight(height = 68.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.insurance1),
                    contentDescription = "insurance 1",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 24.dp,
                            y = 0.dp)
                        .requiredSize(size = 24.dp))

                Text(
                    text = "${weatherData?.wind?.speed?: "N/A"}km/h",
                    color = Color.White,
                    style = AppTypography.h3,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 12.dp, y = 30.dp)
                )


                Text(
                    text = "Wind Speed",
                    color = Color(0xffdedddd),
                    style = AppTypography.h6,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 0.dp, y = 50.dp)
                )

            }
        }

    }
        }

@Preview(widthDp = 417, heightDp = 872)
@Composable
private fun HomeScreenPreview() {
    HomeScreen(Modifier)
}

@Composable
fun SafeAreaBox(content: @Composable () -> Unit) {
    Box(modifier = Modifier.padding(top = 20.dp)) {
        content()
    }
}

@Composable
fun BigWeatherImage(weatherData: WeatherResponse?) {
    weatherData?.weather?.getOrNull(0)?.description?.let { description ->
        val imageRes = getWeatherIconResource(description)
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = description,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .requiredWidth(width = 172.dp)
                .requiredHeight(height = 139.dp)
        )
    }
}
@Composable
fun SmallWeatherImage(weatherData: WeatherResponse?) {
    weatherData?.weather?.getOrNull(0)?.description?.let { description ->
        val imageRes = getWeatherIconResource(description)
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = description,
            modifier = Modifier
                .requiredSize(size = 40.dp)
                .offset(x = 0.dp, y = 6.dp)
        )
    }
}
