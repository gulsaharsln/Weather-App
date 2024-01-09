package com.example.weatherapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.graphics.graphicsLayer



@Composable
fun FeedbackScreen(modifier: Modifier = Modifier) {
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
                .offset(x = 15.dp,
                    y = 10.dp)
                .requiredWidth(width = 387.dp)
                .requiredHeight(height = 16.dp)
        )
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
            text = "Feedback",
            color = Color.White,
            fontSize = 18.sp,
            lineHeight = 0.67.em,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 164.dp, y = 78.dp)
                .padding(top = 16.dp)
        )
        Text(
            text = "Your feedback can help everyone see more \naccurate weather conditions!",
            color = Color.White,
            fontSize = 16.sp,
            lineHeight = 1.38.em,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp, y = 116.dp)
                .padding(top = 16.dp)
        )

        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 59.dp,
                    y = 772.dp)
                .requiredWidth(width = 300.dp)
                .requiredHeight(height = 50.dp)
        )
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 180.dp)
                .requiredWidth(width = 100.dp)
                .requiredHeight(height = 132.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 100.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xff030303).copy(alpha = 0.23f)))
            Image(
                painter = painterResource(id = R.drawable.sunny),
                contentDescription = "sunny",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 22.dp,
                        y = 23.dp)
                    .requiredWidth(width = 57.dp)
                    .requiredHeight(height = 53.dp))
            Text(
                text = "Sunny",
                color = Color.White,
                fontSize = 16.sp,
                lineHeight = 0.75.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 25.dp, y = 120.dp)
            )


        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 155.dp,
                    y = 180.dp)
                .requiredWidth(width = 100.dp)
                .requiredHeight(height = 132.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 100.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xff030303).copy(alpha = 0.23f)))
            Text(
                text = "Cloudy",
                color = Color.White,
                fontSize = 16.sp,
                lineHeight = 0.75.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 21.dp, y = 120.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.rainyweather),
                contentDescription = "rainy-weather-4034172-3337336@0 2",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 16.dp,
                        y = 15.dp)
                    .requiredSize(size = 69.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 155.dp,
                    y = 352.dp)
                .requiredWidth(width = 100.dp)
                .requiredHeight(height = 132.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 100.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xff030303).copy(alpha = 0.23f)))
            Text(
                text = "Storm",
                color = Color.White,
                fontSize = 16.sp,
                lineHeight = 0.75.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 26.dp, y = 120.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.storm),
                contentDescription = "rainy-weather-4034172-3337336@0 2",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 10.dp,
                        y = 9.dp)
                    .requiredSize(size = 81.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 352.dp)
                .requiredWidth(width = 100.dp)
                .requiredHeight(height = 132.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 100.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xff030303).copy(alpha = 0.23f)))
            Text(
                text = "Snow",
                color = Color.White,
                fontSize = 16.sp,
                lineHeight = 0.75.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 28.dp, y = 120.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.snow),
                contentDescription = "rainy-weather-4034172-3337336@0 2",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 12.dp,
                        y = 11.dp)
                    .requiredSize(size = 77.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 295.dp,
                    y = 180.dp)
                .requiredWidth(width = 100.dp)
                .requiredHeight(height = 132.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 100.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xff030303).copy(alpha = 0.23f)))
            Text(
                text = "Rain",
                color = Color.White,
                fontSize = 16.sp,
                lineHeight = 0.75.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 32.dp, y = 120.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.rain),
                contentDescription = "rainy-weather-4034172-3337336@0 2",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 16.dp,
                        y = 15.dp)
                    .requiredSize(size = 69.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 295.dp,
                    y = 352.dp)
                .requiredWidth(width = 100.dp)
                .requiredHeight(height = 132.dp)
        ) {
            Box(
                modifier = Modifier
                    .requiredSize(size = 100.dp)
                    .clip(shape = CircleShape)
                    .background(color = Color(0xff030303).copy(alpha = 0.23f)))
            Text(
                text = "Thunder",
                color = Color.White,
                fontSize = 16.sp,
                lineHeight = 0.75.em,
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 16.dp, y = 120.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.cloudrainandlightning544561745516111),
                contentDescription = "rainy-weather-4034172-3337336@0 2",
                modifier = Modifier
                    .align(alignment = Alignment.TopStart)
                    .offset(x = 8.dp,
                        y = 7.dp)
                    .requiredSize(size = 85.dp))
        }
        Box(
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 15.dp,
                    y = 715.dp)
                .requiredWidth(width = 387.dp)
                .requiredHeight(height = 41.dp)
                .clip(shape = RoundedCornerShape(100.dp))
                .background(brush = Brush.linearGradient(
                    0f to Color(0xff957dcd),
                    1f to Color(0xff523d7f),
                    start = Offset(193.5f, 0f),
                    end = Offset(193.5f, 41f))))
        Text(
            text = "Submit",
            color = Color.White,
            fontSize = 16.sp,
            lineHeight = 0.75.em,
            modifier = Modifier
                .align(alignment = Alignment.TopStart)
                .offset(x = 180.dp, y = 722.dp)
        )

    }
}

@Preview(widthDp = 417, heightDp = 872)
@Composable
private fun FeedbackPreview() {
    FeedbackScreen(Modifier)
}