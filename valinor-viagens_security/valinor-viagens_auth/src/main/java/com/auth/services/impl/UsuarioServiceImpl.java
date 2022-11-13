package com.auth.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.auth.model.entities.Usuario;
import com.auth.repositories.UsuarioRepository;
import com.auth.services.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository userRepository;	
	
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	@Override
	public Usuario save(Usuario usuario) {
		
		Usuario existsUsuario = userRepository.findByUsername(usuario.getUsername());	
		
		if (existsUsuario != null) {
			throw new Error("Usuário já existe."); 
		}
		
		usuario.setSenha(passwordEncoder().encode(usuario.getSenha()));
				
		Usuario usuarioCriado = userRepository.save (usuario);
		
	return usuarioCriado;
	}
	
}
