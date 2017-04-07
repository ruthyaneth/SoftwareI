package Logic;

import java.math.BigDecimal;

public class Noche extends MapaDecorator{

	public Noche(DatosMapa datos) {
		super(datos);
	}
	
	@Override
	public String obtenerDescripcion() {
		
		return getDatos().obtenerDescripcion() + " Noche, ";
	}

	@Override
	public BigDecimal nivelJuego() {
		return getDatos().nivelJuego().add(new BigDecimal(1));
	}

}
