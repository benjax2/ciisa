package com.ciisa.solemne.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "Atencion_Mascota")
public class AtencionMascota {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_Atencion_Mascota")
	private Integer id;
	
    @Column(name = "id_Estado_Mascota")
	private Integer idEstadoMascota;
    
    @Column(name = "numero_de_Atencion")
    private Integer numeroDeAtencion;
    
    @Column(name = "fecha_Atencion")
    private Date fecha_Atencion;
    
    @Column(name = "razon_de_Atencion")
    private String razonDeAtencion;
    
    @Column(name = "glosa_de_la_Atencion")
    private String glosaDeLaAtencion;
    
    

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdEstadoMascota() {
		return idEstadoMascota;
	}

	public void setIdEstadoMascota(Integer idEstadoMascota) {
		this.idEstadoMascota = idEstadoMascota;
	}

	public Integer getNumeroDeAtencion() {
		return numeroDeAtencion;
	}

	public void setNumeroDeAtencion(Integer numeroDeAtencion) {
		this.numeroDeAtencion = numeroDeAtencion;
	}

	public Date getFecha_Atencion() {
		return fecha_Atencion;
	}

	public void setFecha_Atencion(Date fecha_Atencion) {
		this.fecha_Atencion = fecha_Atencion;
	}

	public String getRazonDeAtencion() {
		return razonDeAtencion;
	}

	public void setRazonDeAtencion(String razonDeAtencion) {
		this.razonDeAtencion = razonDeAtencion;
	}

	public String getGlosaDeLaAtencion() {
		return glosaDeLaAtencion;
	}

	public void setGlosaDeLaAtencion(String glosaDeLaAtencion) {
		this.glosaDeLaAtencion = glosaDeLaAtencion;
	}

}
