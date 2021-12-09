package com.ciisa.solemne.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ciisa.solemne.entity.AtencionFecha;
import com.ciisa.solemne.entity.AtencionMascota;
import com.ciisa.solemne.entity.ReporteMascotaRegistrada;
import com.ciisa.solemne.entity.ReporteNumeroAtenciones;
import com.ciisa.solemne.repository.AtencionFechaRepository;
import com.ciisa.solemne.repository.AtencionMascotaRepository;
import com.ciisa.solemne.repository.ReporteMascotaRegistradaRepository;
import com.ciisa.solemne.repository.ReporteNumeroAtencionesRepository;
import com.ciisa.solemne.service.AtencionMascotaService;



@Service("atencionMascotaServiceImpl")
public class AtencionMascotaServiceImpl implements AtencionMascotaService{
	
	@Autowired
	@Qualifier("atencionMascotaRepository")
	private AtencionMascotaRepository atencionMascotaRepository;
	
	@Autowired
	@Qualifier("atencionFechaRepository")
	private AtencionFechaRepository atencionFechaRepository;
	
	@Autowired
	@Qualifier("reporteNumeroAtencionRepository")
	private ReporteNumeroAtencionesRepository reporteNroAtencionesRepository;
	
	@Autowired
	@Qualifier("reporteMascotaRegistradaRepository")
	private ReporteMascotaRegistradaRepository reporteMascotaRegistradaRepository;

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

	@Override
	public List<AtencionFecha> listAtencionMascotaFecha(int idMascota, String fechaAtencion) {
		return atencionFechaRepository.findByIdMascotaAndFechaAtencion(idMascota, fechaAtencion);
	}

	@Override
	public List<ReporteMascotaRegistrada> listMascotaRegistrada(int idUsuario) {
		return reporteMascotaRegistradaRepository.findByIdUsuario(idUsuario);
	}

	@Override
	public List<ReporteNumeroAtenciones> listNroAtencion(int idMascota) {
		return reporteNroAtencionesRepository.findByIdMascota(idMascota);
	}

}
