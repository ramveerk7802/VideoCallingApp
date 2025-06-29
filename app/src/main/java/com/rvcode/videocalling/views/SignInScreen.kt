package com.rvcode.videocalling.views

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInScreen(){

    Scaffold (
        topBar = {
            TopAppBar(
                title = { Text(text = "Video calling App") }
            )
        }
    ){
        App(Modifier.padding(it))
    }
}


@Composable
private fun App(modifier: Modifier){

}