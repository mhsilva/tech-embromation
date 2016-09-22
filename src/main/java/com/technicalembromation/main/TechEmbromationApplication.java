package com.technicalembromation.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.techinicalembromation" })
public class TechEmbromationApplication {

	public static void main(String[] args) {
		SpringApplication.run(TechEmbromationApplication.class, args);
	}
}
