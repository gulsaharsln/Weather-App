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
                    y = (-150).dp)
                .requiredWidth(width = 493.dp)
                .requiredHeight(height = 1031.dp))


        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = (-200).dp,
                    y = 0.dp)

        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 35.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredSize(size = 35.dp)
                        .clip(shape = RoundedCornerShape(5.dp))
                        .background(color = Color.White.copy(alpha = 0.3f)))
                Box(
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 9.72222900390625.dp,
                            y = 9.722244262695312.dp)
                        .requiredSize(size = 16.dp)
                ) {
                    Box(
                        modifier = Modifier
                            .requiredSize(size = 6.dp)
                            .clip(shape = RoundedCornerShape(1.dp))
                            .background(color = Color.White))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 0.dp,
                                y = 9.722213745117188.dp)
                            .requiredSize(size = 6.dp)
                            .clip(shape = RoundedCornerShape(1.dp))
                            .background(color = Color.White))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 9.722213745117188.dp,
                                y = 0.dp)
                            .requiredSize(size = 6.dp)
                            .clip(shape = RoundedCornerShape(1.dp))
                            .background(color = Color.White))
                    Box(
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 9.722198486328125.dp,
                                y = 9.722213745117188.dp)
                            .requiredSize(size = 6.dp)
                            .clip(shape = RoundedCornerShape(1.dp))
                            .background(color = Color.White))
                }
            }
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 352.dp,
                        y = 0.dp)
                    .requiredSize(size = 35.dp)
            ) {
                Box(
                    modifier = Modifier
                        .requiredSize(size = 35.dp)
                        .clip(shape = RoundedCornerShape(5.dp))
                        .background(color = Color.White.copy(alpha = 0.3f))
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.refresh),
                        contentDescription = "refresh",
                        colorFilter = ColorFilter.tint(Color.White),
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 5.8333282470703125.dp, y = 5.833320617675781.dp)
                            .requiredSize(size = 23.dp)
                    )

                    Text(
                        text = "Surat",
                        color = Color.White,
                        fontSize = 14.sp,
                        lineHeight = 20.sp,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = 177.dp, y = 10.dp)
                    )

                }

                Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 120.dp,
                    y = 106.dp)
                .requiredWidth(width = 176.dp)
                .requiredHeight(height = 305.dp)
        ) {
            Box(
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = (-20).dp,
                        y = 220.dp)
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
                    .offset(x = (-70).dp,
                        y = 100.dp)
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
                            .offset(x = 47.dp, y = 0.dp)
                    )


                    Text(
                        text = "Friday, 26 August 2022 | 10:00",
                        color = Color(0xffdedddd),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Medium,
                        lineHeight = 1.42.em,
                        modifier = Modifier
                            .align(alignment = Alignment.TopStart)
                            .offset(x = (-60).dp, y = 320.dp)
                    )

                }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 40.dp,
                    y = 555.dp)
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
                    .offset(x = 5.dp, y = 0.dp)
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
                .offset(x = 15.dp,
                    y = 713.dp)
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
                    .offset(x = 0.dp, y = 0.0479736328125.dp)
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
                    painter = painterResource(id = R.drawable.cloudyweather331175827548921),
                    contentDescription = "cloudy-weather-3311758-2754892 3",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .align(alignment = Alignment.TopStart)
                        .offset(x = 10.dp,
                            y = 10.dp)
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
                    painter = painterResource(id = R.drawable.rainyweather4034172333733602),
                    contentDescription = "rainy-weather-4034172-3337336@0 3",
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
                    .offset(x = 367.dp,
                        y = 0.dp)
                    .requiredSize(size = 20.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 40.dp,
                    y = 430.dp)
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
                .offset(x = (-60).dp,
                    y = 571.dp)
                .requiredSize(size = 44.dp))
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 47.dp,
                    y = 822.dp)
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
    } } } }



