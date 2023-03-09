package com.heitor.buscarendereco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BuscarenderecoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuscarenderecoApplication.class, args);
	}

}
