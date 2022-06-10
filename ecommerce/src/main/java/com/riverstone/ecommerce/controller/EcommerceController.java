package com.riverstone.ecommerce.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.riverstone.ecommerce.bean.EcommerceResponse;
import com.riverstone.ecommerce.bean.Products;
import com.riverstone.ecommerce.service.EcommerceService;

@RestController
public class EcommerceController {
	
	@Autowired
	private EcommerceService ecommerceService;
	
	@GetMapping(path="/showdetails")
	public List<Products> getAll(@RequestParam String filterBy,@RequestParam String categoryId,@RequestParam Double price){
		
		return ecommerceService.getProduct(filterBy,  categoryId,  price);
	}
	
	@GetMapping(path="/showProductInfo")
	public ResponseEntity<EcommerceResponse> getInfo(@RequestParam String filterBy,@RequestParam String categoryId,@RequestParam Double price){
		EcommerceResponse ecommerceResponse=new EcommerceResponse(false,ecommerceService.getProduct(filterBy, categoryId, price));
		return new ResponseEntity<EcommerceResponse>(ecommerceResponse, HttpStatus.OK);
	}

}
