package com.generation.hellowold.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "Hello World!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return " <b>Generation Brasil Turma 53 - BSM's</b> </br>"
				+ "</br> - Introdução às Habilidades Comportamentais e Mentalidades <br/>"
				+ "- Mentalidade de Crescimento <br />"
				+ "- Persistência</br>"
				+ "- Responsabilidade Pessoal</br>"
				+ "- Orientação ao Futuro</br>"
				+ "- Comunicação</br>"
				+ "- Orientação ao Detalhe</br>"
				+ "- Proatividade</br>"
				+ "- Trabalho em Equipe</br>";
	}
	
	@GetMapping("/objetivo")
	public String objetivo() {
		return "Meu objetivo para esta semana é aprender profundamente "
				+ "os fundamentos do Spring MVC, e a camada de serviço "
				+ "para assim prosseguir com a continuidade do apendizado. ";
	}

}
