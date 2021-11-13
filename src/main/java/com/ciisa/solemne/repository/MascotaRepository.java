package com.ciisa.solemne.repository;

import java.io.Serializable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciisa.solemne.entity.Mascota;

@Repository("mascotaRepository")
public interface MascotaRepository extends JpaRepository<Mascota, Serializable>{
	
	public Mascota findById(Integer id);
}
