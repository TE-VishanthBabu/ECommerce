package com.riverstone.ecommerce.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "products")
public class Products implements Serializable {

	@Id
	@Column
	private String product_Id;

	@Column
	private String category_Id;

	@Column
	private String product_Name;

	@Column
	private Double price;

}
