package com.example.vijsu.geofencingsample;

import com.google.android.gms.maps.model.LatLng;

import java.util.HashMap;

/**
 * Created by vijsu on 20-01-2016.
 */
public class Constants {
    private Constants() {
    }

    public static final String PACKAGE_NAME = "com.google.android.gms.location.Geofence";

    public static final String SHARED_PREFERENCES_NAME = PACKAGE_NAME + ".SHARED_PREFERENCES_NAME";

    public static final String GEOFENCES_ADDED_KEY = PACKAGE_NAME + ".GEOFENCES_ADDED_KEY";

    /**
     * Used to set an expiration time for a geofence. After this amount of time Location Services
     * stops tracking the geofence.
     */
    public static final long GEOFENCE_EXPIRATION_IN_HOURS = 12;

    /**
     * For this sample, geofences expire after twelve hours.
     */
    public static final long GEOFENCE_EXPIRATION_IN_MILLISECONDS =
            GEOFENCE_EXPIRATION_IN_HOURS * 60 * 60 * 1000;
    public static final float GEOFENCE_RADIUS_IN_METERS =200 ; // 1 mile, 1.6 km

    /**
     * Map for storing information about airports in the San Francisco bay area.
     */
    public static final HashMap<String, LatLng> INFY_LANDMARKS = new HashMap<String, LatLng>();
    static {
        //myLocation
        INFY_LANDMARKS.put("my Location",new LatLng(17.441269, 78.649272));
        // Infy main gate
        INFY_LANDMARKS.put("Infy Main Gate", new LatLng(17.444973, 78.640227));

        // infy Bus bay.
        INFY_LANDMARKS.put("Infy Bus Bay", new LatLng(17.444600, 78.637849));
        //infy turnstile
        INFY_LANDMARKS.put("Infy Turnstile", new LatLng(17.445845, 78.634887));
        //Foodcourt 9
        INFY_LANDMARKS.put("FoodCourt 9", new LatLng(17.447999, 78.634969));
        //B12B14
        INFY_LANDMARKS.put("B12 B14", new LatLng(17.448571, 78.634969));
        //B10B11
        INFY_LANDMARKS.put("B10 B11", new LatLng(17.448505, 78.636748));
        //Foodcourt8
        INFY_LANDMARKS.put("FoodCourt 8", new LatLng(17.447323, 78.636632));
        //B2B3
        INFY_LANDMARKS.put("B2 B3", new LatLng(17.447065, 78.635728));
        //CoffeeDay
        INFY_LANDMARKS.put("Coffee Day", new LatLng(17.446952, 78.634808));

    }
}
