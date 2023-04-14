package com.muhammetaliilgaz.e_commerceapp.data.model

import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("username")
    val username: String,

    @SerializedName("firstName")
    val firstName: String,

    @SerializedName("lastName")
    val lastName: String,

    @SerializedName("password")
    val password: String,

    @SerializedName("email")
    val email: String
    )

