package com.muhammetaliilgaz.e_commerceapp.data.source.remote

import com.muhammetaliilgaz.e_commerceapp.data.model.CRUDResponse
import com.muhammetaliilgaz.e_commerceapp.data.model.ProductResponse
import com.muhammetaliilgaz.e_commerceapp.data.model.User
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ECommerceApi {

    @GET("/products")
    suspend fun getProducts() : Response<List<ProductResponse>>

    @POST("/signup")
    suspend fun signup(@Body user: User) : Response<CRUDResponse>

}