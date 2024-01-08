package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.weatherapp.ui.theme.WeatherAppTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
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
import java.time.format.TextStyle
import androidx.compose.material3.Text
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.PreviewParameter


@Preview
@Composable
private fun HomeScreenPreview() {
    HomeScreen(Modifier.fillMaxSize()) // or any other modifier that fits your layout
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(android.graphics.Color.parseColor("#85b5c9"))
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
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
                    text = "23",
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
                        lineHeight = 1.5.em, // Adjust the value as needed
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
                            lineHeight = 1.5.em // Adjust the value as needed
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
                        lineHeight = 1.5.em, // Adjust the value as needed
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
                        lineHeight = 1.5.em, // Adjust the value as needed
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
                            lineHeight = 1.5.em // Adjust the value as needed
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
                        lineHeight = 1.5.em, // Adjust the value as needed
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
                            lineHeight = 1.5.em // Adjust the value as needed
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
                        lineHeight = 1.5.em, // Adjust the value as needed
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
                            lineHeight = 1.5.em // Adjust the value as needed
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
                        lineHeight = 1.5.em, // Adjust the value as needed
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
                            lineHeight = 1.5.em // Adjust the value as needed
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
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 50.dp)
                    .clip(shape = RoundedCornerShape(topStart = 22.dp, topEnd = 21.dp))
                    .background(brush = Brush.linearGradient(
                        0f to Color(0xff957dcd),
                        1f to Color(0xff523d7f),
                        start = Offset(25f, 0f),
                        end = Offset(25f, 50f))))
            Image(
                painter = painterResource(id = R.drawable.home),
                contentDescription = "home",
                colorFilter = ColorFilter.tint(Color(0xffdedddd)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 12.dp,
                        y = 15.dp)
                    .requiredSize(size = 24.dp))
            Image(
                painter = painterResource(id = R.drawable.magnify),
                contentDescription = "magnify",
                colorFilter = ColorFilter.tint(Color(0xffdedddd)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 104.dp,
                        y = 15.dp)
                    .requiredSize(size = 24.dp))
            Image(
                painter = painterResource(id = R.drawable.account),
                contentDescription = "account",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 196.dp,
                        y = 15.dp)
                    .requiredSize(size = 24.dp))
            Image(
                painter = painterResource(id = R.drawable.belloutline),
                contentDescription = "bell-outline",
                colorFilter = ColorFilter.tint(Color(0xffdedddd)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 288.dp,
                        y = 15.dp)
                    .requiredSize(size = 24.dp))
        }
    } }

