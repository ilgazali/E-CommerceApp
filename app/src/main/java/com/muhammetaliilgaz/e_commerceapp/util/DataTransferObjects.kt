

package com.muhammetaliilgaz.e_commerceapp.util

import com.muhammetaliilgaz.e_commerceapp.data.model.Product
import com.muhammetaliilgaz.e_commerceapp.data.model.ProductResponse



fun List<ProductResponse>.asDatabaseModel(): List<Product> {
    return this.map {
        Product(category = it.category,
               count = 10,
            description = it.description,
            image = it.image,
            imageTwo = it.image,
            imageThree = it.image,
            price = it.price,
            rate = it.rating.rate,
            title = it.title,
            saleState = 10,
            isFavorite = false,
            salePrice = 9.99)
    }
}



