package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lista-bdsm")
public class ListaBdsmController {
	
	@GetMapping
	public String listaBdsm() {
		return "Mentalidades";
	}
	

}