@Composable
fun Searching(modifier: Modifier = Modifier) {
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
                .requiredHeight(height = 1031.dp)
                .graphicsLayer(alpha = 0.5f))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 10.dp)
                .requiredWidth(width = 387.dp)
                .requiredHeight(height = 16.dp)
        ) {

            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 330.dp,
                        y = 0.dp)
                    .requiredWidth(width = 57.dp)
                    .requiredHeight(height = 16.dp)
            )
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 65.dp)
                .requiredSize(size = 35.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.arrowleftthin),
                contentDescription = "arrow-left-thin",
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 6.dp,
                        y = 25.dp)
                    .requiredSize(size = 24.dp))
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
                        .background(color = Color.White.copy(alpha = 0.3f)))
            }
        }
        Text(
            text = "Search for City",
            color = Color.White,
            fontSize = 18.sp,
            lineHeight = 0.67.em,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 151.dp, y = 92.dp)
        )

        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 197.dp)
                .requiredWidth(width = 394.dp)
                .requiredHeight(height = 114.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 17.dp)
                    .requiredWidth(width = 321.dp)
                    .requiredHeight(height = 90.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(brush = Brush.linearGradient(
                        0f to Color(0xff957dcd),
                        1f to Color(0xff523d7f),
                        start = Offset(160.5f, 0f),
                        end = Offset(160.5f, 90f))))
            Image(
                painter = painterResource(id = R.drawable.cloudyweather331175827548921),
                contentDescription = "cloudy-weather-3311758-2754892 2",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 249.dp,
                        y = 0.dp)
                    .requiredWidth(width = 145.dp)
                    .requiredHeight(height = 114.dp))

            Text(
                text = "Surat",
                color = Color.White,
                fontSize = 20.sp,
                lineHeight = 0.6.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 34.dp, y = 46.dp)
            )


            Text(
                text = "Cloudy",
                color = Color.White.copy(alpha = 0.7f),
                fontSize = 14.sp,
                lineHeight = 0.86.em,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 34.dp, y = 71.dp)
            )

        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 322.dp)
                .requiredWidth(width = 402.dp)
                .requiredHeight(height = 146.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 26.dp)
                    .requiredWidth(width = 321.dp)
                    .requiredHeight(height = 90.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(brush = Brush.linearGradient(
                        0f to Color(0xff957dcd),
                        1f to Color(0xff523d7f),
                        start = Offset(160.5f, 0f),
                        end = Offset(160.5f, 90f))))
            Image(
                painter = painterResource(id = R.drawable.rainyweather),
                contentDescription = "rainy-weather-4034172-3337336@0 1",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 256.dp,
                        y = 0.dp)
                    .requiredSize(size = 146.dp))

            Text(
                text = "Mumbai",
                color = Color.White,
                fontSize = 20.sp,
                lineHeight = 0.6.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 32.dp, y = 55.dp)
            )


            Text(
                text = "Rainy",
                color = Color.White.copy(alpha = 0.7f),
                fontSize = 14.sp,
                lineHeight = 0.86.em,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 32.dp, y = 80.dp)
            )

        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 477.dp)
                .requiredWidth(width = 387.dp)
                .requiredHeight(height = 117.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 14.dp)
                    .requiredWidth(width = 321.dp)
                    .requiredHeight(height = 90.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(brush = Brush.linearGradient(
                        0f to Color(0xff957dcd),
                        1f to Color(0xff523d7f),
                        start = Offset(160.5f, 0f),
                        end = Offset(160.5f, 90f))))
            Image(
                painter = painterResource(id = R.drawable.rain),
                contentDescription = "rain-3311753-2754887 1",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 270.dp,
                        y = 0.dp)
                    .requiredSize(size = 117.dp))

            Text(
                text = "Chennai",
                color = Color.White,
                fontSize = 20.sp,
                lineHeight = 0.6.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 32.dp, y = 43.dp)
            )


            Text(
                text = "Cold",
                color = Color.White.copy(alpha = 0.7f),
                fontSize = 14.sp,
                lineHeight = 0.86.em,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 32.dp, y = 68.dp)
            )

        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 607.dp)
                .requiredWidth(width = 398.dp)
                .requiredHeight(height = 138.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 21.dp)
                    .requiredWidth(width = 321.dp)
                    .requiredHeight(height = 90.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(brush = Brush.linearGradient(
                        0f to Color(0xff957dcd),
                        1f to Color(0xff523d7f),
                        start = Offset(160.5f, 0f),
                        end = Offset(160.5f, 90f))))
            Image(
                painter = painterResource(id = R.drawable.rainyweather),
                contentDescription = "rainy-weather-4034172-3337336@0 3",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 260.dp,
                        y = 0.dp)
                    .requiredSize(size = 138.dp))

            Text(
                text = "Manali",
                color = Color.White,
                fontSize = 20.sp,
                lineHeight = 0.6.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 32.dp, y = 50.dp)
            )


            Text(
                text = "Snowy",
                color = Color.White.copy(alpha = 0.7f),
                fontSize = 14.sp,
                lineHeight = 0.86.em,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 32.dp, y = 75.dp)
            )

        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 138.dp)
                .requiredWidth(width = 335.dp)
                .requiredHeight(height = 38.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredWidth(width = 335.dp)
                    .requiredHeight(height = 38.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(brush = Brush.linearGradient(
                        0f to Color(0xff957dcd),
                        1f to Color(0xff523d7f),
                        start = Offset(167.5f, 0f),
                        end = Offset(167.5f, 38f))))
            Text(
                lineHeight = 1.sp,
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(
                        color = Color.White,
                        fontSize = 15.sp)
                    ) {append("Bang")}
                    withStyle(style = SpanStyle(
                        color = Color(0xffa4a4a4),
                        fontSize = 15.sp)) {append("alore")}},
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 49.dp,
                        y = 10.dp))
            Image(
                painter = painterResource(id = R.drawable.magnify),
                contentDescription = "magnify",
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 16.dp,
                        y = 11.dp)
                    .requiredSize(size = 16.dp))
        }
        IconButton(
            onClick = { },
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 364.dp,
                    y = 132.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 38.dp)

            ) {
                Box(
                    modifier = Modifier
                        .requiredSize(size = 38.dp)
                        .clip(shape = RoundedCornerShape(50.dp))
                        .background(brush = Brush.linearGradient(
                            0f to Color(0xff957dcd),
                            1f to Color(0xff523d7f),
                            start = Offset(19f, 0f),
                            end = Offset(19f, 38f))))
                Image(
                    painter = painterResource(id = R.drawable.location),
                    contentDescription = "Location on",
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 8.dp,
                            y = 8.dp)
                        .requiredSize(size = 22.dp))
            }
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 50.dp,
                    y = 772.dp)
                .requiredWidth(width = 300.dp)
                .requiredHeight(height = 50.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 79.dp,
                        y = 0.dp)
                    .requiredSize(size = 50.dp)
                    .clip(shape = RoundedCornerShape(topStart = 22.dp, topEnd = 21.dp))
                    .background(brush = Brush.linearGradient(
                        0f to Color(0xff957dcd),
                        1f to Color(0xff523d7f),
                        start = Offset(25f, 0f),
                        end = Offset(25f, 50f))))
            Image(
                painter = painterResource(id = R.drawable.home),
                contentDescription = "home",
                colorFilter = ColorFilter.tint(Color(0xffdedddd)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 15.dp)
                    .requiredSize(size = 24.dp))
            Image(
                painter = painterResource(id = R.drawable.magnify),
                contentDescription = "magnify",
                colorFilter = ColorFilter.tint(Color(0xffdedddd)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 92.dp,
                        y = 15.dp)
                    .requiredSize(size = 24.dp))
            Image(
                painter = painterResource(id = R.drawable.account),
                contentDescription = "account",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 184.dp,
                        y = 15.dp)
                    .requiredSize(size = 24.dp))
            Image(
                painter = painterResource(id = R.drawable.belloutline),
                contentDescription = "bell-outline",
                colorFilter = ColorFilter.tint(Color(0xffdedddd)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 276.dp,
                        y = 15.dp)
                    .requiredSize(size = 24.dp))
        }
    }
}

