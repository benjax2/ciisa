package com.ciisa.solemne.repository;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciisa.solemne.entity.AtencionFecha;



@Repository("atencionFechaRepository")
public interface AtencionFechaRepository extends JpaRepository<AtencionFecha, Serializable>{
	
	public List<AtencionFecha> findByIdMascotaAndFechaAtencion(int idMascota, String fechaAtencion);


}
