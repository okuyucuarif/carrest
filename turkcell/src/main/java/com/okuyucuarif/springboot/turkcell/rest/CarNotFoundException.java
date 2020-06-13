package com.okuyucuarif.springboot.turkcell.rest;

public class CarNotFoundException extends RuntimeException {

	public CarNotFoundException() {
	}

	public CarNotFoundException(String arg0) {
		super(arg0);
	}

	public CarNotFoundException(Throwable arg0) {
		super(arg0);
	}

	public CarNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public CarNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

}
