package Logic;

import java.math.BigDecimal;

public class Verano extends MapaDecorator{

	public Verano(DatosMapa datos) {
		super(datos);
	}
	
	@Override
	public String obtenerDescripcion() {
		
		return getDatos().obtenerDescripcion() + " Verano ,";
	}

	@Override
	public BigDecimal nivelJuego() {
		return getDatos().nivelJuego().add(new BigDecimal(2));
	}
}
