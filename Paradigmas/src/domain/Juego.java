package domain;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Juego extends JPanel{
	
	//Obtengo objetos de laberinto y pj
	Laberinto laberinto = new Laberinto();
	Personaje personaje = new Personaje();
	public static int nivel = 1;
	public static int muertes = 0;
	
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
	
	// Aumentar lvl
    public static int cambiaNivel(){
        return nivel++;
    }

    // Obtener lvl
    public static int obtieneNivel(){
        return nivel;
    }
    
    // Aumentar muertes
    public static int aumentarMuertes() {
    	return muertes ++;
    }
    
    public static int obtieneMuertes() {
    	return muertes;
    }
	
	public static void main (String[] args) {
		
		JOptionPane.showMessageDialog(null, "Bienvenido al laberinto\nCantidad de niveles: 3\nLimite de muertes: 15");
		JFrame ventana =  new JFrame("Laberinto");
		Juego game = new Juego();
		ventana.add(game);
		
		ventana.setSize(920, 540);
		ventana.setLocation(300, 200);
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Bucle infinito para que repinte al pj
		
        while(true){
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Juego.class.getName()).log(Level.SEVERE, null, ex);
            }
            game.repaint();

            if(obtieneNivel()>3){
                JOptionPane.showMessageDialog(null, "Ganaste: cantidad de muertes: " + obtieneMuertes());
                System.exit(0);
            }
            
            if(obtieneMuertes()>=15){
                JOptionPane.showMessageDialog(null, "Perdiste: No te quedan mas muertes");
                System.exit(0);
            }
        }
	
	}
}
