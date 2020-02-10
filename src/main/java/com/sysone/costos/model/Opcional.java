package com.sysone.costos.model;

public abstract class Opcional
{
	protected int precio;
	protected String codigo;
	protected String descripcion;
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Opcional(int precio, String codigo, String descripcion) {
		super();
		this.precio = precio;
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	
	
}