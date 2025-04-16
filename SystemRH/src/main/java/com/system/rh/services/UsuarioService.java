package com.system.rh.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.rh.entities.Usuario;
import com.system.rh.repositories.UsuarioRepository;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    public List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    public Usuario findById(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.get();
    }
}
