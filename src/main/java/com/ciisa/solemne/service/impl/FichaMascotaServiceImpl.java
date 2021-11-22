package com.ciisa.solemne.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.ciisa.solemne.entity.FichaMascota;
import com.ciisa.solemne.repository.FichaMascotaRepository;
import com.ciisa.solemne.service.FichaMascotaService;

@Service("fichaMascotaServiceImpl")
public class FichaMascotaServiceImpl implements FichaMascotaService {

	@Autowired
	@Qualifier("fichaMascotaRepository")
	private FichaMascotaRepository fichaMascotaRepository;
	
	
	
	@Override
	public List<FichaMascota> listFichaMascota() {
		return fichaMascotaRepository.findAll();
		}

	@Override
	public FichaMascota addFichaMascota(FichaMascota fichaMascota) {
		
		return fichaMascotaRepository.save(fichaMascota);
	}

	@Override
	public int deleteFichaMascota(int id) {
		fichaMascotaRepository.deleteById(id);
		return 0; 
	}

}