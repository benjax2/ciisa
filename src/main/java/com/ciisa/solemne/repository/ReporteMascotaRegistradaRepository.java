package com.ciisa.solemne.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ciisa.solemne.entity.ReporteMascotaRegistrada;

@Repository("reporteMascotaRegistradaRepository")
public interface ReporteMascotaRegistradaRepository extends JpaRepository<ReporteMascotaRegistrada, Serializable>{

	public List<ReporteMascotaRegistrada> findByIdUsuario(int idUsuario);

}
