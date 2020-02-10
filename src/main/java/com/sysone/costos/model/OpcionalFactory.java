package com.sysone.costos.model;

public class OpcionalFactory {
	
	private OpcionalFactory() {}
	
	public static Opcional createOpcional(String cod) {
		

		if(cod.equalsIgnoreCase("TC"))
			return new TechoCorredizo();
		
		if(cod.equalsIgnoreCase("LL"))
			return new LlantasAleacion();
		
		if(cod.equalsIgnoreCase("ABS"))
			return new SistemaFrenosABS();
		
		if(cod.equalsIgnoreCase("AA"))
			return new AireAcondicionado();
		
		if(cod.equalsIgnoreCase("AB"))
			return new Airbag();
		
		return new OpcionalNull();
		
	}
}
