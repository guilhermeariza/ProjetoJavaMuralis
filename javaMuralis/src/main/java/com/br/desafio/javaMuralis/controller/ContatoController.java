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

import com.br.desafio.javaMuralis.model.ContatoModel;
import com.br.desafio.javaMuralis.repository.ContatoRepository;

@RestController
@RequestMapping("/contato")
@CrossOrigin("*")
public class ContatoController {
	
	@Autowired
	private ContatoRepository repository;
	
	@GetMapping("/listaTodos") // Retorna uma lista de todos Contatos
	public ResponseEntity<List<ContatoModel>>getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}") // Retorna um Contato específico por Id
	public ResponseEntity<ContatoModel>getById(@PathVariable Long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping("/cadastrar") // Cadastra um novo Contato
	public ResponseEntity<ContatoModel> post(@RequestBody ContatoModel contatoModel){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(contatoModel));
	}
	
	@PutMapping("/atualizar") // Atualiza um Contato pré-cadastrado
	public ResponseEntity<ContatoModel> put (@RequestBody ContatoModel contatoModel){
		return ResponseEntity.ok(repository.save(contatoModel));
	}
	
	@DeleteMapping("/{id}") // Deleta um Contato existente
	public void delete (@PathVariable long id){
		repository.deleteById(id);
	}

}
