package com.example.demo;


import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	private static final String INSTANCE_NAME = "Instance 1 ";
	private static AtomicInteger counter= new AtomicInteger(0);
	@RequestMapping("/")
	public void index() {
		System.out.println(INSTANCE_NAME + counter.incrementAndGet());
		
		//return "Greetings from Instance1!";
	}
}
