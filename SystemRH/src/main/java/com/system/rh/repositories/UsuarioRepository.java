package com.system.rh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.rh.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
