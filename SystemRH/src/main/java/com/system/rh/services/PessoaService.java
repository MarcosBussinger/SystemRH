package com.system.rh.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.rh.entities.Pessoa;
import com.system.rh.repositories.PessoaRepository;

@Service
public class PessoaService {
    @Autowired
    private PessoaRepository pessoaRepository;
    
    public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
    }

    public Pessoa findById(Long id) {
        Optional<Pessoa> pessoa = pessoaRepository.findById(id);
        return pessoa.get();
    }
}
