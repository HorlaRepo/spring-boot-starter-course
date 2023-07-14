package com.example.starts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableFeignClients
public class StartsApplication {

	public static void main(String[] args) {
		SpringApplication.run(StartsApplication.class, args);
	}



	record Customer(long id, String name) {

	}
}
