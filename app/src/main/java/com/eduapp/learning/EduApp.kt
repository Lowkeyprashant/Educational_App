package com.eduapp.learning

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.eduapp.learning.ui.screens.EnglishScreen
import com.eduapp.learning.ui.screens.HomeScreen
import com.eduapp.learning.ui.screens.MathsScreen
import com.eduapp.learning.ui.screens.ProfileScreen

@Composable
fun EduApp() {
    val navController = rememberNavController()

    NavHost(
        navController = navController, // <-- small note below
        startDestination = "home"
    ) {
        composable("home") { HomeScreen(navController) }
        composable("maths") { MathsScreen(navController) }
        composable("english") { EnglishScreen(navController) }
        composable("profile") { ProfileScreen(navController) }
    }
}
