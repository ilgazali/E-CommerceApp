package com.muhammetaliilgaz.e_commerceapp.data.source.local

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.muhammetaliilgaz.e_commerceapp.data.model.Product

@Dao
interface ProductDao {

    @Query("SELECT * FROM product")
    fun getProducts() : LiveData<List<Product>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(productList: List<Product>)
}