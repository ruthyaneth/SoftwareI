package Logic;

import java.math.BigDecimal;

public class MapaTres extends Mapa{
	
	public String obtenerDescripcion() {
		return "Mapa - Centrodenaves: ";
	}
	
	public BigDecimal nivelJuego() {
		return new BigDecimal(10);
	}
}

