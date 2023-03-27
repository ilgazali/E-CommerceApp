package com.muhammetaliilgaz.e_commerceapp.domain.datasource.local

import androidx.lifecycle.LiveData
import com.muhammetaliilgaz.e_commerceapp.data.model.Product

interface LocalDataSource {
    fun getProductsFromDatabase(): LiveData<List<Product>>
    suspend fun insertAllProducts(productList: List<Product> )
}