package modelo;
import java.math.BigDecimal;

/**
 * @author Ruth
 * @version 1.0
 * @created 07-abr.-2017 10:15:07 a. m.
 */
public class Inmueble {

	private String descripción;
	private String dirección;
	private String tipoInmueble;
	private BigDecimal valor;
	public Compra m_Compra;
	public Muestra m_Muestra;
	public Venta m_Venta;
	public Alquiler m_Alquiler;

	

	public Inmueble(String descripción, String dirección, String tipoInmueble, BigDecimal valor) {
		super();
		this.descripción = descripción;
		this.dirección = dirección;
		this.tipoInmueble = tipoInmueble;
		this.valor = valor;
	}

	public String getDescripción() {
		return descripción;
	}

	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}

	public String getDirección() {
		return dirección;
	}

	public void setDirección(String dirección) {
		this.dirección = dirección;
	}

	public String getTipoInmueble() {
		return tipoInmueble;
	}

	public void setTipoInmueble(String tipoInmueble) {
		this.tipoInmueble = tipoInmueble;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	
}//end Inmueble