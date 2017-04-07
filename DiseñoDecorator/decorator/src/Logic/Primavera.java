package Logic;

import java.math.BigDecimal;

public class Primavera extends MapaDecorator{

	public Primavera(DatosMapa datos) {
		super(datos);
	}
	
	@Override
	public String obtenerDescripcion() {
		
		return getDatos().obtenerDescripcion() + " Primavera ,";
	}

	@Override
	public BigDecimal nivelJuego() {
		return getDatos().nivelJuego().add(new BigDecimal(3));
	}

}
