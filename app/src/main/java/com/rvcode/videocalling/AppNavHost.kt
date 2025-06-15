package com.rvcode.videocalling

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.rvcode.videocalling.utility.Destination
import com.rvcode.videocalling.views.HomeScreen


@Composable
fun AppNavHost(){
    val navHostController = rememberNavController()
        NavHost(
            navController = navHostController,
            startDestination = Destination.Home
        ){
            composable<Destination.Home> {
                HomeScreen()
            }
        }
}