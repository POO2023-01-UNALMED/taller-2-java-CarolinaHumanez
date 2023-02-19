package test;

public class Auto {
	String modelo;
	int precio;
	String marca;
	Asiento asientos[];
	Motor motor;
	int registro;
	static int cantidadCreados;

	int cantidadAsientos() {
		int numAsientos = 0;

		for (int i = 0; i < asientos.length; i++) {
			if (asientos[i] instanceof Asiento) {
				numAsientos++;
			}
		}
		return numAsientos;
	}

	String verificarIntegridad() 
	{

		if(registro == motor.registro)
		{
			for(int i = 0; i <asientos.length; i++)
			{
				if(asientos[i] != null)
				{
					if (asientos[i].registro != registro)
					{
						return "Las piezas no son originales";
					}
				}
			}
			return "Auto original";
		}else{
			return "Las piezas no son originales";
		}
	}

}
