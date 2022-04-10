package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		for(int count=1 ; count <= 10 ; count++){
			System.out.println("Pipelineeeeeeeeeeeeeee");
		}
	}

}
