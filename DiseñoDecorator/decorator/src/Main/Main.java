
package Main;

import Logic.DatosMapa;
import Logic.Dia;
import Logic.MapaDos;
import Logic.MapaTres;
import Logic.MapaUno;
import Logic.Noche;
import Logic.Otoño;
import Logic.Primavera;
import Logic.Verano;

public class Main {

	public static void main(String[] args) {
		//cabesera 
		System.out.println("MAPA- NOMBRE DEL MAPA - CARACTERISTICAS - NIVEL");
		System.out.println("");
		//Mapa1 encerrona
		DatosMapa MapaUno = new MapaUno();
		MapaUno = new MapaUno();
		MapaUno = new Dia(MapaUno);	
		MapaUno = new Primavera(MapaUno);
		System.out.println(MapaUno.obtenerDescripcion() + " "+ MapaUno.nivelJuego());
		//Mapa u 
		DatosMapa MapaU = new MapaUno();
		MapaU = new MapaUno();
		MapaU = new Noche(MapaU);	
		MapaU = new Verano(MapaU);
		System.out.println(MapaU.obtenerDescripcion() + " "+ MapaU.nivelJuego());
		
		// Mapa2
		DatosMapa Mapa2 = new MapaDos();
		Mapa2 = new Primavera(Mapa2);
		System.out.println(Mapa2.obtenerDescripcion() + " "+ Mapa2.nivelJuego());
		
		Mapa2 = new MapaDos();
		Mapa2 = new Dia(Mapa2);
		Mapa2 = new Otoño(Mapa2);
		
		System.out.println(Mapa2.obtenerDescripcion() + " "+ Mapa2.nivelJuego());
		
		//Mapa C
		DatosMapa Mapac = new MapaUno();
		Mapac = new MapaTres();
		Mapac = new Noche(Mapac);	
		Mapac = new Primavera(Mapac);
		System.out.println(Mapac.obtenerDescripcion() + " "+ Mapac.nivelJuego());
		System.out.println("Ademas otro ejemplo:se puede utilizar'decorator' para configurar las caracteristicas del avatar o personaje como armas,cascos,botas etc");
	}
	

}
