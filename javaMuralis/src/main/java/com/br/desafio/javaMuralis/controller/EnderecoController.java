package com.br.desafio.javaMuralis.controller;

import java.util.List;

import com.br.desafio.javaMuralis.model.EnderecoRequestModel;
import com.br.desafio.javaMuralis.viaCep.EnderecoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.desafio.javaMuralis.model.EnderecoModel;
import com.br.desafio.javaMuralis.repository.EnderecoRepository;
import com.br.desafio.javaMuralis.viaCep.EnderecoRequest;
import com.br.desafio.javaMuralis.viaCep.EnderecoService;

@RestController
@RequestMapping("endereco")
@CrossOrigin("*")
public class EnderecoController {
	
	@Autowired
	private EnderecoRepository repository;	

	@Autowired
	private EnderecoService enderecoService;
    


    @GetMapping("/consultateste")
    public ResponseEntity consultaCep(@RequestBody EnderecoRequest enderecoRequest) {
        return ResponseEntity.ok(enderecoService.getAddress(enderecoRequest.getCep()));
    }
	
	@GetMapping("/listaTodos") // Retorna uma lista de todos Endereços
	public ResponseEntity<List<EnderecoModel>>getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}") // Retorna um Endereço específico por Id
	public ResponseEntity<EnderecoModel>getById(@PathVariable Long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping("/cadastrar") // Cadastra um novo Endereço
	public ResponseEntity<EnderecoModel> post(@RequestBody EnderecoRequestModel enderecoRequestModel){

		EnderecoResponse enderecoResponse = enderecoService.getAddress(enderecoRequestModel.getCep());
		System.out.println(enderecoResponse.getCidade());
		EnderecoModel enderecoModel = new EnderecoModel(null, enderecoResponse.getCep(), enderecoResponse.getLogradouro(), enderecoResponse.getCidade(), enderecoRequestModel.getNumero(), enderecoRequestModel.getComplemento());

		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(enderecoModel));
	}
	
	@PutMapping("/atualizar") // Atualiza um Endereço pré-cadastrado
	public ResponseEntity<EnderecoModel> put (@RequestBody EnderecoModel enderecoModel){
		return ResponseEntity.ok(repository.save(enderecoModel));
	}
	
	@DeleteMapping("/{id}") // Deleta um Endereço existente
	public void delete (@PathVariable long id){
		repository.deleteById(id);
	}
	
	

}
