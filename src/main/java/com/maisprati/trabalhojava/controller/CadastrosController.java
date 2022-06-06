package com.maisprati.trabalhojava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maisprati.trabalhojava.dto.NovoCadastro;
import com.maisprati.trabalhojava.model.Cadastros;
import com.maisprati.trabalhojava.repository.CadastrosRepository;
import com.maisprati.trabalhojava.service.CadastrosService;

@RestController
@RequestMapping("/cadastros")
public class CadastrosController {
	
	@Autowired
	private CadastrosRepository repository;
	@Autowired
	private CadastrosService service;
	
	@GetMapping
	public List<Cadastros> findAll() {
		return repository.findAll();
	}
	@PostMapping
	public void save(@RequestBody NovoCadastro cadastro) {
		service.save(cadastro);
	}
}
