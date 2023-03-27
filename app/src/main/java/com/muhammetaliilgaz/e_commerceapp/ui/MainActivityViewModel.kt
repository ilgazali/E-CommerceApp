package com.muhammetaliilgaz.e_commerceapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.muhammetaliilgaz.e_commerceapp.data.model.Product
import com.muhammetaliilgaz.e_commerceapp.domain.repository.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(var productRepository: ProductRepository) : ViewModel() {



    var list = productRepository.getProducts()

    init {
        uploadData()
    }

    fun uploadData(){

        viewModelScope.launch{
            productRepository.getProductsOnce()

        }

    }


}