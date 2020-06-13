package com.okuyucuarif.springboot.turkcell.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.okuyucuarif.springboot.turkcell.entity.Car;
import com.okuyucuarif.springboot.turkcell.service.CarService;

@RestController
@RequestMapping("/api/cars")
public class CarRestController {

	private CarService theCarService;
	
	@Autowired
	public CarRestController(CarService carService) {
		theCarService =carService;
	}
	
	@GetMapping("")
	public List<Car> getAllCars(){
		List<Car> result = theCarService.getAllCars();
		if(result.isEmpty()) {
			throw new CarNotFoundException("Sistemde hiç araba mevcut değil.");
		}
	
		return result; 
	}
	
	@GetMapping("/searchKey/{key}")
	public List<Car> getCarWithKey(@PathVariable String key){
		List<Car> result = theCarService.getCarsWithKey(key);
		
		if(result.isEmpty()) {
			throw new CarNotFoundException("Bu sorguya ait hiç araba bulunamadı");
		}
		
		
		return result;
				
				
	}
	
	@GetMapping("/searchCriteria/{criter}")
	public List<Car> getCarWithCriteria(@PathVariable String criter){
		List<Car> result = theCarService.getCarsWithCriteria(criter);
		if(result.isEmpty()) {
			throw new CarNotFoundException("Bu sorguya ait hiç araba bulunamadı");
		}
	
		return result; 
	}
	
	
}
