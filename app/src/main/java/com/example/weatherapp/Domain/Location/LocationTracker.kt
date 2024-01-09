package com.example.weatherapp.Domain.Location

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}