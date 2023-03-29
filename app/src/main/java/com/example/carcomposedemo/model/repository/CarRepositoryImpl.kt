package com.example.carcomposedemo.model.repository

import com.example.carcomposedemo.model.dao.CarDao
import com.example.carcomposedemo.model.entity.Car
import kotlinx.coroutines.flow.Flow

// TODO: You can make this be way more sophisticated...

class CarRepositoryImpl(private val carDao: CarDao): CarRepository {

    override fun getCarsFromRoom(): Flow<Cars> = carDao.getCars()

    override fun getCarFromRoom(id: Int): Car = carDao.getCar(id)

    override fun addCarToRoom(car: Car) = carDao.addCar(car)

    override fun updateCarInRoom(car: Car) = carDao.updateCar(car)

    override fun deleteCarFromRoom(car: Car) = carDao.delete(car)

}