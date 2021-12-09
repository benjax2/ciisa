package com.ciisa.solemne.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "reporte_nro_atenciones")
@Immutable
public class ReporteNumeroAtenciones {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id_mascota")
	private int idMascota;
	
   
	@Column(name = "cantidad_atenciones")
	private int cantidadAtenciones;
	
    @Column(name = "nombre_mascota")
	private String nombre;
	
    @Column(name = "fecha_Atencion")
	private String fecha;
	
    @Column(name = "razon_de_Atencion")
	private String razonAtencion;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getRazonAtencion() {
		return razonAtencion;
	}
	public void setRazonAtencion(String razonAtencion) {
		this.razonAtencion = razonAtencion;
	}
	public int getCantidadAtenciones() {
		return cantidadAtenciones;
	}
	public void setCantidadAtenciones(int cantidadAtenciones) {
		this.cantidadAtenciones = cantidadAtenciones;
	}
	 public int getiDMascota() {
			return idMascota;
		}
		public void setiDMascota(int iDMascota) {
			this.idMascota = iDMascota;
		}
	
	
}
