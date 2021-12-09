package com.ciisa.solemne.service;

import java.util.List;

import com.ciisa.solemne.entity.EstadoMascota;

public interface EstadoMascotaService {
	
	public EstadoMascota addEstadoMascota(EstadoMascota estadoMascota);
	public List<EstadoMascota> listAllEstadoMascota();
	public List<EstadoMascota> getMascotaById(int id);
	public int deleteEstadoMascota(int id);

}
