package com.br.desafio.javaMuralis.viaCep;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EnderecoService {

	@Autowired
	private RestTemplate restTemplate;

	private static final String VIA_CEP_URL = "https://viacep.com.br/ws/{cep}/json";

	public EnderecoResponse getAddress(String cep){
		String url = VIA_CEP_URL.replace("{cep}", cep);
		EnderecoResponse endereco = restTemplate.getForObject(url, EnderecoResponse.class);
		return endereco;
	}

	/*private final ModelMapper modelMapper;
	
	@Autowired
	public EnderecoService(EnderecoFeign enderecoFeign, ModelMapper modelMapper) {
		this.enderecoFeign = enderecoFeign;
		this.modelMapper = modelMapper;
	}

	public EnderecoResponseDTO executa(EnderecoRequest request) {
		EnderecoResponse enderecoResponse = new EnderecoResponse();
		
		enderecoResponse = enderecoFeign.buscaEnderecoCep(request.getCep());
	
		enderecoResponse.setComplemento(request.getComplemento());
		enderecoResponse.setNumero(request.getNumero());
		
		EnderecoResponseDTO enderecoResponseDTO = modelMapper.map(enderecoResponse, EnderecoResponseDTO.class);
		enderecoResponseDTO.setCidade(enderecoResponse.getLocalidade());

		
		return enderecoResponseDTO;
	}*/
}
