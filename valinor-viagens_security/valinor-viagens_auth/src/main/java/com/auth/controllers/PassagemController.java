package com.auth.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.model.entities.Passagem;
import com.auth.services.PassagemService;

@RestController
@RequestMapping("/passagens")
public class PassagemController {
	
	@Autowired
	PassagemService passagemService;
	
	@GetMapping
	public List<Passagem> list() {
		return passagemService.listAll();
	}

}
