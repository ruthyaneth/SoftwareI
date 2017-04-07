package Logic;

public abstract class MapaDecorator implements DatosMapa{

	private DatosMapa datos;
	
	public MapaDecorator(DatosMapa datos) {
		setDatos(datos);
	}
	
	/**
	 * @return the datos
	 */
	public DatosMapa getDatos() {
		return datos;
	}

	/**
	 * @param datos the datos to set
	 */
	public void setDatos(DatosMapa datos) {
		this.datos = datos;
	}
}
