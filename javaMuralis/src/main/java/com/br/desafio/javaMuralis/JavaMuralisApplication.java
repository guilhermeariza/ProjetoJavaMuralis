package com.br.desafio.javaMuralis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "com.br.desafio.javaMuralis.viaCep")
public class JavaMuralisApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaMuralisApplication.class, args);
	}

}
