package com.ciisa.solemne.service;

import java.util.List;
import com.ciisa.solemne.entity.Mascota;

public interface MascotaService {
	
	public List<Mascota> listAllMascota();
	public Mascota addMascota(Mascota mascota);
	public int deleteMascota(int id);
	

}
