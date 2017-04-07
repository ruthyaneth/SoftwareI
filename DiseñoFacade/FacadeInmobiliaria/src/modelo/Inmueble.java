package modelo;
import java.math.BigDecimal;

/**
 * @author Ruth
 * @version 1.0
 * @created 07-abr.-2017 10:15:07 a. m.
 */
public class Inmueble {

	private String descripci�n;
	private String direcci�n;
	private String tipoInmueble;
	private BigDecimal valor;
	public Compra m_Compra;
	public Muestra m_Muestra;
	public Venta m_Venta;
	public Alquiler m_Alquiler;

	

	public Inmueble(String descripci�n, String direcci�n, String tipoInmueble, BigDecimal valor) {
		super();
		this.descripci�n = descripci�n;
		this.direcci�n = direcci�n;
		this.tipoInmueble = tipoInmueble;
		this.valor = valor;
	}

	public String getDescripci�n() {
		return descripci�n;
	}

	public void setDescripci�n(String descripci�n) {
		this.descripci�n = descripci�n;
	}

	public String getDirecci�n() {
		return direcci�n;
	}

	public void setDirecci�n(String direcci�n) {
		this.direcci�n = direcci�n;
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