package com.example.clientService;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ClientService1Application {
	
	@Bean
	public  RestTemplate getRestTemplate() {
		return new RestTemplate();
		
	}

	public static void main(String[] args) {
		SpringApplication.run(ClientService1Application.class, args);
		
		
	
		
	}

}
