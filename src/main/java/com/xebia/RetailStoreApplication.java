package com.xebia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class RetailStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetailStoreApplication.class, args);
	}

}
