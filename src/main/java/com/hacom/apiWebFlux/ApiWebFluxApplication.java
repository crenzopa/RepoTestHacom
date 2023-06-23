package com.hacom.apiWebFlux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:application.yml")
public class ApiWebFluxApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiWebFluxApplication.class, args);
	}

}
