package com.projetoweb.valorant_projeto_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class ValorantProjetoWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ValorantProjetoWebApplication.class, args);
	}

}
