package com.ciisa.solemne.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

@Entity
@Table(name = "atencion")
@Immutable
public class AtencionFecha {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name = "id_mascota")
	private Integer idMascota;
	
    @Column(name = "edad")
	private Integer edad;
    
    @Column(name = "numero_de_Atencion")
	private Integer numero_de_Atencion;
    
    @Column(name = "peso")
	private float peso;
    
    @Column(name = "nombre")
	private String nombre;
    
    @Column(name = "raza")
	private String raza;
    
    @Column(name = "glosa_de_la_Atencion")
	private String glosa_de_la_atencion;
    
    @Column(name = "fecha_Atencion")
    private String fechaAtencion;
    
	@Column(name = "razon_de_Atencion")
	private String razon_de_atencion;
    
    public Integer getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(Integer idMascota) {
		this.idMascota = idMascota;
	}

	public String getFecha_Atencion() {
		return fechaAtencion;
	}

	public void setFecha_Atencion(String fecha_Atencion) {
		this.fechaAtencion = fecha_Atencion;
	}
    
    public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getNumero_de_Atencion() {
		return numero_de_Atencion;
	}

	public void setNumero_de_Atencion(Integer numero_de_Atencion) {
		this.numero_de_Atencion = numero_de_Atencion;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getGlosa_de_la_atencion() {
		return glosa_de_la_atencion;
	}

	public void setGlosa_de_la_atencion(String glosa_de_la_atencion) {
		this.glosa_de_la_atencion = glosa_de_la_atencion;
	}

	public String getRazon_de_atencion() {
		return razon_de_atencion;
	}

	public void setRazon_de_atencion(String razon_de_atencion) {
		this.razon_de_atencion = razon_de_atencion;
	}


}
