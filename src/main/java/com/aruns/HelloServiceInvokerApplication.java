package com.aruns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HelloServiceInvokerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloServiceInvokerApplication.class, args);
	}

}
