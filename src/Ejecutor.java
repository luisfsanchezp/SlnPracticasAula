/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USUARIO
 */
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//nuestra clase principal nos permite acceder a todo nuestro sistema
public class Ejecutor {
    //El metodo Main es quien indica que esta clase se puede ejecutar, 
    // y es el objeto inicial de nuestro proyecto
    public static void main(String []args) {
      System.out.println("Hola Clase!! "); 
      //aquí podemos ver un ejemplo de imprimir datos en la pantalla
      usarLista();
      fechas();
      //Los datos deben ser verificados en su ingreso al sistema
      expresionRegular();
      //algunos objetos se relacionan entre sí, llamar otro objeto es facil
      llamarClase();
      
      //los objetos pueden ser instanciados directamente dependiendo de su nivel de acceso
      Refresco r = new Refresco();
      r.tomaRefresco();
      
      //Còmo funciona entonces la herencia?
      
      String[] datos={"98989898","LUIS FERNANDO SANCHEZ","MASCULINO", "Calle con carrera y piso","12345678", "MSc Educación Ciencias Exactas"};
      Profesor P = new Profesor(datos);
      P.dictaClase("Lunes");
      
      //ya nque sabes usar las clases y sus miembros, usemos datos...
      usaArchivos_CapturaDatos();
   }
    
    
   //Qué pasa si requiero validar lo que el usuario escribe?
   //uso expresiones regulares....
    public static void expresionRegular(){
    // En este ejemplo escribimos una cadena que deseamos revisar si cumple con el patrón establecido
      String line = "Este pedido fue hecho por QT3000! Correcto?";
      String pattern = "(.*)(\\d+)(.*)";

      // Creo mi objeto 'plantilla'
      Pattern r = Pattern.compile(pattern);

      // Creo mi objeto comparable.
      Matcher m = r.matcher(line);
      if (m.find( )) {
         System.out.println("Valor hallado: " + m.group(0) );
         System.out.println("Valor hallado: " + m.group(1) );
         System.out.println("Valor hallado: " + m.group(2) );
      }else {
         System.out.println("No hay coincidencias.");
      }
   }
   
    //metodo estàtico..¿esto qué significa?
    public static void fechas(){          
      Date dNow = new Date( );
      //¿cómo puedo definir el formato a mi gusto?
      System.out.println("Current Date: " + dNow);
      }
    
    //una clase del entorno de nombres puede accederse si es pública
    public static void llamarClase(){
      String[] p={"Bonifacio","12","Perro","Pastor Pèrdiguero"};
      //iniciemos con una clase simple:
      Mascota M = new Mascota(p);
      M.durmiendo();
      M.hambriento();
      M.identificate();
      M.jugando();
    }
    
    public static void usarLista(){
//veamos como usar ademàs una lista o vector
      double[] miLista = {1.9, 2.9, 3.4, 3.5};

      // muestro todos los elementos del arreglo
      for (int i = 0; i < miLista.length; i++) {
         System.out.println(miLista[i] + " ");
      }
     
      // sumo los valores dentro del arreglo
      double total = 0;
      for (int i = 0; i < miLista.length; i++) {
         total += miLista[i];
      }
      System.out.println("Total:  " + total);
      
      // Busco el elemento de mayor valor
      double max = miLista[0];
      for (int i = 1; i < miLista.length; i++) {
         if (miLista[i] > max) max = miLista[i];
      }
      System.out.println("Maximo: " + max);  
      }
    
    public static void usaArchivos_CapturaDatos(){
        Archivos a = new Archivos();          
      LeerConsola lc = new LeerConsola();
      try{
          a.copiaArchivo();
          lc.escribe();
      }
       catch (IOException ex) {
           Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
       }
        }

}
