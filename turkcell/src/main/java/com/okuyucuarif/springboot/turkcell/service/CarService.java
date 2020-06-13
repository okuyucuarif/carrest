package com.okuyucuarif.springboot.turkcell.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.okuyucuarif.springboot.turkcell.entity.Car;

@Service
public interface CarService {

	public List<Car> getAllCars();
	
	public List<Car> getCarsWithKey(String key);
	
	public List<Car> getCarsWithCriteria(String criter);
}
