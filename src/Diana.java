
import javafx.scene.shape.Ellipse;

public class Diana {

	public static void main(String[] args) throws InterruptedException {
		
		//GEOMETRIA	
		
		int centroX = 400;
		int centroY = 400;		
		int radio = 40;
		int separacion = 40;
		
		//INTERVALO TEMPORAL
		
		final long INTERVALO = 800;
		
		//BUCLE "FOR" MULTIPROPOSITO
		
		for ( int i = 10; i > 0; --i ) {
			
			//CREACION DE CIRCULOS
			
			Ellipse circulo = new Ellipse( centroX - radio - separacion * ( i - 1 ), 
								           centroY - radio - separacion * ( i - 1 ), 
								           2 * (radio + separacion * ( i - 1 ) ), 
					                       2 * (radio + separacion * ( i - 1 ) ) );
			
			//CREACION DE COLORES ALEATORIOS
			
			int rojo = (int)(Math.random() * 256);
			int verde = (int)(Math.random() * 256);
			int azul = (int)(Math.random() * 256);			
			
			//ESTABLECER COLOR DE CIRCULOS
                        circulo.setFill(javafx.scene.paint.Color.rgb(rojo, verde, azul));
			 
			//circulo.setColor(new javafx.scene.paint.Color(rojo,verde,azul));
			
			//DIBUJAR CIRCULOS CON COLOR DE RELLENO
			
			//circulo.fill();				
			
			Thread.sleep(INTERVALO);
			
			
		} // fin for		
                        
             
	}

}