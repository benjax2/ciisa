package com.ciisa.solemne.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ciisa.solemne.entity.AtencionMascota;
import com.ciisa.solemne.repository.AtencionMascotaRepository;
import com.ciisa.solemne.service.AtencionMascotaService;



@Service("atencionMascotaServiceImpl")
public class AtencionMascotaServiceImpl implements AtencionMascotaService{
	
	@Autowired
	@Qualifier("atencionMascotaRepository")
	private AtencionMascotaRepository atencionMascotaRepository;

	@Override
	public AtencionMascota addAtencionMascota(AtencionMascota atencionMascota) {
		return atencionMascotaRepository.save(atencionMascota);
	}

	@Override
	public List<AtencionMascota> listAllAtencionMascota() {
		return atencionMascotaRepository.findAll();
	}

	@Override
	public int deleteAtencionMascota(int id) {
		atencionMascotaRepository.deleteById(id);
		return 0;
	}

}
