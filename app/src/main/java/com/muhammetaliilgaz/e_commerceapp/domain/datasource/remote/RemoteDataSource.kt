package com.muhammetaliilgaz.e_commerceapp.domain.datasource.remote

import com.muhammetaliilgaz.e_commerceapp.data.model.CRUDResponse
import com.muhammetaliilgaz.e_commerceapp.data.model.ProductResponse
import com.muhammetaliilgaz.e_commerceapp.data.model.User
import com.muhammetaliilgaz.e_commerceapp.util.Resource

interface RemoteDataSource {
    suspend fun getProducts() : Resource<List<ProductResponse>>
    suspend fun signup(user:User) : Resource<CRUDResponse>
}