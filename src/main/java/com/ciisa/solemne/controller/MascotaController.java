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

import com.ciisa.solemne.entity.Mascota;
import com.ciisa.solemne.service.MascotaService;

@Controller
@RestController
@RequestMapping("/mascota")

public class MascotaController {
	
	@Autowired
	@Qualifier("mascotaServiceImpl")
	private MascotaService mascotaService;
	
	
	@GetMapping(value="/getMascotas")
	public ResponseEntity getMascotas() {
		return ResponseEntity.status(200).body(mascotaService.listAllMascota());
		
	}
	
	@PostMapping(value="/addMascota")
	public ResponseEntity postMascota(@RequestBody Mascota mascota) {
		try {
			mascotaService.addMascota(mascota);
			return ResponseEntity.status(200).body("Mascota registrada correctamente");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
		
	}
	
	@PostMapping(value="/updateMascota")
	public ResponseEntity updateMascota(@RequestBody Mascota mascota) {
		try {
			mascotaService.addMascota(mascota);
			return ResponseEntity.status(200).body("Mascota actualizada correctamente");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
		
	}
	
	@DeleteMapping(value="/deleteMascota/{idMascota}")
	public ResponseEntity updateMascota(@PathVariable("idMascota") int idmascota) {
		try {
			mascotaService.deleteMascota(idmascota);
			return ResponseEntity.status(200).body("Mascota eliminada correctamente");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
		
	}

}
