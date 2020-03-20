package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController

@SpringBootApplication
public class MyopenshiftexampleApplication {
	@GetMapping
	public String welcome()
	{
		return "hello";
	}
	@GetMapping("/{input}")
	public String congrats(@PathVariable String input )
	{
		return input;
	}
	public static void main(String[] args) {
		SpringApplication.run(MyopenshiftexampleApplication.class, args);
	}

}
