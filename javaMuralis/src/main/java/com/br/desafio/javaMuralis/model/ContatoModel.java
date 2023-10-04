package com.br.desafio.javaMuralis.model;


import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_contato")
public class ContatoModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Nonnull
	private String Tipo;
	
	@Nonnull
	private String Texto;

	public ContatoModel(Long id, String tipo, String texto) {
		super();

		this.Id = id;
		this.Tipo = tipo;
		this.Texto = texto;
	}
	
	public ContatoModel() {}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getTexto() {
		return Texto;
	}

	public void setTexto(String texto) {
		Texto = texto;
	} 
	
	
	

}
