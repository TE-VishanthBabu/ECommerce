package com.riverstone.ecommerce.service;

import java.util.List;
import com.riverstone.ecommerce.bean.Products;

public interface EcommerceService {

	public List<Products> getProduct(String filterBy, String categoryId, Double price);

}
