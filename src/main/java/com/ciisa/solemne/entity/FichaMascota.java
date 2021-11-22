package com.ciisa.solemne.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Ficha_Mascota")
public class FichaMascota {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_ficha_mascota")
    private Integer id;
	
    @Column(name = "id_mascota")
	private Integer idMascota;
    
    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;

	@Column(name="vacunas_aplicadas")
    private String vacunasAplicadas;
    
    public Integer getId() {
		return id;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(Integer idMascota) {
		this.idMascota = idMascota;
	}

	


	public String getVacunasAplicadas() {
		return vacunasAplicadas;
	}

	public void setVacunasAplicadas(String vacunasAplicadas) {
		this.vacunasAplicadas = vacunasAplicadas;
	}




}
