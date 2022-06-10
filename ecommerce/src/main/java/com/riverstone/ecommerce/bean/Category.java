package com.riverstone.ecommerce.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name="category")
public class Category implements Serializable{
	
	@Id
	@Column
	private String category_Id;
	
	@Column
	private String category_Name;

}
