package me.dio.alexdonay.labdio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Projeto Spring Boot, bootcamp Santander Dio, gerado via Spring Initialzr.
 * Dependencias: Spring data JPA
 * Spring Web
 * h2 database
 * openfeign
 * baseado na aula Praticando Com Spring Boot
 * @autor Alexsander Donay
 */
@EnableFeignClients
@SpringBootApplication
public class LabdioApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabdioApplication.class, args);
	}

}
