package com.rvcode.videocalling.utility

import kotlinx.serialization.Serializable

@Serializable
sealed class Destination {

    @Serializable
    data object Home:Destination()

    @Serializable
    data object SignIn:Destination()

    @Serializable
    data object SignUp:Destination()
}