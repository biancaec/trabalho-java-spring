package com.maisprati.trabalhojava.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Telefones {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTelefone;
	
	private String telefone;
	
	private boolean flagAtivo;
	
	public boolean isFlagAtivo() {
		return flagAtivo;
	}
	public void setFlagAtivo(boolean flagAtivo) {
		this.flagAtivo = flagAtivo;
	}
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_cadastro")
	private Cadastros cadastro;
	
	public Integer getIdTelefone() {
		return idTelefone;
	}
	public void setIdTelefone(Integer idTelefone) {
		this.idTelefone = idTelefone;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Cadastros getCadastro() {
		return cadastro;
	}
	public void setCadastro(Cadastros cadastro) {
		this.cadastro = cadastro;
	}

}
