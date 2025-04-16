package com.system.rh.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.rh.entities.Endereco;
import com.system.rh.repositories.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	EnderecoRepository enderecoRepository;
	
	public List<Endereco> findAll(){
		return enderecoRepository.findAll();
	}
	
	public Endereco findById(Long id) {
		Optional<Endereco> endereco = enderecoRepository.findById(id);
		return endereco.get();
	}
}
