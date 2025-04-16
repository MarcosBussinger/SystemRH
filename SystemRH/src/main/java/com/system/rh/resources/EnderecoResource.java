package com.system.rh.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.rh.entities.Endereco;
import com.system.rh.services.EnderecoService;

@RestController
@RequestMapping("/enderecos")
public class EnderecoResource {
	
	@Autowired
	EnderecoService enderecoService;
	
	@GetMapping
	public ResponseEntity<List<Endereco>> findAll(){
		List<Endereco> list = enderecoService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Endereco> findById (@PathVariable Long id) {
		Endereco endereco = enderecoService.findById(id);
		return ResponseEntity.ok().body(endereco);
	}

}
