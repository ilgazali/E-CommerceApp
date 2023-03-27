package com.muhammetaliilgaz.e_commerceapp.di

import android.content.Context
import androidx.room.Room
import com.muhammetaliilgaz.e_commerceapp.data.source.local.ProductDao
import com.muhammetaliilgaz.e_commerceapp.data.source.local.ProductDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideProductDatabase(@ApplicationContext appContext: Context): ProductDatabase =
        Room.databaseBuilder(
            appContext,
            ProductDatabase::class.java,
            "product_database.db"
        ).fallbackToDestructiveMigration().build()

    @Provides
    @Singleton
    fun provideProductDAO(productDatabase: ProductDatabase): ProductDao = productDatabase.productDAO()
}