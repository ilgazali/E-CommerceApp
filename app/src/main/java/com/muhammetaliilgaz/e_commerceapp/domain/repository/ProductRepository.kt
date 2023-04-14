package com.muhammetaliilgaz.e_commerceapp.domain.repository

import androidx.lifecycle.LiveData
import com.muhammetaliilgaz.e_commerceapp.data.model.CRUDResponse
import com.muhammetaliilgaz.e_commerceapp.data.model.Product
import com.muhammetaliilgaz.e_commerceapp.data.model.User
import com.muhammetaliilgaz.e_commerceapp.util.Resource


interface ProductRepository {
    suspend fun getProductsOnce()
    fun getProducts() : LiveData<List<Product>>
    suspend fun signUpUser(user: User): Resource<CRUDResponse>
}