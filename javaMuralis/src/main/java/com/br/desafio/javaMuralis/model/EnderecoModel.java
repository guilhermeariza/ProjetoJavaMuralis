package com.br.desafio.javaMuralis.model;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table(name = "tb_endereco")
@Data
@AllArgsConstructor
public class EnderecoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	

	private String Cep;
	

	private String Logradouro;
	

	private String Cidade;
	

	private String Numero;
	
	private String Complemento;

	public EnderecoModel(){}

	


	
	
}
