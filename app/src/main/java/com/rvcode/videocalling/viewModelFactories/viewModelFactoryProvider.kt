package com.rvcode.videocalling.viewModelFactories

import android.content.Context
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.rvcode.videocalling.viewModels.CallViewModel

//class CallViewModelFactory (private val context: Context): ViewModelProvider.Factory {
//    override fun <T : ViewModel> create(modelClass: Class<T>): T {
//        if(modelClass.isAssignableFrom(CallViewModel::class.java))
//            return CallViewModel(context) as T
//        throw IllegalArgumentException("Unknown ViewModel class")
//    }
//
//}

fun provideCallViewModelFactory(context: Context) = viewModelFactory {
    initializer {
        CallViewModel(context)
    }
}