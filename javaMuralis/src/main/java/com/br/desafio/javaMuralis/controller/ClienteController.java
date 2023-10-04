package com.br.desafio.javaMuralis.controller;

import java.util.List;

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

import com.br.desafio.javaMuralis.model.ClienteModel;
import com.br.desafio.javaMuralis.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
@CrossOrigin("*")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;
	
	@GetMapping("/listaTodos") // Retorna uma lista de todos Clientes
	public ResponseEntity<List<ClienteModel>>getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}") // Retorna um Cliente específico por Id
	public ResponseEntity<ClienteModel>getById(@PathVariable Long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping("/cadastrar") // Cadastra um novo Cliente
	public ResponseEntity<ClienteModel> post(@RequestBody ClienteModel clienteModel){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(clienteModel));
	}
	
	@PutMapping("/atualizar") // Atualiza um Cliente pré-cadastrado
	public ResponseEntity<ClienteModel> put (@RequestBody ClienteModel clienteModel){
		return ResponseEntity.ok(repository.save(clienteModel));
	}
	
	@DeleteMapping("/{id}") // Deleta um Cliente existente
	public void delete (@PathVariable long id){
		repository.deleteById(id);
	}

}
