package com.spring.kafka;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spring.kafka.dto.Product;
@Component
public class OrderProducer {
    @Autowired
	ObjectMapper objMapper;
	private final KafkaTemplate<String,String> template;

	OrderProducer(KafkaTemplate<String,String> template) {
        this.template = template;
    }
	
    public void sendOrder(Product p) {
    	try {
			String orderString = objMapper.writeValueAsString(p);
			template.send("demo-topic", orderString);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}    	
    }

	
}

