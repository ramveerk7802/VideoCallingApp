package com.rvcode.videocalling.viewModels

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rvcode.videocalling.repositories.ZegoRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class CallViewModel(context: Context) : ViewModel(){
    private val repo  = ZegoRepo(context)
    init {
        viewModelScope.launch(Dispatchers.IO) {
            repo.initZego()
        }
    }
}