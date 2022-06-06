package com.maisprati.trabalhojava.model;

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
	private String dataNascimento;
	private String dataCadastro;
	private String ultimaAlteracao;
	
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
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String string) {
		this.dataNascimento = string;
	}
	public String getDataCadastro() {
		return dataCadastro;
	}
	public void setDataCadastro(String dataCadastro) {
		this.dataCadastro = dataCadastro;
	}
	public String getUltimaAlteracao() {
		return ultimaAlteracao;
	}
	public void setUltimaAlteracao(String ultimaAlteracao) {
		this.ultimaAlteracao = ultimaAlteracao;
	}
	public CadastroTipo getTipoCadastro() {
		return tipoCadastro;
	}
	public void setTipoCadastro(CadastroTipo tipoCadastro) {
		this.tipoCadastro = tipoCadastro;
	}
	
	
}
