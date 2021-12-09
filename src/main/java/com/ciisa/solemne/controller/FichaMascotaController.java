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

import com.ciisa.solemne.entity.FichaMascota;
import com.ciisa.solemne.service.FichaMascotaService;

@Controller
@RestController
@RequestMapping("/fichaMascota")
public class FichaMascotaController {
	
	@Autowired
	@Qualifier("fichaMascotaServiceImpl")
	private FichaMascotaService fichaMascotaService;
	
	
	@GetMapping(value="/listFichaMascota")
	public ResponseEntity listFichaMascota() {
		
		try {
			return ResponseEntity.status(200).body(fichaMascotaService.listFichaMascota());

		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
		
	}
	
	@PostMapping(value="/addFichaMascota")
	public ResponseEntity postFichaMascota(@RequestBody FichaMascota fichaMascota) {
		try {
			fichaMascotaService.addFichaMascota(fichaMascota);
			return ResponseEntity.status(200).body("fichaMascota registrada correctamente");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
		
	}
	
	@PostMapping(value="/updateFichaMascota")
	public ResponseEntity updateFichaMascota(@RequestBody FichaMascota fichaMascota) {
		try {
			fichaMascotaService.addFichaMascota(fichaMascota);
			return ResponseEntity.status(200).body("Ficha mascota actualizada correctamente");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
	}
	
	@DeleteMapping(value="/deleteFichaMascota/{idFichaMascota}")
	public ResponseEntity deleteFichaMascota(@PathVariable("idFichaMascota") int idFichaMascota) {
		try {
			fichaMascotaService.deleteFichaMascota(idFichaMascota);
			return ResponseEntity.status(200).body("Ficha Mascota eliminada correctamente");
		} catch (Exception e) {
			return ResponseEntity.status(500).body(e);
		}
	}	

}
