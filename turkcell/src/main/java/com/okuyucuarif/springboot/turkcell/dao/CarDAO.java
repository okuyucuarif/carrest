package com.okuyucuarif.springboot.turkcell.dao;

import java.util.List;

import com.okuyucuarif.springboot.turkcell.entity.Car;

public interface CarDAO {
	
	public List<Car> getAllCars();
	
	public List<Car> getCarsWithKey(String key);
	
	public List<Car> getCarsWithCriteria(String criter);
}
