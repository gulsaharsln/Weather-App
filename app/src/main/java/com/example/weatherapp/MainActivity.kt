package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.weatherapp.ui.theme.WeatherAppTheme
import androidx.navigation.compose.rememberNavController
import com.example.weatherapp.Screens.HomeScreen
import com.example.weatherapp.Screens.CustomBottomNavigationBar
import com.example.weatherapp.Screens.DetailsScreen
import com.example.weatherapp.Screens.FeedbackScreen
import com.example.weatherapp.Screens.NavigationItem
import com.example.weatherapp.Screens.SearchingScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                //WeatherAppNavigation()
                HomeScreen()
            }
        }
    }
}


@Composable
fun WeatherAppNavigation() {
    val navController = rememberNavController()

    Scaffold(
        bottomBar = { CustomBottomNavigationBar(navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = NavigationItem.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(NavigationItem.Home.route) { HomeScreen() }
            composable(NavigationItem.Search.route) { SearchingScreen()
            }
            composable(NavigationItem.Details.route) { DetailsScreen() }
            composable(NavigationItem.Feedback.route) { FeedbackScreen() }
        }
    }
}


