package com.example.weatherapp

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.text.TextStyle
import androidx.compose.material.Typography

class AppFontFamily {
    val openSansFamily = FontFamily(Font(R.font.opensans_regular))
}

class AppTypography {
    companion object {
        val h1 = TextStyle(
            fontFamily = FontFamily(Font(R.font.opensans_regular)),
            fontWeight = FontWeight.Medium,
            fontSize = 50.sp
        )

        val h2 = TextStyle(
            fontFamily = FontFamily(Font(R.font.opensans_regular)),
            fontWeight = FontWeight.Bold,
            fontSize = 28.sp
        )

        val h3 = TextStyle(
            fontFamily = FontFamily(Font(R.font.opensans_regular)),
            fontWeight = FontWeight.Normal,
            fontSize = 14.sp
        )

        val h4 = TextStyle(
            fontFamily = FontFamily(Font(R.font.opensans_regular)),
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        )

        val h5 = TextStyle(
            fontFamily = FontFamily(Font(R.font.opensans_regular)),
            fontWeight = FontWeight.Normal,
            fontSize = 10.sp
        )

        val h6 = TextStyle(
            fontFamily = FontFamily(Font(R.font.opensans_regular)),
            fontWeight = FontWeight.Normal,
            fontSize = 12.sp
        )

        val h7 = TextStyle(
            fontFamily = FontFamily(Font(R.font.opensans_regular)),
            fontWeight = FontWeight.Normal,
            fontSize = 18.sp
        )

        val h8 = TextStyle(
            fontFamily = FontFamily(Font(R.font.opensans_regular)),
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )

        val h9 = TextStyle(
            fontFamily = FontFamily(Font(R.font.opensans_regular)),
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp
        )


        val h10 = TextStyle(
            fontFamily = FontFamily(Font(R.font.opensans_regular)),
            fontWeight = FontWeight.Bold,
            fontSize = 18.sp
        )


        val caption = TextStyle(
            fontFamily = FontFamily(Font(R.font.opensans_regular)),
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp
        )
    }
}
