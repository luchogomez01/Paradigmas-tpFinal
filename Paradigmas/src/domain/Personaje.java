package domain;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class Personaje {
	
	//Inicializo la variable de la clase Laberinto
	Laberinto laberinto = new Laberinto ();
	
	//Inicializo variables para setear la posicion del pj
	private int ejeX = 40; 
	private int ejeY = 40; 
	
	private final int width = 40; 
	private final int height = 40; 
	
	private final int posicion = 40; 
	
	//Variable contador de muertes
	private int muertes = 0; 
	
	//Variable contador de niveles
	private int nivel = 1; 
	
	
	public void paint (Graphics grafico) {
		grafico.setColor(Color.white);
		grafico.fillOval(ejeX, ejeY, width, height);
		
		if(muertes <=15) {		
			//Imprimo muertes
			grafico.drawString("Muertes: " + Integer.toString(muertes), 10, 20);
			grafico.setColor(Color.white);
		}
		
		if(nivel <= 3) {			
			//Imprimo muertes
			grafico.drawString("Nivel: " + Integer.toString(nivel), 100, 20);
			grafico.setColor(Color.white);
		}
	}
	
	//Funcion para que el pj se mueva
	
	public void movimiento (KeyEvent evento) {
		//Inicializo variable con el lab para compararlo con la posicion del pj
		int [][] lab = laberinto.getLab();
		
		if(evento.getKeyCode() == 37) {
			//Tecla izquierda
			ejeX = ejeX - posicion;
			
		}else if(evento.getKeyCode() == 38) {
			//Tecla arriba
			ejeY = ejeY - posicion;
		}else if(evento.getKeyCode() == 39) {
			//Tecla derecha
			ejeX = ejeX + posicion;
		}else if(evento.getKeyCode() == 40) {
			//Tecla abajo
			ejeY = ejeY + posicion;
		}
		
		//Condicional que mata al pj si toca pared
		if(lab[ejeY/40][ejeX/40] == 1) {
			ejeX = 40; 
			ejeY = 40; 
			
			muertes ++;
			Juego.aumentarMuertes();
		}
		
		//Condicional que detecta cambio de lvl
		if(lab[ejeY/40][ejeX/40] == 2) {
			ejeX = 40; 
			ejeY = 40; 
			
			nivel ++;
			
			Juego.cambiaNivel();
		}


	}
}
