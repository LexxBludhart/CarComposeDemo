package com.example.carcomposedemo.di

import android.content.Context
import androidx.room.Room
import com.example.carcomposedemo.constants.Constants.CAR_TABLE
import com.example.carcomposedemo.model.dao.CarDao
import com.example.carcomposedemo.model.database.CarDatabase
import com.example.carcomposedemo.model.repository.CarRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class AppModule {
    @Provides
    fun provideCarDatabase(@ApplicationContext context: Context) = Room.databaseBuilder(
        context,
        CarDatabase::class.java,
        CAR_TABLE
    ).build()

    @Provides
    fun provideCarDao(carDatabase: CarDatabase) = carDatabase.carDao()

    @Provides
    fun provideCarRepository(carDao: CarDao) = CarRepositoryImpl(carDao)

}