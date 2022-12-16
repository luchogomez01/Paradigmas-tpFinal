package domain;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Juego extends JPanel{
	
	//Obtengo objetos de laberinto y pj
	Laberinto laberinto = new Laberinto();
	Personaje personaje = new Personaje();
	
	public Juego() {
		addKeyListener((KeyListener) new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				personaje.movimiento(e);
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}});
		
		//Para que el constructor mantenga el foco y se vea mas nat el movimiento
		setFocusable(true);
	}
	
	//Metodo paint para poder dibujar el juego (laberinto y pj)
	public void paint (Graphics grafico) {
		laberinto.paint(grafico);
		personaje.paint(grafico);
	}
	
	public static void main (String[] args) {
		JFrame ventana =  new JFrame("Laberinto");
		Juego game = new Juego();
		ventana.add(game);
		
		ventana.setSize(920, 540);
		ventana.setLocation(300, 200);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Bucle infinito para que repinte al pj
		
		while(true) {
			//try y catch para manejar hilos
			
			//Retraso para repintar el juego
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//Para reimprimir el juego
			game.repaint();
		}
	}
	
}