package com.ciisa.solemne.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciisa.solemne.entity.EstadoMascota;

@Repository("estadoMascotaRepository")
public interface EstadoMascotaRepository extends JpaRepository<EstadoMascota, Serializable> {
	
	List<EstadoMascota> findById(int id);

}
