package com.sysone.costos.dto;

import java.util.HashSet;
import java.util.Set;

import com.sysone.costos.domain.Automovil;
import com.sysone.costos.model.Opcional;
import com.sysone.costos.model.OpcionalFactory;
import com.sysone.costos.model.Vehiculo;
import com.sysone.costos.model.VehiculoFactory;

public class AutomovilDTO {
private int id;
	
	private String nombre;
	
	private Set<String> opcionales;
	
	private int precio;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<String> getOpcionales() {
		return opcionales;
	}

	public void setOpcionales(Set<String> opcionales) {
		this.opcionales = opcionales;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public AutomovilDTO() {
		super();
		this.setId(0);
		this.setNombre("");
		this.setOpcionales(new HashSet<String>());
		this.setPrecio(0);
	}
	
	public AutomovilDTO createNewDTO() {
		return new AutomovilDTO(this.id,this.nombre,this.opcionales,this.precio);
		
	}

	public AutomovilDTO(int id, String nombre, Set<String> opcionales, int precio) {
		super();

		this.setId(id);
		this.setNombre(nombre);
		this.setOpcionales(opcionales);
		this.setPrecio(0);
		
		int precioFinal = 0;
		Vehiculo vehiculo = VehiculoFactory.createVehiculo(nombre);
		precioFinal += vehiculo.getPrecioBase();
		
		for (String codigoOpcional : opcionales) {
			Opcional opcional = OpcionalFactory.createOpcional(codigoOpcional);
			precioFinal += opcional.getPrecio();
		}
		
		this.setPrecio(precioFinal);
		
	}
	
	public AutomovilDTO(Automovil automovil) {
		this.loadDTO(automovil);
	}

	public void loadDTO(Automovil entity) {
		int id = entity.getId();
		String nombre = entity.getModelo();
		
		Set<String> opcionales = new HashSet<String>();
		for(String opcional : entity.getOpcionales().split(",")) {
			opcionales.add(opcional);
		}
		
		this.setId(id);
		this.setNombre(nombre);
		this.setOpcionales(opcionales);
		this.setPrecio(entity.getPrecioFinal());
	}
	
	public Automovil toEntity() {
		
		Automovil entity = new Automovil();
		entity.setId(this.getId());
		entity.setModelo(this.getNombre());
		String opcionales = "";
		
		for(String opcional : this.getOpcionales()) {
			opcionales += opcional + ",";
		}
		opcionales.substring(0, opcionales.length()-2);
		entity.setOpcionales(opcionales);
		entity.setPrecioFinal(this.getPrecio());
		return entity;
	}
}
