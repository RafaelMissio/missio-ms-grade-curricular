package com.missio.cliente.escola.gradecurricular.controller;


import javax.swing.text.html.HTML;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/materia")
public class MateriaController {

	@GetMapping("/")
	public ResponseEntity<String>helloWorldRest(){
		return ResponseEntity.status(HttpStatus.OK).body("Ola mundo REST");
	}
	
	@GetMapping("/teste")
	public ResponseEntity<String>Missio(){
		return ResponseEntity.status(HttpStatus.OK).body("Missio");
	}
}
