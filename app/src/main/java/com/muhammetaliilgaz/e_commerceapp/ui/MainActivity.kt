package com.muhammetaliilgaz.e_commerceapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.muhammetaliilgaz.e_commerceapp.data.model.User
import com.muhammetaliilgaz.e_commerceapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    var binding : ActivityMainBinding? = null


    lateinit var viewModel: MainActivityViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding!!.root
        setContentView(view)

        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)


        val user = User("1111211111111","11111112111111","11111111211111","11111112111111","11111211111111")
        viewModel.signup(user)

        viewModel.crudResponse.observe(this,Observer{
            println("=====================================")
            println("TOKEN = ${it.data?.message}")
            println("=====================================")

        })
    }


}