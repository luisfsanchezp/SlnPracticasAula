


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javafx.scene.shape.Rectangle;

public class TableroAjedrez {

    public TableroAjedrez() {
        
    }

    public static void Pintarme(String[] args) {

		final int LADO = 100;
		
		Rectangle tablero = new Rectangle ( LADO, LADO, 8 * LADO, 8 * LADO );
                tablero.setVisible(true);
		//tablero.draw();
		
		for ( int i = 1; i <= 8; ++i ) {
			
			for ( int j = 1; j <= 8; ++j ) {
				
				if ( (i % 2 == 0 && j % 2 == 0) || (i % 2 != 0 && j % 2 != 0) ) {
					
					Rectangle casilla = new Rectangle ( i * LADO, j * LADO, LADO, LADO );
					casilla.setFill(javafx.scene.paint.Color.BLACK);
                                        //casilla.setColor(Color.BLACK);
					//casilla.fill();
				}
			}
			
			
			
		}

	}

}