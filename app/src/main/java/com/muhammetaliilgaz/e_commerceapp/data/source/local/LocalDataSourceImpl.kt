package com.muhammetaliilgaz.e_commerceapp.data.source.local

import androidx.lifecycle.LiveData
import com.muhammetaliilgaz.e_commerceapp.data.model.Product
import com.muhammetaliilgaz.e_commerceapp.domain.datasource.local.LocalDataSource
import kotlinx.coroutines.withContext
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

class LocalDataSourceImpl @Inject constructor(private val dao: ProductDao,
private val ioDispatcher: CoroutineContext
) : LocalDataSource {

    override fun getProductsFromDatabase(): LiveData<List<Product>> = dao.getProducts()

    override suspend fun insertAllProducts(productList: List<Product>) {
        withContext(ioDispatcher){
            dao.insertAll(productList)

        }
    }

}