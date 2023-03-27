package com.muhammetaliilgaz.e_commerceapp.di

import com.muhammetaliilgaz.e_commerceapp.data.repository.ProductRepositoryImpl
import com.muhammetaliilgaz.e_commerceapp.data.source.local.LocalDataSourceImpl
import com.muhammetaliilgaz.e_commerceapp.data.source.local.ProductDao
import com.muhammetaliilgaz.e_commerceapp.data.source.remote.ProductApi
import com.muhammetaliilgaz.e_commerceapp.data.source.remote.RemoteDataSourceImpl
import com.muhammetaliilgaz.e_commerceapp.domain.datasource.local.LocalDataSource
import com.muhammetaliilgaz.e_commerceapp.domain.datasource.remote.RemoteDataSource
import com.muhammetaliilgaz.e_commerceapp.domain.repository.ProductRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import kotlin.coroutines.CoroutineContext


@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {


    @Provides
    @Singleton //Authenticator will be added
    fun provideRemoteDataSource(productApi: ProductApi): RemoteDataSource = RemoteDataSourceImpl(productApi)


    @Provides
    @Singleton
    fun provideLocalDataSource(dao: ProductDao,
                               ioDispatcher: CoroutineContext): LocalDataSource = LocalDataSourceImpl(dao,ioDispatcher)


    @Provides
    @Singleton
    fun providerepository(remoteDataSource: RemoteDataSource,localDataSource: LocalDataSource) : ProductRepository
    = ProductRepositoryImpl(remoteDataSource,localDataSource)


}