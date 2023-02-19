package test;

import java.util.Arrays;

public class Asiento {
	String color;
	int precio;
	int registro;

	void cambiarColor(String color) {
		String[] colores = { "rojo", "verde", "amarillo", "negro", "blanco" };

		if (Arrays.asList(colores).contains(color)) {
			this.color = color;

		}

	}
}