package com.ciisa.solemne.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ciisa.solemne.entity.EstadoMascota;
import com.ciisa.solemne.repository.EstadoMascotaRepository;
import com.ciisa.solemne.service.EstadoMascotaService;

@Service("estadoMascotaServiceImpl")
public class EstadoMascotaServiceImpl implements EstadoMascotaService {


	@Autowired
	@Qualifier("estadoMascotaRepository")
	private EstadoMascotaRepository estadoMascotaRepository;
	
	@Override
	public List<EstadoMascota> getMascotaById(int id) {
		return estadoMascotaRepository.findById(id);
	}
	
	@Override
	public EstadoMascota addEstadoMascota(EstadoMascota estadoMascota) {
		return estadoMascotaRepository.save(estadoMascota);
	}

	@Override
	public List<EstadoMascota> listAllEstadoMascota() {
		return estadoMascotaRepository.findAll();
	}

	@Override
	public int deleteEstadoMascota(int id) {
		estadoMascotaRepository.deleteById(id);
		return 0;
	}


	
	



}
