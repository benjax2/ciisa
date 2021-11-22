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

import com.ciisa.solemne.entity.AtencionMascota;
import com.ciisa.solemne.entity.Mascota;
import com.ciisa.solemne.service.AtencionMascotaService;
import com.ciisa.solemne.service.MascotaService;

@Controller
@RestController
@RequestMapping("/atencionMascota")
public class AtencionMascotaController {

	@Autowired
	@Qualifier("atencionMascotaServiceImpl")
	private AtencionMascotaService atencionMascotaService;
	
	
	@GetMapping(value="/getAtencionMascota")
	public ResponseEntity getAtencionMascota() {
		return ResponseEntity.status(200).body(atencionMascotaService.listAllAtencionMascota());	
	}
	
	@PostMapping(value="/addAtencionMascota")
	public ResponseEntity addAtencionMascota(@RequestBody AtencionMascota atencionMascota) {
		try {
			atencionMascotaService.addAtencionMascota(atencionMascota);
			return ResponseEntity.status(200).body("Hora registrada correctamente");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
		
	}
	
	@PostMapping(value="/updateMascota")
	public ResponseEntity updateAtencionMascota(@RequestBody AtencionMascota atencionMascota) {
		try {
			atencionMascotaService.addAtencionMascota(atencionMascota);
			return ResponseEntity.status(200).body("Hora actualizada correctamente");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
		
	}
	
	@DeleteMapping(value="/deleteAtencionMascota/{idAtencionMascota}")
	public ResponseEntity updateMascota(@PathVariable("idAtencionMascota") int idAtencionMascota) {
		try {
			atencionMascotaService.deleteAtencionMascota(idAtencionMascota);
			return ResponseEntity.status(200).body("Hora de atencion eliminada correctamente");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
		
	}
	
	
	
	
}
