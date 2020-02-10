package com.sysone.costos.model;

public abstract class Vehiculo {

	protected String modelo;

	protected int precioBase;

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public Vehiculo(String modelo, int precioBase) {
		super();
		this.modelo = modelo;
		this.precioBase = precioBase;
	}
	
}

