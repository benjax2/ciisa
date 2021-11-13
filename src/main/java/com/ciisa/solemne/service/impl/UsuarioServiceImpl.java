package com.ciisa.solemne.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ciisa.solemne.entity.Usuario;
import com.ciisa.solemne.repository.UsuarioRepository;
import com.ciisa.solemne.service.UsuarioService;

@Service("usuarioServiceImpl")
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	@Qualifier("usuarioRepository")
	private UsuarioRepository usuarioRepository;
	
	
	@Override
	public Usuario addUsuario(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}


	@Override
	public List<Usuario> listAllUsuario() {
		
		return usuarioRepository.findAll();
	}

}
