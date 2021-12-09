package com.ciisa.solemne.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciisa.solemne.entity.ReporteNumeroAtenciones;

@Repository("reporteNumeroAtencionRepository")
public interface ReporteNumeroAtencionesRepository extends JpaRepository<ReporteNumeroAtenciones, Serializable>{
	
	public List<ReporteNumeroAtenciones> findByIdMascota(int idMascota);
}
