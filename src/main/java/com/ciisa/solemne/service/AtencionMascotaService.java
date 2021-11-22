package com.ciisa.solemne.service;

import java.util.List;

import com.ciisa.solemne.entity.AtencionMascota;

public interface AtencionMascotaService {

	public AtencionMascota addAtencionMascota(AtencionMascota atencionMascota);
	public List<AtencionMascota> listAllAtencionMascota();
	public int deleteAtencionMascota(int id);
}
