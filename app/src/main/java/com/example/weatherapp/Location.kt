// LocationUtils.kt

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.location.Geocoder
import android.location.Location
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import com.google.android.gms.location.*
import java.io.IOException
import java.util.*

fun getCurrentLocation(activity: ComponentActivity): Location? {
    var location: Location? = null

    val fusedLocationClient = LocationServices.getFusedLocationProviderClient(activity)

    // Check for location permissions
    if (ActivityCompat.checkSelfPermission(
            activity,
            Manifest.permission.ACCESS_FINE_LOCATION
        ) == PackageManager.PERMISSION_GRANTED
    ) {
        // Request location updates
        val locationRequest = LocationRequest.create().apply {
            priority = LocationRequest.PRIORITY_HIGH_ACCURACY
            interval = 10000 // 10 seconds
            fastestInterval = 5000 // 5 seconds
        }

        val locationCallback = object : LocationCallback() {
            override fun onLocationResult(locationResult: LocationResult) {
                super.onLocationResult(locationResult)
                location = locationResult.lastLocation
            }
        }

        val requestLocationPermissionLauncher =
            activity.registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted: Boolean ->
                if (isGranted) {
                    // Permission is granted, request location updates
                    fusedLocationClient.requestLocationUpdates(
                        locationRequest,
                        locationCallback,
                        Looper.getMainLooper()
                    )
                }
            }

        // Check if location permission is granted
        if (ActivityCompat.checkSelfPermission(
                activity,
                Manifest.permission.ACCESS_FINE_LOCATION
            ) == PackageManager.PERMISSION_GRANTED
        ) {
            // Permission is already granted, request location updates
            fusedLocationClient.requestLocationUpdates(
                locationRequest,
                locationCallback,
                Looper.getMainLooper()
            )
        } else {
            // Permission is not granted, request it
            requestLocationPermissionLauncher.launch(Manifest.permission.ACCESS_FINE_LOCATION)
        }
    }

    return location
}
fun getLocationCityName(context: Context, location: Location): String {
    val geocoder = Geocoder(context, Locale.getDefault())

    try {
        val addresses = geocoder.getFromLocation(location.latitude, location.longitude, 1)
        if (addresses != null) {
            if (addresses.isNotEmpty()) {
                return addresses[0]?.locality ?: "N/A"
            }
        }
    } catch (e: IOException) {
        e.printStackTrace()
    }

    return "N/A"
}