package Logic;

import java.math.BigDecimal;

public class MapaDos extends Mapa{
	
	public String obtenerDescripcion() {
		return "Mapa - Ascension: ";
	}
	
	public BigDecimal nivelJuego() {
		return new BigDecimal(10);
	}
}

