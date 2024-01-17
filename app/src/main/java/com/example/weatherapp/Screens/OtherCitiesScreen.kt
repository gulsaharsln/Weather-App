package com.example.weatherapp.Screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredSize
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.graphicsLayer
import com.example.weatherapp.R
import com.example.weatherapp.WeatherResponse
import com.example.weatherapp.fetchWeatherData
import com.example.weatherapp.getWeatherIconResource
import androidx.navigation.NavHostController
import com.example.weatherapp.AppTypography

@Composable
fun OtherCitiesScreen(navController: NavHostController, modifier: Modifier = Modifier) {
    var weatherDataIzmir by remember { mutableStateOf<WeatherResponse?>(null) }
    var weatherDataAnkara by remember { mutableStateOf<WeatherResponse?>(null) }
    var weatherDataEskişehir by remember { mutableStateOf<WeatherResponse?>(null) }
    var weatherDataBursa by remember { mutableStateOf<WeatherResponse?>(null) }

    LaunchedEffect(Unit) {
        try {
            weatherDataIzmir = fetchWeatherData("Izmir,tr")
            weatherDataAnkara = fetchWeatherData("Ankara,tr")
            weatherDataEskişehir = fetchWeatherData("Eskişehir,tr")
            weatherDataBursa = fetchWeatherData("Bursa,tr")
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }


    Box(
        modifier = modifier
            .requiredWidth(width = 417.dp)
            .requiredHeight(height = 872.dp)
            .background(
                brush = Brush.linearGradient(
                    0f to Color(0xff352163),
                    0.58f to Color(0xff331972),
                    1f to Color(0xff33143c),
                    start = Offset(208.5f, 0f),
                    end = Offset(208.5f, 872f)
                )
            )
    ) {
        Image(
            painter = painterResource(id = R.drawable.background),
            contentDescription = "25501 1",
            alpha = 0.5f,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(alignment = Alignment.Center)
                .offset(
                    x = (0).dp,
                    y = (0).dp
                )
                .requiredWidth(width = 493.dp)
                .requiredHeight(height = 1031.dp)
                .graphicsLayer(alpha = 0.5f)
        )
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 15.dp,
                    y = 10.dp
                )
                .requiredWidth(width = 387.dp)
                .requiredHeight(height = 16.dp)
        ) {

            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 330.dp,
                        y = 0.dp
                    )
                    .requiredWidth(width = 57.dp)
                    .requiredHeight(height = 16.dp)
            )
        }
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
                        .offset(
                            x = 0.dp,
                            y = 20.dp
                        )
                        .clip(shape = RoundedCornerShape(5.dp))
                        .background(color = Color.White.copy(alpha = 0.3f))
                        .clickable {
                            navController.navigate("homeScreen")
                        }
                )
            }
        }
        Text(
            text = "Other Cities",
            color = Color.White,
            style = AppTypography.h8,
            lineHeight = 0.67.em,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 151.dp, y = 92.dp)
        )

        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 15.dp,
                    y = 175.dp
                )
                .requiredWidth(width = 394.dp)
                .requiredHeight(height = 114.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 0.dp,
                        y = 20.dp
                    )
                    .requiredWidth(width = 321.dp)
                    .requiredHeight(height = 90.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(
                        brush = Brush.linearGradient(
                            0f to Color(0xff957dcd),
                            1f to Color(0xff523d7f),
                            start = Offset(160.5f, 0f),
                            end = Offset(160.5f, 90f)
                        )
                    )
            )

            CitiesImage(weatherData = weatherDataIzmir)

            Text(
                text = "İzmir",
                color = Color.White,
                style = AppTypography.h8,
                lineHeight = 0.6.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 20.dp, y = 30.dp)
            )

            Text(
                text = "${weatherDataIzmir?.main?.temp ?: "N/A"}°",
                color = Color.White,
                style = AppTypography.h10,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 20.dp, y = 60.dp)
            )

            Text(
                text = "${weatherDataIzmir?.weather?.getOrNull(0)?.description ?: "N/A"}",
                color = Color.White.copy(alpha = 0.7f),
                style = AppTypography.h9,
                lineHeight = 0.86.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 20.dp, y = 85.dp)
            )

        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 15.dp,
                    y = 322.dp
                )
                .requiredWidth(width = 402.dp)
                .requiredHeight(height = 146.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 0.dp,
                        y = 20.dp
                    )
                    .requiredWidth(width = 321.dp)
                    .requiredHeight(height = 90.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(
                        brush = Brush.linearGradient(
                            0f to Color(0xff957dcd),
                            1f to Color(0xff523d7f),
                            start = Offset(160.5f, 0f),
                            end = Offset(160.5f, 90f)
                        )
                    )
            )
            CitiesImage(weatherData = weatherDataAnkara)

            Text(
                text = "Ankara",
                color = Color.White,
                style = AppTypography.h8,
                lineHeight = 0.6.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 20.dp, y = 30.dp)
            )

            Text(
                text = "${weatherDataAnkara?.main?.temp ?: "N/A"}°",
                color = Color.White,
                style = AppTypography.h10,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 20.dp, y = 60.dp)
            )


            Text(
                text = "${weatherDataAnkara?.weather?.getOrNull(0)?.description ?: "N/A"}",
                color = Color.White.copy(alpha = 0.7f),
                style = AppTypography.h9,
                lineHeight = 0.86.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 20.dp, y = 85.dp)
            )

        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 15.dp,
                    y = 477.dp
                )
                .requiredWidth(width = 387.dp)
                .requiredHeight(height = 117.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 0.dp,
                        y = 20.dp
                    )
                    .requiredWidth(width = 321.dp)
                    .requiredHeight(height = 90.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(
                        brush = Brush.linearGradient(
                            0f to Color(0xff957dcd),
                            1f to Color(0xff523d7f),
                            start = Offset(160.5f, 0f),
                            end = Offset(160.5f, 90f)
                        )
                    )
            )

            CitiesImage(weatherData = weatherDataEskişehir)

            Text(
                text = "Eskişehir",
                color = Color.White,
                style = AppTypography.h8,
                lineHeight = 0.6.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x =20.dp, y = 30.dp)
            )

            Text(
                text = "${weatherDataEskişehir?.main?.temp ?: "N/A"}°",
                color = Color.White,
                style = AppTypography.h10,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 20.dp, y = 60.dp)
            )


            Text(
                text = "${weatherDataEskişehir?.weather?.getOrNull(0)?.description ?: "N/A"}",
                color = Color.White.copy(alpha = 0.7f),
                style = AppTypography.h9,
                lineHeight = 0.86.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 20.dp, y = 85.dp)
            )

        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 15.dp,
                    y = 627.dp
                )
                .requiredWidth(width = 398.dp)
                .requiredHeight(height = 138.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(
                        x = 0.dp,
                        y = 20.dp
                    )
                    .requiredWidth(width = 321.dp)
                    .requiredHeight(height = 90.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(
                        brush = Brush.linearGradient(
                            0f to Color(0xff957dcd),
                            1f to Color(0xff523d7f),
                            start = Offset(160.5f, 0f),
                            end = Offset(160.5f, 90f)
                        )
                    )
            )

            CitiesImage(weatherData = weatherDataBursa)

            Text(
                text = "Bursa",
                color = Color.White,
                style = AppTypography.h8,
                lineHeight = 0.6.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 20.dp, y = 30.dp)
            )

            Text(
                text = "${weatherDataBursa?.main?.temp ?: "N/A"}°",
                color = Color.White,
                style = AppTypography.h10,
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .offset(x = 20.dp, y = 60.dp)
            )


            Text(
                text = "${weatherDataBursa?.weather?.getOrNull(0)?.description ?: "N/A"}",
                color = Color.White.copy(alpha = 0.7f),
                style = AppTypography.h9,
                lineHeight = 0.86.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 20.dp, y = 85.dp)
            )

        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 15.dp,
                    y = 138.dp
                )
                .requiredWidth(width = 335.dp)
                .requiredHeight(height = 38.dp)
        )
        IconButton(
            onClick = { },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 364.dp,
                    y = 132.dp
                )
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 38.dp)

            )
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(
                    x = 50.dp,
                    y = 772.dp
                )
                .requiredWidth(width = 300.dp)
                .requiredHeight(height = 50.dp)
        )
    }
}

@Composable
fun CitiesImage(weatherData: WeatherResponse?) {
    weatherData?.weather?.getOrNull(0)?.description?.let { description ->
        val imageRes = getWeatherIconResource(description)
        Image(
            painter = painterResource(id = imageRes),
            contentDescription = description,
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .requiredWidth(width = 160.dp)
                .requiredHeight(height = 130.dp)
                .offset(x = 249.dp, y = 0.dp)
        )
    }
}

