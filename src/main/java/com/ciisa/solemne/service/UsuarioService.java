package com.ciisa.solemne.service;

import java.util.List;

import com.ciisa.solemne.entity.Usuario;

public interface UsuarioService {
	public Usuario addUsuario(Usuario usuario);
	public List<Usuario> listAllUsuario();
	public int deleteUsuario(int id);


}
