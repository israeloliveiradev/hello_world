package com.generation.helloworld.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exemplo")

public class HelloWorldController {
	
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World!!";
	}
	
	@GetMapping("/lista-bdsm")
	public String listaBdsm() {
		
		return "[Orientação ao Futuro]\n[Responsabilidade Pessoal]\n[Mentalidade de Crescimento]\n[Persistência]\n[Trabalho em Equipe]\n[Comunicação]\n[Orientação ao Detalhe]";			
	}
	
	@GetMapping("/objetivos-semana")
	public String objetivosSemanas() {
		return "Aprender mais sobre Spring Boot, terminar pitch e aplicar mais pra vagas";
	}
}
	

