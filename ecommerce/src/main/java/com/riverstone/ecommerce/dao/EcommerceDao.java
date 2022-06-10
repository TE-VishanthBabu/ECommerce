package com.riverstone.ecommerce.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.riverstone.ecommerce.bean.Products;

@Repository
public interface EcommerceDao extends JpaRepository<Products, String> {

	@Query(value = "select * from Products p inner join Category c on p.category_Id=c.category_Id where p.category_Id =?1", nativeQuery = true)
	public List<Products> getProductByCategory(String categoryId);

	@Query(value="select * from Products where price =?1", nativeQuery = true)
	public List<Products> getProductByPrice(Double price);

}
