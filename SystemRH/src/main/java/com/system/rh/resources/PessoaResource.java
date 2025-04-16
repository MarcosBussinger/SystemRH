package com.system.rh.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.rh.entities.Pessoa;
import com.system.rh.services.PessoaService;

@RestController
@RequestMapping("/pessoas")
public class PessoaResource {

    @Autowired
	PessoaService pessoaService;
	
	@GetMapping
	public ResponseEntity<List<Pessoa>> findAll(){
		List<Pessoa> list = pessoaService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Pessoa> findById (@PathVariable Long id) {
		Pessoa pessoa = pessoaService.findById(id);
		return ResponseEntity.ok().body(pessoa);
	}

}
