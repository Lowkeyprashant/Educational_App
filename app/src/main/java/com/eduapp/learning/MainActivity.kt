package com.eduapp.learning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.eduapp.learning.ui.theme.EdumeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EdumeTheme {
                EduApp() // This launches your navigation and screens
            }
        }
    }
}
