package com.okuyucuarif.springboot.turkcell.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class CarRestExceptionHandler {

	
	@ExceptionHandler
	public ResponseEntity<CarCustomErrorResponse>  handleException(CarNotFoundException exc){
		
		CarCustomErrorResponse theCustomerErrorResponse = new CarCustomErrorResponse();
		theCustomerErrorResponse.setMessage(exc.getMessage());
		theCustomerErrorResponse.setStatus(HttpStatus.NOT_FOUND.value());
		theCustomerErrorResponse.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(theCustomerErrorResponse,HttpStatus.NOT_FOUND);
	}
	
	
	
	@ExceptionHandler
	public ResponseEntity<CarCustomErrorResponse>  catchAll(Exception exc){
		
		CarCustomErrorResponse theCustomerErrorResponse = new CarCustomErrorResponse();
		theCustomerErrorResponse.setMessage(exc.getMessage());
		theCustomerErrorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
		theCustomerErrorResponse.setTimeStamp(System.currentTimeMillis());
		
		return new ResponseEntity<>(theCustomerErrorResponse,HttpStatus.BAD_REQUEST);
	}
	
}
