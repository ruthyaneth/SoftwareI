package Logic;

import java.math.BigDecimal;

public class Oto�o extends MapaDecorator{

	public Oto�o(DatosMapa datos) {
		super(datos);
	}
	
	@Override
	public String obtenerDescripcion() {
		
		return getDatos().obtenerDescripcion() + " Oto�o ,";
	}

	@Override
	public BigDecimal nivelJuego() {
		return getDatos().nivelJuego().add(new BigDecimal(2));
	}
}
