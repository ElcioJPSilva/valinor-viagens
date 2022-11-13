package com.auth.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auth.model.entities.Passagem;
import com.auth.repositories.PassagemRepository;
import com.auth.services.PassagemService;

@Service
public class PassagemServiceImpl implements PassagemService {
	
	@Autowired
	PassagemRepository passagemRepository;
	
	@Override
	public List<Passagem> listAll() {	
		return passagemRepository.findAll();
	}

}
