package com.muhammetaliilgaz.e_commerceapp.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.muhammetaliilgaz.e_commerceapp.data.model.Product


@Database(entities = [Product::class], version = 1, exportSchema = false)
abstract class ProductDatabase : RoomDatabase() {
    abstract fun productDAO(): ProductDao
}