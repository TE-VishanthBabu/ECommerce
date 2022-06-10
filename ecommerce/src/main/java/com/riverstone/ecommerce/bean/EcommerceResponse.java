package com.riverstone.ecommerce.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EcommerceResponse {

	private boolean error;

	private Object data;
}
