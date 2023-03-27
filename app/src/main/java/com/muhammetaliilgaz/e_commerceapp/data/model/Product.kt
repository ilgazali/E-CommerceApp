package com.muhammetaliilgaz.e_commerceapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * products that will be stored in db and shown in UI
 */
@Entity(tableName = "product")
data class Product(

    @ColumnInfo(name = "category")
    val category: String,

    @ColumnInfo(name = "count")
    val count: Int,

    @ColumnInfo(name = "description")
    val description: String,

    @ColumnInfo(name = "image")
    val image: String,

    @ColumnInfo(name = "image_two")
    val imageTwo: String,

    @ColumnInfo(name = "image_three")
    val imageThree: String,

    @ColumnInfo(name = "price")
    val price: Double,

    @ColumnInfo(name = "rate")
    val rate: Double,

    @ColumnInfo(name = "title")
    val title: String,

    @ColumnInfo(name = "sale_state")
    val saleState: Int,

    @ColumnInfo(name = "is_favorite")
    val isFavorite: Boolean = false,

    @ColumnInfo(name = "salePrice")
    val salePrice: Double

){
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    var id: Int = 0
}
