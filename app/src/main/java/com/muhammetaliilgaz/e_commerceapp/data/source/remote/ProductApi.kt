package com.muhammetaliilgaz.e_commerceapp.data.source.remote

import com.muhammetaliilgaz.e_commerceapp.data.model.ProductResponse
import retrofit2.Response
import retrofit2.http.GET

interface ProductApi {

    @GET("/products")
    suspend fun getProducts() : Response<List<ProductResponse>>

}