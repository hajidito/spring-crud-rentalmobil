package com.dito.rentalmobil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class RentalMobilApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentalMobilApplication.class, args);
	}

}
