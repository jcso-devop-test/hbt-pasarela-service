package com.hbt.pasarela.servicios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class HbtPasarelaServiciosApplication {

	public static void main(String[] args) {
		SpringApplication.run(HbtPasarelaServiciosApplication.class, args);
	}

}
