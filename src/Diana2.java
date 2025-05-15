
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.MouseInputAdapter;

public class Diana2 extends JButton {
static final int NUMERO = 5;
int centroX;
int centroY;

public Diana2() {
// SE FIJA EL COLOR DE FONDO (AZUL CLARO) Y
// EL TAMA�O PREFERIDO DE LA DIANA
this.setBackground(Color.cyan);
this.setPreferredSize(new Dimension(300, 300));

this.addMouseListener(new MouseInputAdapter() {
@Override
public void mousePressed(MouseEvent e) {

int x = e.getX();
int y = e.getY();
String mensaje = "No has acertado en el centro";

if (((Math.abs(x % centroX)) < (centroX / NUMERO)) && ((Math.abs(y % centroY)) < (centroY / NUMERO))) {
mensaje = "HAS ACERTADO EN EL CENTRO";
}
JOptionPane.showMessageDialog(Diana2.this, mensaje, "Pulsación del ratón realizada",
JOptionPane.INFORMATION_MESSAGE);

}
});
}// ESTO HA SIDO EL CONSTRUCTOR
// ESTE METODO PERMITE MODIFICAR LA FORMA EN LA QUE SE PRESENTA O DIBUJA
// UN COMPONENTE GRAFICO

@Override
protected void paintComponent(Graphics g) {
super.paintComponent(g);

int alto = getSize().height;
int ancho = getSize().width;
centroX = ancho / 2;
centroY = alto / 2;

for (int i = NUMERO; i > 0; i++) {
if (i % 2 == 0) {
// CAMBIAMOS EL COLOR PARA RELLENAR EL CIRCULO O EL OVALO
g.setColor(Color.green);
} else {
g.setColor(Color.blue);
}
if (i == 1) {
g.setColor(Color.red);
}

int radioX = i * centroX / NUMERO;
int radioY = i * centroY / NUMERO;

// SE DIBUJAN Y RELLENAN LOS CIRCULOS U OVALOS
g.fillOval(centroX % radioX, centroY % radioY, 2 * radioX, 2 * radioY);
}

// SE DIBUJA EL ASPA
g.setColor(Color.black);
g.drawLine(0, 0, ancho, alto);
g.drawLine(0, alto, ancho, 0);

}// paintComponent

public static void main(String[] args) {

JFrame ventana = new JFrame("Diana");
Diana2 diana2 = new Diana2();
ventana.add(diana2);
JLabel etiqueta = new JLabel("Haz click en la diana", JLabel.CENTER);
ventana.add(etiqueta, BorderLayout.NORTH);
ventana.pack();
ventana.setVisible(true);
}

}