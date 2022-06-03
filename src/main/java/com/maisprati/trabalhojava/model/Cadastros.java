package com.maisprati.trabalhojava.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cadastros {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idCadastro;
	
	private String nome;
	private LocalDate dataNascimento;
	private LocalDate dataCadastro;
	private LocalDate ultimaAlteracao;
	
	@Enumerated(EnumType.STRING)
	private CadastroTipo tipoCadastro;
	
	public Integer getIdCadastro() {
		return idCadastro;
	}
	public void setIdCadastro(Integer idCadastro) {
		this.idCadastro = idCadastro;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public LocalDate getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(LocalDate dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public LocalDate getUltimaAlteracao() {
		return ultimaAlteracao;
	}
	public void setUltimaAlteracao(LocalDate ultimaAlteracao) {
		this.ultimaAlteracao = ultimaAlteracao;
	}
	public CadastroTipo getTipoCadastro() {
		return tipoCadastro;
	}
	public void setTipoCadastro(CadastroTipo tipoCadastro) {
		this.tipoCadastro = tipoCadastro;
	}
	
	
}
