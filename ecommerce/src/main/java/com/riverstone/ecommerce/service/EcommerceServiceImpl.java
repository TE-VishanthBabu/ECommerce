package com.riverstone.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.riverstone.ecommerce.bean.Products;
import com.riverstone.ecommerce.dao.EcommerceDao;
import com.riverstone.ecommerce.exception.ValueNotFound;

@Service
public class EcommerceServiceImpl implements EcommerceService {

	@Autowired
	private EcommerceDao ecommerceDao;

	@Override
	public List<Products> getProduct(String filterBy, String categoryId, Double price) {
		if (filterBy.equals("category")) {
			return ecommerceDao.getProductByCategory(categoryId);

		} else if (filterBy.equals("price")) {

			return ecommerceDao.getProductByPrice(price);
		} else {
			throw new ValueNotFound("Entered Type is not found");
		}

	}

}
