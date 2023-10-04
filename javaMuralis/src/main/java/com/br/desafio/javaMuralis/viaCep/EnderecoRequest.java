package com.br.desafio.javaMuralis.viaCep;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EnderecoRequest {
	
	private String cep;
	private String numero;
	private String complemento;
	


	
}
