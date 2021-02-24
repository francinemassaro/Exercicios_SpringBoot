package com.game.GameStore.controller;

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

import com.game.GameStore.model.FaixaEtaria;
import com.game.GameStore.repository.FaixaEtariaRepository;

@RestController
@RequestMapping("/faixaetaria")
@CrossOrigin("*")
public class FaixaEtariaController {
	@Autowired
	private FaixaEtariaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<FaixaEtaria>>GetAll()
	{
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<FaixaEtaria>GetById(@PathVariable long id)
	{
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<FaixaEtaria>post(@RequestBody FaixaEtaria faixa)
	{
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(faixa));
	}
	
	@PutMapping
	public ResponseEntity<FaixaEtaria>put(@RequestBody FaixaEtaria faixa)
	{
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(faixa));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id)
	{
		repository.deleteById(id);
	}
	
	

}
