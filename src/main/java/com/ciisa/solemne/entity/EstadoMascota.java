package com.ciisa.solemne.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Estado_Mascota")
public class EstadoMascota {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id_estado_mascota")
	private Integer id;
	
    @Column(name = "dado_de_alta")
	private String dadoDeAlta;
    
    @Column(name = "hospitalizado")
    private String hospitalizado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDadoDeAlta() {
		return dadoDeAlta;
	}

	public void setDadoDeAlta(String dadoDeAlta) {
		this.dadoDeAlta = dadoDeAlta;
	}

	public String getHospitalizado() {
		return hospitalizado;
	}

	public void setHospitalizado(String hospitalizado) {
		this.hospitalizado = hospitalizado;
	}

}
