package com.muhammetaliilgaz.e_commerceapp.domain.datasource.usecase

import com.muhammetaliilgaz.e_commerceapp.data.model.CRUDResponse
import com.muhammetaliilgaz.e_commerceapp.data.model.User
import com.muhammetaliilgaz.e_commerceapp.domain.repository.ProductRepository
import com.muhammetaliilgaz.e_commerceapp.util.Resource
import javax.inject.Inject

class SignUpUseCase @Inject constructor(private val productRepository: ProductRepository) {

    suspend operator fun invoke(user: User) : Resource<CRUDResponse>{
        return productRepository.signUpUser(user)

    }



}