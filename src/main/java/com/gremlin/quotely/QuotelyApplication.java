package com.gremlin.quotely;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class QuotelyApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuotelyApplication.class, args);
	}

}
