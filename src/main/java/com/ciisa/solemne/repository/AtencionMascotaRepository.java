package com.ciisa.solemne.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.ciisa.solemne.entity.AtencionMascota;

@Repository("atencionMascotaRepository")
public interface AtencionMascotaRepository extends JpaRepository<AtencionMascota, Serializable> {
	

}
