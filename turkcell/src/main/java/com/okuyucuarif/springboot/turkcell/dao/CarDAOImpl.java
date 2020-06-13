package com.okuyucuarif.springboot.turkcell.dao;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.okuyucuarif.springboot.turkcell.entity.Car;

//This is repo class used for autowired.

@Repository
public class CarDAOImpl implements CarDAO {

	private List<Car> cars;
	
	public CarDAOImpl() {
		cars = new ArrayList<Car>();
		init();
		
	}
	
	//Read from txt....
	public void init() {
		File file = new File("data/car.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(file));) {

            String st;
            while ((st = br.readLine()) != null){
                String[] line = st.split(";");
                Car car = new Car(line[0],line[1],line[2].replaceAll("&",", "));
                cars.add(car);

            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	@Override
	public List<Car> getAllCars() {
		return cars;
	}

	@Override
	public List<Car> getCarsWithKey(String key) {
		List<Car> carsWithKey = new ArrayList<>();
		
		for(int i = 0;i<cars.size();i++) {
			if(containsIgnoreCase(cars.get(i).getMarka(),key) || containsIgnoreCase(cars.get(i).getModel(),key)|| containsIgnoreCase(cars.get(i).getSinif(),key)) {
				carsWithKey.add(cars.get(i));
			}
		}
		return carsWithKey;
	}

	@Override
	public List<Car> getCarsWithCriteria(String criter) {
		List<Car> carsWithCriteria = new ArrayList<>();
		
		for(int i = 0;i<cars.size();i++) {
			if(cars.get(i).getMarka().equalsIgnoreCase(criter) || cars.get(i).getModel().equalsIgnoreCase(criter) || cars.get(i).getSinif().equalsIgnoreCase(criter) ) {
				carsWithCriteria.add(cars.get(i));
			}
		}
		return carsWithCriteria;
	}
	
	//Custom contians method.Normal contains metodu ignoreCase içermediği için custom olarak yazılmıştır.
	
	public boolean containsIgnoreCase(String str, String searchStr)     {
	    if(str == null || searchStr == null) return false;

	    final int length = searchStr.length();
	    if (length == 0)
	        return true;

	    for (int i = str.length() - length; i >= 0; i--) {
	        if (str.regionMatches(true, i, searchStr, 0, length))
	            return true;
	    }
	    return false;
	}

	

}
