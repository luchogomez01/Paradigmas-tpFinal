package domain;

import java.awt.Color;
import java.awt.Graphics;

	public class Laberinto {
		//Inicializo variables del lab
		private int fila = 0; 
		private int columna = 0; 
		
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
					if(lab[fila][columna] == 1) {
						grafico.setColor(Color.red);
						grafico.fillRect(columna*40, fila*40, widthPared, heightPared);
					} else if(lab[fila][columna] == 2) {
						grafico.setColor(Color.green);
						grafico.fillRect(columna*40, fila*40, widthPared, heightPared);
					} else if (lab[fila][columna] == 0) {
						grafico.setColor(Color.black);
						grafico.fillRect(columna*40, fila*40, widthPared, heightPared);
					}
				};
			};
		}
		
		//Funcion que genera la matriz del laberinto 
		public int[][] getLab () {
			int lab [][] = {
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
			
			return lab;
		}
}
