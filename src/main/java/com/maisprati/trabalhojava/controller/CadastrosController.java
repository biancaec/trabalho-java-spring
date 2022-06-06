package com.maisprati.trabalhojava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maisprati.trabalhojava.model.Cadastros;
import com.maisprati.trabalhojava.repository.CadastrosRepository;

@RestController
@RequestMapping("/cadastros")
public class CadastrosController {
	
	@Autowired
	private CadastrosRepository repository;
	
	@GetMapping
	public List<Cadastros> findAll() {
		return repository.findAll();
	}
}
