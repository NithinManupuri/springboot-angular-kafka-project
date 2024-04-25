package com.spring.kafka.dto;

import lombok.Data;

@Data
public class Product {
	
	
	private Integer id;
	private String pname;
	private Double amount;
	@Override
	public String toString() {
		return "Product [id=" + id + ", pname=" + pname + ", amount=" + amount + "]";
	}
	

}
