package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ECommerceApplication {

	public static void main(String[] args) {
		System.out.println("Hello Spring Boot");
		SpringApplication.run(ECommerceApplication.class, args);
	}

}
