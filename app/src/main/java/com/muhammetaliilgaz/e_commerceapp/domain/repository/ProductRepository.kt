package com.muhammetaliilgaz.e_commerceapp.domain.repository

import androidx.lifecycle.LiveData
import com.muhammetaliilgaz.e_commerceapp.data.model.Product


interface ProductRepository {
    suspend fun getProductsOnce()
    fun getProducts() : LiveData<List<Product>>
}