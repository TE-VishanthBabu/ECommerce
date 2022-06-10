package com.riverstone.ecommerce.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.riverstone.ecommerce.bean.EcommerceResponse;
import com.riverstone.ecommerce.exception.ValueNotFound;

@ControllerAdvice
public class EcommerceControllerAdvice {

	@ExceptionHandler(ValueNotFound.class)
	public ResponseEntity<EcommerceResponse> valueNotFound(ValueNotFound notFound) {
		EcommerceResponse response = new EcommerceResponse(true, notFound.getMessage());
		return new ResponseEntity<EcommerceResponse>(response, HttpStatus.NOT_FOUND);
	}
}
