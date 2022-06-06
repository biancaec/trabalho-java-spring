package com.maisprati.trabalhojava.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maisprati.trabalhojava.dto.NovoCadastro;
import com.maisprati.trabalhojava.model.Cadastros;
import com.maisprati.trabalhojava.repository.CadastrosRepository;

@Service
public class CadastrosService {
	@Autowired
	private CadastrosRepository repository;
	
	public void save(NovoCadastro novoCadastro) {
		Cadastros cadastro = new Cadastros();
		cadastro.setDataNascimento(novoCadastro.getDataNascimento());
		cadastro.setNome(novoCadastro.getNome());
		cadastro.setTipoCadastro(novoCadastro.getTipoCadastro());
		
		cadastro.setDataCadastro(LocalDate.now().toString());
		cadastro.setUltimaAlteracao(LocalDate.now().toString());
		
		repository.save(cadastro);
	}
}
