package com.ciisa.solemne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ciisa.solemne.entity.Usuario;
import com.ciisa.solemne.service.MascotaService;
import com.ciisa.solemne.service.UsuarioService;

@Controller
@RestController
@RequestMapping("/usuario")

public class UsuarioController {
	
	@Autowired
	@Qualifier("usuarioServiceImpl")
	private UsuarioService usuarioService;
	
	
	
	@GetMapping(value="/getUsuarios")
	public ResponseEntity getUsuarios() {
		return ResponseEntity.status(200).body(usuarioService.listAllUsuario());
		
	}
	
	
	@PostMapping(value="/addUsuario")
	public ResponseEntity addUsuario(@RequestBody Usuario usuario) {
		
		try {
			usuarioService.addUsuario(usuario);
			return ResponseEntity.status(200).body("Usuario registrado correctamente");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
	
		
	}
	
	@PostMapping(value="/updateUsuario")
	public ResponseEntity updateUsuario(@RequestBody Usuario usuario) {
		
		try {
			usuarioService.addUsuario(usuario);
			return ResponseEntity.status(200).body("Usuario actualizado correctamente");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}	
	}
	@DeleteMapping(value="/deleteUsuario/{idUsuario}")
	public ResponseEntity updateMascota(@PathVariable("idUsuario") int idUsuario) {
		try {
			usuarioService.deleteUsuario(idUsuario);
			return ResponseEntity.status(200).body("Usuario eliminado correctamente");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
		
	}

}
