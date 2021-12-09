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
import com.ciisa.solemne.entity.EstadoMascota;
import com.ciisa.solemne.service.EstadoMascotaService;

@Controller
@RestController
@RequestMapping("/estadoMascota")
public class EstadoMascotaController {
	
	@Autowired
	@Qualifier("estadoMascotaServiceImpl")
	private EstadoMascotaService estadoMascotaService;
	
	@GetMapping(value="/getEstadoMascota/{idMascota}")
	public ResponseEntity getEstadoMascota(@PathVariable("idMascota") int idmascota) {
		return ResponseEntity.status(200).body(estadoMascotaService.getMascotaById(idmascota));	
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
	
	@DeleteMapping(value="/deleteEstadoMascota/{idMascota}")
	public ResponseEntity deleteEstadoMascota(@PathVariable("idMascota") int idmascota) {
		try {
			estadoMascotaService.deleteEstadoMascota(idmascota);
			return ResponseEntity.status(200).body("Estado mascota eliminada correctamente");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
		
	}
	
	

}
