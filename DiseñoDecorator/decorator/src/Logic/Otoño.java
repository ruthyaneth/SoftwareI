package Logic;

import java.math.BigDecimal;

public class Otoño extends MapaDecorator{

	public Otoño(DatosMapa datos) {
		super(datos);
	}
	
	@Override
	public String obtenerDescripcion() {
		
		return getDatos().obtenerDescripcion() + " Otoño ,";
	}

	@Override
	public BigDecimal nivelJuego() {
		return getDatos().nivelJuego().add(new BigDecimal(2));
	}
}
