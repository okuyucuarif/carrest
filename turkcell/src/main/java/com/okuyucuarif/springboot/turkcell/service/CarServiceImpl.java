package com.okuyucuarif.springboot.turkcell.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.okuyucuarif.springboot.turkcell.dao.CarDAO;
import com.okuyucuarif.springboot.turkcell.entity.Car;

@Service
public class CarServiceImpl implements CarService{
	
	private CarDAO carDAO;
	
	@Autowired
	public  CarServiceImpl(CarDAO carDAO) {
		this.carDAO = carDAO;
	
	}
	
	@Override
	public List<Car> getCarsWithKey(String key) {
		return carDAO.getCarsWithKey(key);
	}

	@Override
	public List<Car> getCarsWithCriteria(String criter) {
		return carDAO.getCarsWithCriteria(criter);
	}

	@Override
	public List<Car> getAllCars() {
		return carDAO.getAllCars();
	}

}
