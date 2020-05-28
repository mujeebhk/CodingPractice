package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoadBalancerGradelApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoadBalancerGradelApplication.class, args);
		LoadBalancingUtil.init();
		
	}

}
