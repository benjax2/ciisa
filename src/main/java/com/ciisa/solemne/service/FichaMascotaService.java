package com.ciisa.solemne.service;

import java.util.List;

import com.ciisa.solemne.entity.FichaMascota;

public interface FichaMascotaService {

	public List<FichaMascota> listFichaMascota();
	public FichaMascota addFichaMascota(FichaMascota fichaMascota);
	public int deleteFichaMascota(int id);
}
