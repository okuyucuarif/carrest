package com.okuyucuarif.springboot.turkcell.entity;

public class Car {
	
	private String marka;
	private String model;
	private String sinif;
	public Car(String marka, String model, String sinif) {
		super();
		this.marka = marka;
		this.model = model;
		this.sinif = sinif;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getSinif() {
		return sinif;
	}
	public void setSinif(String sinif) {
		this.sinif = sinif;
	}
	
	

}
