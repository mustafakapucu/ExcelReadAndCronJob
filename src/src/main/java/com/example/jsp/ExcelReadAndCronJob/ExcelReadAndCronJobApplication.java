package com.example.jsp.ExcelReadAndCronJob;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ExcelReadAndCronJobApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExcelReadAndCronJobApplication.class, args);
	}

}
