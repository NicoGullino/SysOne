package com.sysone.costos.model;

public abstract class VehiculoFactory {
	
	private VehiculoFactory() {}
	
	public static Vehiculo createVehiculo(String name) {
				
		if(name.equalsIgnoreCase("Familiar"))
			return new Familiar();

		if(name.equalsIgnoreCase("Coupé"))
			return new Coupe();
		
		if(name.equalsIgnoreCase("Sedán"))
			return new Sedan();

		return new VehiculoNull();
	}
}
