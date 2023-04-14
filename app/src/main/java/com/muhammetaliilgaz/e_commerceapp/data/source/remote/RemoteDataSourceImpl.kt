package com.muhammetaliilgaz.e_commerceapp.data.source.remote

import com.muhammetaliilgaz.e_commerceapp.data.model.CRUDResponse
import com.muhammetaliilgaz.e_commerceapp.data.model.ProductResponse
import com.muhammetaliilgaz.e_commerceapp.data.model.User
import com.muhammetaliilgaz.e_commerceapp.domain.datasource.remote.RemoteDataSource
import com.muhammetaliilgaz.e_commerceapp.util.Resource
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(private val api: ECommerceApi) : RemoteDataSource {

    override suspend fun getProducts(): Resource<List<ProductResponse>> {
        val response = api.getProducts()
        try{

            if (response.isSuccessful){
                return Resource.success(response.body())
            }

            return Resource.error("veriler alinamadi!",null)


        }catch (e: Exception){
            return Resource.error("veriler alinamadi!",null)

        }

    }

    override suspend fun signup(user: User): Resource<CRUDResponse> {
        return try {
            val response = api.signup(user)
            Resource.success(response.body())
        }catch (e:Exception){
            Resource.error(e.message.toString(),null)
        }
    }
}