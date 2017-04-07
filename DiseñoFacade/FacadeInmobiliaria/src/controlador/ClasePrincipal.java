package controlador;

import java.math.BigDecimal;

import facade.Inmobiliaria;
import modelo.Inmueble;
/**
 * 
 * @author Ruth
 *Esta es la clase principal del sistema
 */
public class ClasePrincipal {
	
	public static void main(String[] args) {
		

	Inmobiliaria inmobiliaria = new Inmobiliaria();
	inmobiliaria.setM_Inmueble(new Inmueble("Lote1", "Boyaca", "Lote", new BigDecimal(150000000)));
	}
}
