package com.maisprati.trabalhojava.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Notas {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idNota;
	
	private float nota;
	
	private LocalDate dataNota;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="id_cadastro")
	private Cadastros cadastro;

	public Integer getIdNota() {
		return idNota;
	}
	public void setIdNota(Integer idNota) {
		this.idNota = idNota;
	}
	public float getNota() {
		return nota;
	}
	public void setNota(float nota) {
		this.nota = nota;
	}
	public LocalDate getDataNota() {
		return dataNota;
	}
	public void setDataNota(LocalDate dataNota) {
		this.dataNota = dataNota;
	}
	public Cadastros getCadastro() {
		return cadastro;
	}
	public void setCadastro(Cadastros cadastro) {
		this.cadastro = cadastro;
	}
	
}
