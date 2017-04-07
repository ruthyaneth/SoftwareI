package Logic;

import java.math.BigDecimal;

public class Dia extends MapaDecorator{

	public Dia(DatosMapa datos) {
		super(datos);
	}
	
	@Override
	public String obtenerDescripcion() {
		
		return getDatos().obtenerDescripcion() + " Dia, ";
	}

	@Override
	public BigDecimal nivelJuego() {
		return getDatos().nivelJuego().add(new BigDecimal(1));
	}

}
