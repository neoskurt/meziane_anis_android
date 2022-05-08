package com.example.meziane_anis.network

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

    @Serializable
    data class UserInfo(
        @SerialName("email")
        val email: String,
        @SerialName("firstname")
        val firstName: String,
        @SerialName("lastname")
        val lastName: String = " "):java.io.Serializable

