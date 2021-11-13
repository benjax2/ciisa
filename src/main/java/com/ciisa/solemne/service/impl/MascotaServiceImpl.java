package com.ciisa.solemne.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ciisa.solemne.entity.Mascota;
import com.ciisa.solemne.repository.MascotaRepository;
import com.ciisa.solemne.service.MascotaService;

@Service("mascotaServiceImpl")
public class MascotaServiceImpl implements MascotaService {

	

	@Autowired
	@Qualifier("mascotaRepository")
	private MascotaRepository mascotaRepository;
	
	@Override
	public List<Mascota> listAllMascota() {
		return mascotaRepository.findAll();
	}

	@Override
	public Mascota addMascota(Mascota mascota) {
		return mascotaRepository.save(mascota);
	}
	@Override
	public int deleteMascota(int id) {
		mascotaRepository.deleteById(id);
		return 0;
	}
	

}
