
import java.awt.Color;
import javax.swing.JFrame;

public class JFTablero
{
// ejecuta la aplicaci�n
public static void Pintarme( String args[] )
{
// crea marco para el panel
JFrame marco =
new JFrame( "Dibujo de lineas, rectangulos y ovalos" );
marco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

JPTablero JP_Tablero =
new JPTablero();
JP_Tablero.setBackground( Color.WHITE );
marco.add( JP_Tablero ); // agrega el panel al marco
marco.setSize( 400, 210 ); // establece el tama�o del marco
marco.setVisible( true ); // muestra el marco
} // fin de main
} // fin de la clase JFTablero