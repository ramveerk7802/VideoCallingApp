package com.rvcode.videocalling.repositories

import android.content.Context
import com.rvcode.videocalling.utility.Constant
import com.zegocloud.uikit.prebuilt.call.ZegoUIKitPrebuiltCallService
import im.zego.zegoexpress.ZegoExpressEngine

data class ZegoRepo(private val context: Context) {

    suspend fun initZego(){
        ZegoUIKitPrebuiltCallService.init(
            context,
            Constant.APP_ID,
            Constant.APP_SIGN
        )
    }
}