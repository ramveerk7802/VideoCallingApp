package com.rvcode.videocalling.views

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import com.rvcode.videocalling.viewModelFactories.provideCallViewModelFactory
import com.rvcode.videocalling.viewModels.CallViewModel

@Composable
fun HomeScreen(){
    val context = LocalContext.current
    val callViewModel : CallViewModel = viewModel(factory = provideCallViewModelFactory(context = context))
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Home screen"
        )
    }
}