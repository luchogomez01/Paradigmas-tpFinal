package domain;

import java.awt.Color;
import java.awt.Graphics;

	public class Laberinto {
		
		//Inicializo variables del lab
		private int fila = 0; 
		private int columna = 0; 
		
		int[][]lab=new int[13][23];
		private int nivelLab = 1; 
		
		private final int numFila = 13; 
		private final int numColumn = 23; 
		
		private final int widthPared = 40; 
		private final int heightPared = 40; 
		
		public void paint (Graphics grafico) {
			//Obtengo laberinto
			int [][] lab = getLab ();
			
			//Imprimo laberinto en la app
			for(fila=0; fila<numFila; fila ++) {
				for(columna=0; columna<numColumn; columna ++) {
					if(lab[fila][columna]==1){
                                                if(Juego.obtieneNivel()==1){grafico.setColor(Color.darkGray);}
                                                if(Juego.obtieneNivel()==2){grafico.setColor(Color.pink);}
                                                if(Juego.obtieneNivel()>=3){grafico.setColor(Color.magenta);}    
                                                grafico.fillRect(columna*40, fila*40, widthPared, heightPared);                                                
					} else if(lab[fila][columna] == 2) {
						grafico.setColor(Color.green);
						grafico.fillRect(columna*40, fila*40, widthPared, heightPared);
					} else if (lab[fila][columna] == 0) {
                                                grafico.setColor(Color.white);
                                                grafico.fillRect(columna*40, fila*40, widthPared, heightPared);
						
					}
				}
			}
		}
		
		//Funcion que genera la matriz del laberinto 
		public int[][] getLab () {
			if(Juego.obtieneNivel()==1){
				int laberinto [][] = {
						{ 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 },
						{ 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1 },
						{ 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1 },
						{ 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1 },
						{ 1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 },
						{ 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1 },
						{ 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1 },
						{ 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1 },
						{ 1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 },
						{ 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1 },
						{ 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1 },
						{ 1,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1 },
						{ 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 },
				};
				lab = laberinto;
			} else if(Juego.obtieneNivel()==2){
				int laberinto [][] = {
						{ 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 },
						{ 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1 },
						{ 1,1,1,1,0,0,1,1,1,0,1,1,1,1,0,1,1,1,1,1,1,1,1 },
						{ 1,1,1,1,0,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1 },
						{ 1,1,1,0,0,0,0,0,1,1,1,1,1,1,1,1,0,1,1,1,1,1,1 },
						{ 1,1,1,0,1,1,1,0,1,1,1,0,0,1,1,1,0,0,0,0,0,1,1 },
						{ 1,1,1,0,1,0,0,0,1,1,1,0,1,0,1,1,1,1,1,1,0,1,1 },
						{ 1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,1,1,1,1,1,0,1,1 },
						{ 1,1,1,0,1,0,1,1,1,1,1,0,1,0,1,1,0,0,0,0,0,1,1 },
						{ 1,0,0,0,0,0,0,0,0,0,0,0,1,0,1,1,0,0,0,1,1,1,1 },
						{ 1,0,1,1,1,1,1,1,1,1,1,1,1,0,1,1,1,1,0,1,1,1,1 },
						{ 1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,0,0,1,1,1,1 },
						{ 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 },
						
				};
				lab = laberinto;
			} else if(Juego.obtieneNivel()==3) {
				int laberinto [][] = {
					 { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 },
					 { 1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1 },				 
					 { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1 },				 
					 { 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1 },				 
					 { 1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 },				 
					 { 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1 },				 
					 { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,0,1,1 },				 
					 { 1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1 },				 
					 { 1,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 },				 
					 { 1,1,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,1,1 },				 
					 { 1,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,0,1,1 },			 
					 { 1,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,1,0,0,0,2,1 },			 
					 { 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 },
				};
				lab = laberinto;
			}
		
			return lab;
		}
        }
