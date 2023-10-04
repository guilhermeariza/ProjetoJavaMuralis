package com.br.desafio.javaMuralis.model;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tb_cliente")
public class ClienteModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Nonnull
	private String Nome;
	
	@Nonnull
	private String DataCadastro;

	@PrePersist
	private void preencherDataCadastro() {
		DataCadastro = LocalDate.now().toString();
	}
	
	@Nonnull
	@OneToOne
    @JsonIgnoreProperties(value = "clienteModel")
	private ContatoModel Contato;
	
	@Nonnull
	@OneToOne
    @JsonIgnoreProperties(value = "clienteModel")
	private EnderecoModel Endereco;

	public ClienteModel(Long id, String nome, String dataCadastro, ContatoModel contato, EnderecoModel endereco) {
		super();

		this.Id = id;
		this.Nome = nome;
		this.DataCadastro = dataCadastro;
		this.Contato = contato;
		this.Endereco = endereco;
	}
	
	public ClienteModel() {}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getDataCadastro() {
		return DataCadastro;
	}

	public void setDataCadastro(String dataCadastro) {
		DataCadastro = dataCadastro;
	}

	public ContatoModel getContato() {
		return Contato;
	}

	public void setContato(ContatoModel contato) {
		Contato = contato;
	}

	public EnderecoModel getEndereco() {
		return Endereco;
	}

	public void setEndereco(EnderecoModel endereco) {
		Endereco = endereco;
	}
	
	

}
