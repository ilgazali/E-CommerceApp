package com.muhammetaliilgaz.e_commerceapp.data.repository

import androidx.lifecycle.LiveData
import com.muhammetaliilgaz.e_commerceapp.data.model.CRUDResponse
import com.muhammetaliilgaz.e_commerceapp.data.model.Product
import com.muhammetaliilgaz.e_commerceapp.data.model.User
import com.muhammetaliilgaz.e_commerceapp.domain.datasource.local.LocalDataSource
import com.muhammetaliilgaz.e_commerceapp.domain.datasource.remote.RemoteDataSource
import com.muhammetaliilgaz.e_commerceapp.domain.repository.ProductRepository
import com.muhammetaliilgaz.e_commerceapp.util.Resource
import com.muhammetaliilgaz.e_commerceapp.util.Status
import com.muhammetaliilgaz.e_commerceapp.util.asDatabaseModel
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(private val remoteDataSource: RemoteDataSource
                                                , private val localDataSource:LocalDataSource) :ProductRepository {


    override suspend fun getProductsOnce() {

        when (remoteDataSource.getProducts().status) {
            Status.SUCCESS ->{
                println("basarili")
                remoteDataSource.getProducts().data?.let {
                    println(it[0].title)
                    localDataSource.insertAllProducts(it.asDatabaseModel())
                }
            }
            Status.ERROR -> {
                println("error")

            }
            Status.LOADING ->{
                println("loading")
            }
        }


    }

    override fun getProducts(): LiveData<List<Product>> {

    return localDataSource.getProductsFromDatabase()

    }

    override suspend fun signUpUser(user: User): Resource<CRUDResponse> {
        return remoteDataSource.signup(user)
    }


}