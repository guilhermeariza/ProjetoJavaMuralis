package com.br.desafio.javaMuralis.viaCep;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class EnderecoResponse{
	
	private String cep;
	private String logradouro;
	private String cidade;


	@JsonCreator
	public EnderecoResponse(@JsonProperty("cep") String cep,
							@JsonProperty("logradouro") String logradouro,
							@JsonProperty("localidade") String cidade) {
		this.cep = cep;
		this.logradouro = logradouro;
		this.cidade = cidade;
	}


}
