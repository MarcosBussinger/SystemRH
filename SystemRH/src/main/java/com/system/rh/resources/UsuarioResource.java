package com.system.rh.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.rh.entities.Usuario;
import com.system.rh.services.UsuarioService;

@RestController
@RequestMapping("/usuarios")
public class UsuarioResource {

        @Autowired
	UsuarioService usuarioService;
	
	@GetMapping
	public ResponseEntity<List<Usuario>> findAll(){
		List<Usuario> list = usuarioService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Usuario> findById (@PathVariable Long id) {
		Usuario usuario = usuarioService.findById(id);
		return ResponseEntity.ok().body(usuario);
	}
}
