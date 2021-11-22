package com.ciisa.solemne.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciisa.solemne.entity.FichaMascota;

@Repository("fichaMascotaRepository")
public interface FichaMascotaRepository extends JpaRepository<FichaMascota, Serializable>{
	

}
