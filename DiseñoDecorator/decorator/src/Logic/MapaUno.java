package Logic;

import java.math.BigDecimal;

public class MapaUno extends Mapa{
	
	public String obtenerDescripcion() {
		return "Mapa - Encerrona: ";
	}
	
	public BigDecimal nivelJuego() {
		return new BigDecimal(20);
	}
}

