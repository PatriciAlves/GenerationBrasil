package com.generation.blogpessoal.controller;

import java.util.List;

import javax.validation.Valid;

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


import com.generation.blogpessoal.model.Tema;
import com.generation.blogpessoal.repository.TemaRepository;

@RestController
@RequestMapping("/temas")
@CrossOrigin(origins = "*", allowedHeaders = "*") // habilita as requisições do front
public class TemaController {
	
	@Autowired
	private TemaRepository temaRepository;
	
	@GetMapping
	public ResponseEntity<List<Tema>> getAll() {
		return ResponseEntity.ok(temaRepository.findAll()); // select * from tb_temas;
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Tema>> getByDescricao(@PathVariable String descricao) {
		return ResponseEntity.ok(temaRepository.findAllByDescricaoContainingIgnoreCase(descricao));

		// select*from tb_postagens where titulo like "%titulo%";
	}
	@GetMapping("/{id}")
	public ResponseEntity<Tema> getById(@PathVariable Long id) {
		return temaRepository.findById(id)
			.map(resposta -> ResponseEntity.ok(resposta))
			.orElse(ResponseEntity.notFound().build());
	}

	@PostMapping
	public ResponseEntity<Tema> putTema(@Valid @RequestBody Tema tema) {
		return ResponseEntity.status(HttpStatus.CREATED).body(temaRepository.save(tema));
	}

	@PutMapping
	public ResponseEntity<?> postTema(@Valid @RequestBody Tema tema) {
		if (tema.getId() == null) {
			return new ResponseEntity<String>("Porfavor informe o ID da postagem que deseja atualizar",
					HttpStatus.BAD_REQUEST);
		} else {

			return ResponseEntity.status(HttpStatus.OK).body(temaRepository.save(tema));
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteTema(@PathVariable Long id) {
		return temaRepository.findById(id).map(resposta -> {
			temaRepository.deleteById(id);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

		}).orElse(ResponseEntity.notFound().build());

	}
	


}