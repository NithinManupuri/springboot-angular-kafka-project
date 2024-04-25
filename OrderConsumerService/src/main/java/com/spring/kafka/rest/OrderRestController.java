package com.spring.kafka.rest;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.kafka.OrderProducer;
import com.spring.kafka.dto.Product;

@RestController
public class OrderRestController {
    @Autowired
	private OrderProducer producer;
	
    @PostMapping("/send")
	public void getOrderDetails(@RequestBody Product product){
    	System.out.println(product);
		 
		producer.sendOrder(product);
		
	
		
		
	}
}