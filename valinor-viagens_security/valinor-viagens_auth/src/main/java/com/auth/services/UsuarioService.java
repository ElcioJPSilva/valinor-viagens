package com.auth.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.auth.model.entities.Usuario;

public interface UsuarioService {
	
	BCryptPasswordEncoder passwordEncoder();
	Usuario save(Usuario usuario);	
}
