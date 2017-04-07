package facade;

import modelo.Asesorias;
import modelo.Finanzas;
import modelo.Inmueble;

/**
 * @author Ruth Rojas
 * @version 1.0
 * @created 07-abr.-2017 10:15:07 a. m.
 */
// Esta clase representa el diseño en Facade del sistema 
// Através de esta clase podemos acceder a los demas servicios que
//Ofrece la inmobiliaria 
public class Inmobiliaria {

	public Finanzas m_Finanzas;
	public Inmueble m_Inmueble;
	public Asesorias m_Asesorias;

	public Inmobiliaria(){

	}

	public Asesorias getAsesorias(){
		return null;
	}

	public Finanzas getFinanzas(){
		return null;
	}

	public Inmueble getInmueble(){
		return null;
	}

	public Inmueble getM_Inmueble() {
		return m_Inmueble;
	}

	public void setM_Inmueble(Inmueble m_Inmueble) {
		this.m_Inmueble = m_Inmueble;
	}
	
}//end Inmobiliaria