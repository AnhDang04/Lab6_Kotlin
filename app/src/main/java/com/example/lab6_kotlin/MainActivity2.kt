package com.example.lab6_kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lab6_kotlin.ui.screens.CinemaSeatBookingScreen
import com.example.lab6_kotlin.ui.screens.createTheaterSeating
import com.example.lab6_kotlin.ui.theme.Lab6_KotlinTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            Lab6_KotlinTheme {
                CinemaSeatBookingScreen(
                    createTheaterSeating(
                        totalRows = 12,
                        totalSeatsPerRow = 9,
                        aislePositionInRow = 4,
                        aislePositionInColumn = 5
                    ), totalSeatsPerRow = 9
                )
            }
        }

    }
}