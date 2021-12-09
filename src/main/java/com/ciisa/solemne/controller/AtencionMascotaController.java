package com.ciisa.solemne.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

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
import com.ciisa.solemne.service.AtencionMascotaService;

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
	
	@GetMapping(value="/getAtencionMascotaFecha")
	public ResponseEntity  getAtencionMascotaFecha(@RequestBody RequestAtencionFecha atencionFecha) {
		
		int idMascota = atencionFecha.idMascota;
		String fecha = atencionFecha.fechaAtencion;
		try {
			return ResponseEntity.status(200).body(atencionMascotaService.listAtencionMascotaFecha(idMascota, fecha));	
		} catch (Exception e) {
			return ResponseEntity.status(500).body("Error en listar mascota por fecha");	
		}
	}
	
	@GetMapping(value="/getReporteNumeroAtenciones/{idMascota}")
	public ResponseEntity  getReporteNumeroAtenciones(@PathVariable("idMascota") int idMascota) {
		try {
			return ResponseEntity.status(200).body(atencionMascotaService.listNroAtencion(idMascota));	
		} catch (Exception e) {
			return ResponseEntity.status(500).body("Error servicio ");	
		}
	}
	
	@GetMapping(value="/getReporteMascotaRegistrada/{idUsuario}")
	public ResponseEntity  getReporteMascotaRegistrada(@PathVariable("idUsuario") int idUsuario) {
		try {
			return ResponseEntity.status(200).body(atencionMascotaService.listNroAtencion(idUsuario));	
		} catch (Exception e) {
			return ResponseEntity.status(500).body("Error servicio ");	
		}
	}
}
