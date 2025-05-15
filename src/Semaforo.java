

import javax.swing.JOptionPane;
import java.awt.*;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;


public class Semaforo {

	public static void Pintarme(String[] args) throws InterruptedException {
		
		//DECLARACION DE CONSTANTES
		
		final long RETARDO_COLORES = 3000; 
		final long PARPADEO = 600;
		
		//DECLARACION DE VARIABLES PARA COORDENADAS RELATIVAS
		
		double diametroDisco;
		double ancho;
		double alto;
		double centroX;
		double centroY;
		
		//INTRODUCCION DEL VALOR DEL DIAMETRO DE LOS DISCOS
			
		String introducirDiametro = "Introduzca el di�metro de los discos luminosos (entre 80 y 150): ";
		diametroDisco = ( Double.parseDouble( JOptionPane.showInputDialog( introducirDiametro ) ) );
		
		
		//GEOMETRIA DE LA CAJA DEL SEMAFORO
		
		ancho = diametroDisco * 4 / 3;
		alto = diametroDisco * 11 / 3;
		centroX = 2 * diametroDisco;
		centroY = 2 * diametroDisco;
		
		
		
		//OBJETO cajaSemaforo: coordenadas, medidas, color, rellenar.
		
		Rectangle cajaSemaforo = new Rectangle( centroX-ancho/2, centroY-alto/2, ancho, alto ); 
               
                cajaSemaforo.setFill( javafx.scene.paint.Color.GRAY);
		//cajaSemaforo.setColor(Color.GRAY);
		//cajaSemaforo.fill();
				
		
		//OBJETO poste: coordenadas, medidas, color, rellenar.
		
		Rectangle poste = new Rectangle( centroX-ancho/10, centroY + alto/2, ancho/5, alto ); 
                poste.setFill( javafx.scene.paint.Color.GRAY);
		//poste.setColor(Color.GRAY);
		//poste.fill();
		
		
		do {		
		
			//OBJETO circuloVerde: coordenadas, medidas, color, rellenar.
			
			Ellipse circuloVerde = new Ellipse( centroX - diametroDisco/2, centroY + diametroDisco * 2 / 3, diametroDisco, diametroDisco ); 
			circuloVerde.setFill(javafx.scene.paint.Color.GREEN);
                        //circuloVerde.setColor(Color.GREEN);
			//circuloVerde.fill();
			
			
			//OBJETO circuloAmarillo: coordenadas, medidas, color, rellenar. Efecto "parpadeo"
			//Esto se puede mejorar con un blucle de repetici�n
			
			Ellipse circuloAmarillo = new Ellipse( centroX - diametroDisco/2, centroY - diametroDisco/2, diametroDisco, diametroDisco ); 
			 circuloAmarillo.setFill(javafx.scene.paint.Color.YELLOW);
                        //circuloAmarillo.setColor(Color.YELLOW);
			
			Thread.sleep(RETARDO_COLORES); //Retardo para "desaparici�n Verde" - "aparici�n Amarillo"
			
			circuloVerde.setFill(javafx.scene.paint.Color.GREEN);
				
			 circuloAmarillo.setFill(javafx.scene.paint.Color.YELLOW);
			
			Thread.sleep(PARPADEO); //Retardo para conseguir efecto "parpadeo"
			 circuloAmarillo.setFill(javafx.scene.paint.Color.GRAY);
			
			Thread.sleep(PARPADEO);
			
			 circuloAmarillo.setFill(javafx.scene.paint.Color.YELLOW);
			
			Thread.sleep(PARPADEO);
			
			circuloAmarillo.setFill(javafx.scene.paint.Color.GRAY);
			
			Thread.sleep(PARPADEO);
			
			 circuloAmarillo.setFill(javafx.scene.paint.Color.YELLOW);
			
			Thread.sleep(PARPADEO);
			
			circuloAmarillo.setFill(javafx.scene.paint.Color.GRAY);
			
			Thread.sleep(PARPADEO);
			
			 circuloAmarillo.setFill(javafx.scene.paint.Color.YELLOW);
			
			
			//OBJETO circuloRojo: coordenadas, medidas, color, rellenar. Efecto "parpadeo"
			
			Ellipse circuloRojo = new Ellipse( centroX - diametroDisco/2, centroY - diametroDisco * 5 / 3, diametroDisco, diametroDisco ); 
						
			circuloRojo.setFill(javafx.scene.paint.Color.RED);
			
			Thread.sleep(PARPADEO);
			
			circuloAmarillo.setFill(javafx.scene.paint.Color.GRAY);
						
			circuloRojo.setFill(javafx.scene.paint.Color.RED);
			
			Thread.sleep(RETARDO_COLORES);
			
			circuloRojo.setFill(javafx.scene.paint.Color.RED);
		
		} while ( true );			

	}

}