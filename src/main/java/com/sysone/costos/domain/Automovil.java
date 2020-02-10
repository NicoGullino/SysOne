package com.sysone.costos.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Automovil {
	@Id
	@Column
	int id;
	
	@Column
	String modelo;
	
	@Column
	String opcionales;
	
	@Column
	int precioFinal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecioFinal() {
		return precioFinal;
	}

	public void setPrecioFinal(int precioFinal) {
		this.precioFinal = precioFinal;
	}

	public String getOpcionales() {
		return opcionales;
	}

	public void setOpcionales(String opcionales) {
		this.opcionales = opcionales;
	}

	public Automovil(int id, String modelo, String opcionales, int precioFinal) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.opcionales = opcionales;
		this.precioFinal = precioFinal;
	}

	public Automovil() {
		this.precioFinal = 0;
	}
	
	
	
}