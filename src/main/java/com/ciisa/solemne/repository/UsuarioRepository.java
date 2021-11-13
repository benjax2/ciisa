package com.ciisa.solemne.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciisa.solemne.entity.Usuario;

@Repository("usuarioRepository")

public interface UsuarioRepository extends JpaRepository<Usuario, Serializable> {
	
	

}
