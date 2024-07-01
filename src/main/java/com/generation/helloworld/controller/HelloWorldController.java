package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exemplos")

public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping("/lista-bdsm")
	public String listaBdsm() {
		return "Orientação ao Futuro, Responsabilide Pessoal, Mentalidade de Crescimento, Persistência, Trabalho em Equipe, Proatividade e Comunicação";
	}
	
	@GetMapping("/objetivos-semana")
	public String objetivosSemanas() {
		return "Aprender mais sobre Spring Boot, terminar pitch e aplicar mais pra vagas";
	}
}
	

