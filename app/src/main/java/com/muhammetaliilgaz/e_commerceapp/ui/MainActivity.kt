package com.muhammetaliilgaz.e_commerceapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.muhammetaliilgaz.e_commerceapp.R
import com.muhammetaliilgaz.e_commerceapp.data.model.Product
import com.muhammetaliilgaz.e_commerceapp.data.repository.ProductRepositoryImpl
import com.muhammetaliilgaz.e_commerceapp.databinding.ActivityMainBinding
import com.muhammetaliilgaz.e_commerceapp.domain.repository.ProductRepository
import dagger.hilt.EntryPoint
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
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

        viewModel.list.observe(this, Observer {
            for(i in it){
                println(i.imageThree)
            }

        })
    }


}