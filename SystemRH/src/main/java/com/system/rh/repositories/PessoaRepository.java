package com.system.rh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.rh.entities.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
