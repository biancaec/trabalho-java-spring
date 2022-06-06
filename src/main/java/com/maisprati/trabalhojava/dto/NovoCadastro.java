package com.maisprati.trabalhojava.dto;

import com.maisprati.trabalhojava.model.CadastroTipo;

public class NovoCadastro {
	private String nome;
	private String dataNascimento;
	private CadastroTipo tipoCadastro;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public CadastroTipo getTipoCadastro() {
		return tipoCadastro;
	}
	public void setTipoCadastro(CadastroTipo tipoCadastro) {
		this.tipoCadastro = tipoCadastro;
	}
}
