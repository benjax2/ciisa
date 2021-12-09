package com.ciisa.solemne.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reporte_mascota_registrada")
public class ReporteMascotaRegistrada {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_usuario")
	private int idUsuario;
	
    @Column(name = "nombre_usuario")
	private String nombreUsuario;
    
    @Column(name = "cantidad_mascotas")
	private int cantidadMascota;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public int getCantidadMascota() {
		return cantidadMascota;
	}

	public void setCantidadMascota(int cantidadMascota) {
		this.cantidadMascota = cantidadMascota;
	}

}
