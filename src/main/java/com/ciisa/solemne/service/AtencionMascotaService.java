package com.ciisa.solemne.service;

import java.util.Date;
import java.util.List;

import com.ciisa.solemne.entity.AtencionFecha;
import com.ciisa.solemne.entity.AtencionMascota;
import com.ciisa.solemne.entity.ReporteMascotaRegistrada;
import com.ciisa.solemne.entity.ReporteNumeroAtenciones;
import com.ciisa.solemne.repository.AtencionFechaRepository;

public interface AtencionMascotaService {

	public AtencionMascota addAtencionMascota(AtencionMascota atencionMascota);
	public List<AtencionMascota> listAllAtencionMascota();
	public int deleteAtencionMascota(int id);
	public List<AtencionFecha> listAtencionMascotaFecha(int idMascota, String fechaAtencion);
	public List<ReporteNumeroAtenciones> listNroAtencion(int idMascota);
	public List<ReporteMascotaRegistrada> listMascotaRegistrada(int idUsuario);


}
