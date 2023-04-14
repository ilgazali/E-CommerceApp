package com.muhammetaliilgaz.e_commerceapp.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.muhammetaliilgaz.e_commerceapp.data.model.CRUDResponse
import com.muhammetaliilgaz.e_commerceapp.data.model.Product
import com.muhammetaliilgaz.e_commerceapp.data.model.User
import com.muhammetaliilgaz.e_commerceapp.domain.datasource.usecase.SignUpUseCase
import com.muhammetaliilgaz.e_commerceapp.domain.repository.ProductRepository
import com.muhammetaliilgaz.e_commerceapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainActivityViewModel @Inject constructor(private val signUpUseCase: SignUpUseCase) : ViewModel() {



    private val _crudResponse = MutableLiveData<Resource<CRUDResponse>>()
    val crudResponse: LiveData<Resource<CRUDResponse>> = _crudResponse


    fun signup(user: User){

        viewModelScope.launch{
            signUpUseCase?.let {
                _crudResponse.value = signUpUseCase(user)

            }

        }
    }


}