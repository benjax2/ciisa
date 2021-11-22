package com.ciisa.solemne.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ciisa.solemne.entity.EstadoMascota;
import com.ciisa.solemne.service.EstadoMascotaService;

@Controller
@RestController
@RequestMapping("/estadoMascota")
public class EstadoMascotaController {
	
	@Autowired
	@Qualifier("estadoMascotaServiceImpl")
	private EstadoMascotaService estadoMascotaService;
	
	@GetMapping(value="/getEstadoMascota")
	public ResponseEntity getEstadoMascota() {
		return ResponseEntity.status(200).body(estadoMascotaService.listAllEstadoMascota());	
	}
	
	@PostMapping(value="/addEstadoMascota")
	public ResponseEntity addEstadoMascota(@RequestBody EstadoMascota estadoMascota) {
		try {
			estadoMascotaService.addEstadoMascota(estadoMascota);
			return ResponseEntity.status(200).body("Estado registrado correctamente");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
	}
	
	@PostMapping(value="/updateEstadoMascota")
	public ResponseEntity updateAtencionMascota(@RequestBody EstadoMascota estadoMascota) {
		try {
			estadoMascotaService.addEstadoMascota(estadoMascota);
			return ResponseEntity.status(200).body("Estado actualizado correctamente");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
		
	}
	
	

}
