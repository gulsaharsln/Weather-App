package com.example.weatherapp.Screens

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
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Text
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.graphicsLayer
import com.example.weatherapp.R
import com.example.weatherapp.WeatherResponse
import com.example.weatherapp.fetchWeatherData


@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
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
                    y = 96.dp)
                .requiredWidth(width = 176.dp)
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
                    text = "${weatherData?.main?.temperature ?: "N/A"}°",
                    color = Color.White,
                    fontSize = 70.sp,
                    lineHeight = 99.sp
                )


                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 93.dp,
                            y = 0.dp)
                        .requiredSize(size = 16.dp)
                        .clip(shape = CircleShape)
                        .border(border = BorderStroke(3.dp, Color.White),
                            shape = CircleShape))
            }
            Image(
                painter = painterResource(id = R.drawable.cloudyweather331175827548921),
                contentDescription = "cloudy-weather-3311758-2754892 1",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = (5).dp,
                        y = 20.dp)
                    .requiredWidth(width = 172.dp)
                    .requiredHeight(height = 139.dp)
            )

            Text(
                text = "Mostly Sunny",
                color = Color(0xffdedddd),
                fontSize = 12.sp,
                lineHeight = 1.42.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 50.dp, y = 0.dp)
            )


            Text(
                text = "Friday, 26 August 2022 | 10:00",
                color = Color(0xffdedddd),
                fontSize = 12.sp,
                fontWeight = FontWeight.Medium,
                lineHeight = 1.42.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = (12).dp, y = 250.dp)
            )

        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 10.dp,
                    y = 525.dp)
                .requiredWidth(width = 398.dp)
                .requiredHeight(height = 128.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 29.dp)
                    .requiredWidth(width = 398.dp)
                    .requiredHeight(height = 99.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 58.dp)
                        .requiredHeight(height = 99.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 58.dp)
                            .requiredHeight(height = 99.dp)
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(brush = Brush.linearGradient(
                                0f to Color(0xff957dcd),
                                1f to Color(0xff523d7f),
                                start = Offset(29f, 0f),
                                end = Offset(29f, 99f))))
                    Image(
                        painter = painterResource(id = R.drawable.cloudyweather331175827548921),
                        contentDescription = "cloudy-weather-3311758-2754892 2",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 11.dp,
                                y = 31.dp)
                            .requiredWidth(width = 37.dp)
                            .requiredHeight(height = 30.dp))
                    Text(
                        text = "10 AM",
                        color = Color(0xffdedddd),
                        fontSize = 12.sp,
                        lineHeight = 1.5.em,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 11.dp, y = 10.dp)
                    )


                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 20.dp,
                                y = 71.dp)
                            .requiredWidth(width = 17.dp)
                            .requiredHeight(height = 18.dp)
                    ) {
                        Text(
                            text = "23",
                            color = Color(0xffdedddd),
                            fontSize = 12.sp,
                            lineHeight = 1.5.em
                        )

                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 15.dp,
                                    y = 5.dp)
                                .requiredSize(size = 2.dp)
                                .clip(shape = CircleShape)
                                .border(border = BorderStroke(1.dp, Color(0xffdedddd)),
                                    shape = CircleShape))
                    }
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 68.dp,
                            y = 0.dp)
                        .requiredWidth(width = 58.dp)
                        .requiredHeight(height = 99.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 58.dp)
                            .requiredHeight(height = 99.dp)
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(brush = Brush.linearGradient(
                                0f to Color(0xff957dcd),
                                1f to Color(0xff523d7f),
                                start = Offset(29f, 0f),
                                end = Offset(29f, 99f))))
                    Text(
                        text = "12 AM",
                        color = Color(0xffdedddd),
                        fontSize = 12.sp,
                        lineHeight = 1.5.em,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 11.dp, y = 10.dp)
                    )

                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 20.dp,
                                y = 71.dp)
                            .requiredWidth(width = 17.dp)
                            .requiredHeight(height = 18.dp)
                    ) {
                        Text(
                            text = "23",
                            color = Color(0xffdedddd),
                            fontSize = 12.sp,
                            lineHeight = 1.5.em
                        )

                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 15.dp,
                                    y = 5.dp)
                                .requiredSize(size = 2.dp)
                                .clip(shape = CircleShape)
                                .border(border = BorderStroke(1.dp, Color(0xffdedddd)),
                                    shape = CircleShape))
                    }
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 204.dp,
                            y = 0.dp)
                        .requiredWidth(width = 58.dp)
                        .requiredHeight(height = 99.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 58.dp)
                            .requiredHeight(height = 99.dp)
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(brush = Brush.linearGradient(
                                0f to Color(0xff957dcd),
                                1f to Color(0xff523d7f),
                                start = Offset(29f, 0f),
                                end = Offset(29f, 99f))))
                    Image(
                        painter = painterResource(id = R.drawable.cloudrainandlightning544561745516111),
                        contentDescription = "cloud-rain-and-lightning-5445617-4551611 1",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 4.dp,
                                y = 25.dp)
                            .requiredSize(size = 51.dp))
                    Text(
                        text = "3 PM",
                        color = Color(0xffdedddd),
                        fontSize = 12.sp,
                        lineHeight = 1.5.em,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 14.dp, y = 10.dp)
                    )

                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 20.dp,
                                y = 71.dp)
                            .requiredWidth(width = 17.dp)
                            .requiredHeight(height = 18.dp)
                    ) {
                        Text(
                            text = "23",
                            color = Color(0xffdedddd),
                            fontSize = 12.sp,
                            lineHeight = 1.5.em
                        )

                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 15.dp,
                                    y = 5.dp)
                                .requiredSize(size = 2.dp)
                                .clip(shape = CircleShape)
                                .border(border = BorderStroke(1.dp, Color(0xffdedddd)),
                                    shape = CircleShape))
                    }
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 136.dp,
                            y = 0.dp)
                        .requiredWidth(width = 58.dp)
                        .requiredHeight(height = 99.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 58.dp)
                            .requiredHeight(height = 99.dp)
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(brush = Brush.linearGradient(
                                0f to Color(0xff957dcd),
                                1f to Color(0xff523d7f),
                                start = Offset(29f, 0f),
                                end = Offset(29f, 99f))))
                    Image(
                        painter = painterResource(id = R.drawable.rainyweather4034172333733602),
                        contentDescription = "rainy-weather-4034172-3337336@0 2",
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 11.dp,
                                y = 31.dp)
                            .requiredSize(size = 40.dp))
                    Text(
                        text = "1 PM",
                        color = Color(0xffdedddd),
                        fontSize = 12.sp,
                        lineHeight = 1.5.em,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 15.dp, y = 10.dp)
                    )

                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 20.dp,
                                y = 71.dp)
                            .requiredWidth(width = 17.dp)
                            .requiredHeight(height = 18.dp)
                    ) {
                        Text(
                            text = "23",
                            color = Color(0xffdedddd),
                            fontSize = 12.sp,
                            lineHeight = 1.5.em
                        )

                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 15.dp,
                                    y = 5.dp)
                                .requiredSize(size = 2.dp)
                                .clip(shape = CircleShape)
                                .border(border = BorderStroke(1.dp, Color(0xffdedddd)),
                                    shape = CircleShape))
                    }
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 272.dp,
                            y = 0.dp)
                        .requiredWidth(width = 58.dp)
                        .requiredHeight(height = 99.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 58.dp)
                            .requiredHeight(height = 99.dp)
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(brush = Brush.linearGradient(
                                0f to Color(0xff957dcd),
                                1f to Color(0xff523d7f),
                                start = Offset(29f, 0f),
                                end = Offset(29f, 99f))))
                    Image(
                        painter = painterResource(id = R.drawable.rain331175327548871),
                        contentDescription = "rain-3311753-2754887 1",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 9.dp,
                                y = 30.dp)
                            .requiredSize(size = 39.dp))
                    Text(
                        text = "5 PM",
                        color = Color(0xffdedddd),
                        fontSize = 12.sp,
                        lineHeight = 1.5.em,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 14.dp, y = 10.dp)
                    )

                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 20.dp,
                                y = 71.dp)
                            .requiredWidth(width = 17.dp)
                            .requiredHeight(height = 18.dp)
                    ) {
                        Text(
                            text = "23",
                            color = Color(0xffdedddd),
                            fontSize = 12.sp,
                            lineHeight = 1.5.em
                        )

                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 15.dp,
                                    y = 5.dp)
                                .requiredSize(size = 2.dp)
                                .clip(shape = CircleShape)
                                .border(border = BorderStroke(1.dp, Color(0xffdedddd)),
                                    shape = CircleShape))
                    }
                }
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 340.dp,
                            y = 0.dp)
                        .requiredWidth(width = 58.dp)
                        .requiredHeight(height = 99.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredWidth(width = 58.dp)
                            .requiredHeight(height = 99.dp)
                            .clip(shape = RoundedCornerShape(8.dp))
                            .background(brush = Brush.linearGradient(
                                0f to Color(0xff957dcd),
                                1f to Color(0xff523d7f),
                                start = Offset(29f, 0f),
                                end = Offset(29f, 99f))))
                    Image(
                        painter = painterResource(id = R.drawable.rain331175327548871),
                        contentDescription = "rain-3311753-2754887 2",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 9.dp,
                                y = 30.dp)
                            .requiredSize(size = 39.dp))
                    Text(
                        text = "10 PM",
                        color = Color(0xffdedddd),
                        fontSize = 12.sp,
                        lineHeight = 1.5.em,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 11.dp, y = 10.dp)
                    )

                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 20.dp,
                                y = 71.dp)
                            .requiredWidth(width = 17.dp)
                            .requiredHeight(height = 18.dp)
                    ) {
                        Text(
                            text = "23",
                            color = Color(0xffdedddd),
                            fontSize = 12.sp,
                            lineHeight = 1.5.em
                        )

                        Box(
                            modifier = Modifier
                                .align(alignment = Alignment.TopStart)
                                .offset(x = 15.dp,
                                    y = 5.dp)
                                .requiredSize(size = 2.dp)
                                .clip(shape = CircleShape)
                                .border(border = BorderStroke(1.dp, Color(0xffdedddd)),
                                    shape = CircleShape))
                    }
                }
            }

            Text(
                text = "Today",
                color = Color(0xffdedddd),
                fontSize = 12.sp,
                lineHeight = 1.5.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 8.dp, y = 0.dp)
            )


            Text(
                text = "7-Day Forecasts",
                color = Color(0xffdedddd),
                fontSize = 12.sp,
                lineHeight = 1.5.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 292.dp, y = 0.dp)
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
                fontSize = 12.sp,
                lineHeight = 1.5.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 3.dp, y = 0.0479736328125.dp)
            )

            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 28.0479736328125.dp)
                    .requiredWidth(width = 156.dp)
                    .requiredHeight(height = 50.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 50.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(brush = Brush.linearGradient(
                            0f to Color(0xff957dcd),
                            1f to Color(0xff523d7f),
                            start = Offset(78f, 0f),
                            end = Offset(78f, 50f))))
                Image(
                    painter = painterResource(id = R.drawable.sunny),
                    contentDescription = "sunny",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 10.dp,
                            y = 8.dp)
                        .requiredWidth(width = 37.dp)
                        .requiredHeight(height = 30.dp)
                        .rotate(degrees = -180f))

                Text(
                    text = "Delhi",
                    color = Color.White,
                    fontSize = 14.sp,
                    lineHeight = 1.07.em,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 57.dp, y = 8.dp)
                )


                Text(
                    text = "9",
                    color = Color.White,
                    fontSize = 16.sp,
                    lineHeight = 0.94.em,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 130.dp, y = 18.dp)
                )


                Text(
                    text = "Sunny",
                    color = Color(0xffdedddd),
                    fontSize = 10.sp,
                    lineHeight = 1.3.em,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 57.dp, y = 28.dp)
                )

                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 140.dp,
                            y = 18.dp)
                        .requiredSize(size = 4.dp)
                        .clip(shape = CircleShape)
                        .border(border = BorderStroke(1.dp, Color.White),
                            shape = CircleShape))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 166.dp,
                        y = 28.0479736328125.dp)
                    .requiredWidth(width = 156.dp)
                    .requiredHeight(height = 50.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 50.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(brush = Brush.linearGradient(
                            0f to Color(0xff957dcd),
                            1f to Color(0xff523d7f),
                            start = Offset(78f, 0f),
                            end = Offset(78f, 50f))))
                Image(
                    painter = painterResource(id = R.drawable.snow),
                    contentDescription = "snow",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 10.dp,
                            y = 6.dp)
                        .requiredSize(size = 40.dp))

                Text(
                    text = "Kolkata",
                    color = Color.White,
                    fontSize = 14.sp,
                    lineHeight = 1.07.em,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 57.dp, y = 8.dp)
                )


                Text(
                    text = "9",
                    color = Color.White,
                    fontSize = 16.sp,
                    lineHeight = 0.94.em,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 130.dp, y = 18.dp)
                )


                Text(
                    text = "Snowy",
                    color = Color(0xffdedddd),
                    fontSize = 10.sp,
                    lineHeight = 1.3.em,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 57.dp, y = 28.dp)
                )

                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 140.dp,
                            y = 18.dp)
                        .requiredSize(size = 4.dp)
                        .clip(shape = CircleShape)
                        .border(border = BorderStroke(1.dp, Color.White),
                            shape = CircleShape))
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 332.dp,
                        y = 28.0479736328125.dp)
                    .requiredWidth(width = 156.dp)
                    .requiredHeight(height = 50.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredWidth(width = 156.dp)
                        .requiredHeight(height = 50.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(brush = Brush.linearGradient(
                            0f to Color(0xff957dcd),
                            1f to Color(0xff523d7f),
                            start = Offset(78f, 0f),
                            end = Offset(78f, 50f))))
                Image(
                    painter = painterResource(id = R.drawable.rain331175327548871),
                    contentDescription = "rain-3311753-2754887 1",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 10.dp,
                            y = 6.dp)
                        .requiredSize(size = 39.dp))

                Text(
                    text = "Haydrabad",
                    color = Color.White,
                    fontSize = 14.sp,
                    lineHeight = 1.07.em,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 57.dp, y = 8.dp)
                )


                Text(
                    text = "9",
                    color = Color.White,
                    fontSize = 16.sp,
                    lineHeight = 0.94.em,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 130.dp, y = 18.dp)
                )


                Text(
                    text = "Rainy",
                    color = Color(0xffdedddd),
                    fontSize = 10.sp,
                    lineHeight = 1.3.em,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 57.dp, y = 28.dp)
                )

                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 140.dp,
                            y = 18.dp)
                        .requiredSize(size = 4.dp)
                        .clip(shape = CircleShape)
                        .border(border = BorderStroke(1.dp, Color.White),
                            shape = CircleShape))
            }
            Image(
                painter = painterResource(id = R.drawable.plus),
                contentDescription = "plus",
                colorFilter = ColorFilter.tint(Color(0xffdedddd)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 350.dp,
                        y = 0.dp)
                    .requiredSize(size = 20.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 60.dp,
                    y = 400.dp)
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
        Image(
            painter = painterResource(id = R.drawable.rainyweather4034172333733602),
            contentDescription = "rainy-weather-4034172-3337336@0 1",
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (87).dp,
                    y = 585.dp)
                .requiredSize(size = 40.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 50.dp,
                    y = 772.dp)
                .requiredWidth(width = 312.dp)
                .requiredHeight(height = 50.dp)
        )
    }
        }
    }