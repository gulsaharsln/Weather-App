package com.example.weatherapp.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.compose.material.Icon
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Brush
import com.example.weatherapp.R


@Composable
fun CustomBottomNavigationBar(navController: NavHostController) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(
                brush = Brush.linearGradient(
                    colors = listOf(
                        Color(0xFF957DCD),
                        Color(0xFF523D7F)
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 0.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            NavigationIcon(NavigationItem.Home.icon, NavigationItem.Home.title, navController, NavigationItem.Home.route)
            NavigationIcon(NavigationItem.Search.icon, NavigationItem.Search.title, navController, NavigationItem.Search.route)
            NavigationIcon(NavigationItem.Details.icon, NavigationItem.Details.title, navController, NavigationItem.Details.route)
            NavigationIcon(NavigationItem.Feedback.icon, NavigationItem.Feedback.title, navController, NavigationItem.Feedback.route)
        }
    }
}


@Composable
fun NavigationIcon(
    iconRes: Int,
    contentDescription: String,
    navController: NavHostController,
    route: String
) {
    IconButton(
        onClick = {
            navController.navigate(route) {
                launchSingleTop = true
                restoreState = true
            }
        }
    ) {
        Icon(
            painter = painterResource(id = iconRes),
            contentDescription = contentDescription,
            tint = Color(0xFFDEDDDD),
            modifier = Modifier.size(24.dp)
        )
    }
}


sealed class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home : NavigationItem("home", R.drawable.home, "Home")
    object Search : NavigationItem("search", R.drawable.magnify, "Search")
    object Details : NavigationItem("details", R.drawable.account, "Details")
    object Feedback : NavigationItem("feedback", R.drawable.belloutline, "Feedback")
}
