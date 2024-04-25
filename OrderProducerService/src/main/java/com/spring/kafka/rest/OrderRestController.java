package com.spring.kafka.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<String> getOrderDetails(@RequestBody Product product){
    	System.out.println(product);
		 
		producer.sendOrder(product);
		return new ResponseEntity<>("Sucess",HttpStatus.OK);
	
		
		
	}
}
