package com.david.pruebatienda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.david.pruebatienda.controller.FacturaTemporalController;

@SpringBootApplication
@ComponentScan(basePackageClasses = FacturaTemporalController.class)
public class PruebatiendaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PruebatiendaApplication.class, args);
	}

}