@Preview(widthDp = 417, heightDp = 872)
@Composable
private fun SearchingPreview() {
    Searching(Modifier)
}

@Composable
fun DetailsScreen(modifier: Modifier = Modifier) {
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
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 10.dp)
                .requiredWidth(width = 387.dp)
                .requiredHeight(height = 16.dp)
        )

        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 67.dp)
                .requiredSize(size = 35.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.arrowleftthin),
                contentDescription = "arrow-left-thin",
                colorFilter = ColorFilter.tint(Color.White),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 6.dp,
                        y = 5.dp)
                    .requiredSize(size = 24.dp))
            Box(
                modifier = Modifier
                    .requiredSize(size = 35.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredSize(size = 35.dp)
                        .clip(shape = RoundedCornerShape(5.dp))
                        .background(color = Color.White.copy(alpha = 0.3f)))
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
        )

        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 59.dp,
                    y = 772.dp)
                .requiredWidth(width = 300.dp)
                .requiredHeight(height = 50.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 79.dp,
                        y = 0.dp)
                    .requiredSize(size = 50.dp)
                    .clip(shape = RoundedCornerShape(topStart = 22.dp, topEnd = 21.dp))
                    .background(brush = Brush.linearGradient(
                        0f to Color(0xff957dcd),
                        1f to Color(0xff523d7f),
                        start = Offset(25f, 0f),
                        end = Offset(25f, 50f))))
            Image(
                painter = painterResource(id = R.drawable.home),
                contentDescription = "home",
                colorFilter = ColorFilter.tint(Color(0xffdedddd)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 0.dp,
                        y = 15.dp)
                    .requiredSize(size = 24.dp))
            Image(
                painter = painterResource(id = R.drawable.magnify),
                contentDescription = "magnify",
                colorFilter = ColorFilter.tint(Color(0xffdedddd)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 92.dp,
                        y = 15.dp)
                    .requiredSize(size = 24.dp))
            Image(
                painter = painterResource(id = R.drawable.account),
                contentDescription = "account",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 184.dp,
                        y = 15.dp)
                    .requiredSize(size = 24.dp))
            Image(
                painter = painterResource(id = R.drawable.belloutline),
                contentDescription = "bell-outline",
                colorFilter = ColorFilter.tint(Color(0xffdedddd)),
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 276.dp,
                        y = 15.dp)
                    .requiredSize(size = 24.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 118.dp)
                .requiredWidth(width = 387.dp)
                .requiredHeight(height = 255.dp)
                .clip(shape = RoundedCornerShape(15.dp))
                .background(brush = Brush.linearGradient(
                    0f to Color(0xff957dcd),
                    1f to Color(0xff523d7f),
                    start = Offset(193.5f, 0f),
                    end = Offset(193.5f, 255f))))
        Image(
            painter = painterResource(id = R.drawable.cloudyweather331175827548921),
            contentDescription = "cloudy-weather-3311758-2754892 2",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 36.dp,
                    y = 124.dp)
                .requiredWidth(width = 169.dp)
                .requiredHeight(height = 132.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 241.dp,
                    y = 138.dp)
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
                    .offset(x = 68.99995437264442.dp,
                        y = 38.dp)
                    .requiredWidth(width = 35.dp)
                    .rotate(degrees = 109.65f))
            Text(
                text = "23",
                color = Color.White,
                fontSize = 55.sp,
                lineHeight = 1.45.em
            )

            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 65.dp,
                        y = 11.dp)
                    .requiredSize(size = 10.dp)
                    .clip(shape = CircleShape)
                    .border(border = BorderStroke(2.dp, Color.White),
                        shape = CircleShape))
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 128.dp,
                        y = 25.dp)
                    .requiredSize(size = 8.dp)
                    .clip(shape = CircleShape)
                    .border(border = BorderStroke(1.dp, Color.White),
                        shape = CircleShape))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 58.dp,
                    y = 283.dp)
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
                    .offset(x = 128.dp,
                        y = 0.dp)
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
                    .offset(x = 233.dp,
                        y = 0.dp)
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
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 412.dp)
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
                    .offset(x = 127.dp,
                        y = 0.dp)
                    .requiredWidth(width = 51.dp)
                    .requiredHeight(height = 40.dp))


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
                text = "+31",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 307.dp, y = 10.dp)
            )


            Text(
                text = "+51",
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
                .offset(x = 15.dp,
                    y = 467.dp)
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
                    .offset(x = 127.dp,
                        y = 0.dp)
                    .requiredSize(size = 50.dp))

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
                text = "+31",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 307.dp, y = 14.dp)
            )


            Text(
                text = "+51",
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
                .offset(x = 15.dp,
                    y = 520.dp)
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
                    .offset(x = 125.dp,
                        y = 0.dp)
                    .requiredSize(size = 57.dp))

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
                text = "+31",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 307.dp, y = 20.dp)
            )


            Text(
                text = "+51",
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
                .offset(x = 15.dp,
                    y = 580.dp)
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
                    .offset(x = 125.dp,
                        y = 0.dp)
                    .requiredSize(size = 57.dp))
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
                text = "+31",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 307.dp, y = 19.dp)
            )
            Text(
                text = "+51",
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
                .offset(x = 15.dp,
                    y = 644.dp)
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
                    .offset(x = 134.dp,
                        y = 0.dp)
                    .requiredSize(size = 45.dp))
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
                text = "+31",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 307.dp, y = 14.dp)
            )
            Text(
                text = "+51",
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
                .offset(x = 15.dp,
                    y = 703.dp)
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
                    .offset(x = 135.dp,
                        y = 0.dp)
                    .requiredSize(size = 45.dp))
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
                text = "+31",
                color = Color.White,
                fontSize = 16.sp,
                fontWeight = FontWeight.Medium,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 307.dp, y = 14.dp)
            )

            Text(
                text = "+51",
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

@Preview(widthDp = 417, heightDp = 872)
@Composable
private fun DetailsScreenPreview() {
    DetailsScreen(Modifier)
}
