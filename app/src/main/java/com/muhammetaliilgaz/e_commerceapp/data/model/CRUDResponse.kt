package com.muhammetaliilgaz.e_commerceapp.data.model

import com.google.gson.annotations.SerializedName

data class CRUDResponse(
    @SerializedName("status")
    val status: Boolean,

    @SerializedName("message")
    val message: String
)