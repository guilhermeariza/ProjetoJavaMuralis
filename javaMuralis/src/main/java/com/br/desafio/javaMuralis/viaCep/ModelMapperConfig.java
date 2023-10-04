package com.br.desafio.javaMuralis.viaCep;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //Classe não usada
public class ModelMapperConfig {
	
	@Bean
	public ModelMapper modelMapper() {
		var modelMapper = new ModelMapper();
		
		/*
		modelMapper.createTypeMap(EnderecoResponse.class, EnderecoResponseDTO.class)
			.<String>addMapping(src -> src.getCep(),        (dest, value) -> dest.setCep(value))
			.<String>addMapping(src -> src.getLogradouro(), (dest, value) -> dest.setLogradouro(value))
			.<String>addMapping(src -> src.getLocalidade(), (dest, value) -> dest.setCidade(value))
			.<String>addMapping(src -> src.getNumero(),      (dest, value) -> dest.setNumero(value))
			.<String>addMapping(src -> src.getComplemento(), (dest, value) -> dest.setComplemento(value));
			*/

		
		return modelMapper;
	}

}
