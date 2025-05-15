/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USUARIO
 */
//Vamos a incluir algunas referencias importantes
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

//La clase permitirà manipular archivos en nuestro PC y utilizarlos en nuestro aplicativo.
public class Archivos {
    //en este metodo vemos como copiar el contenido de un archivo en otro, con rutas fijas.
   public  void copiaArchivo() throws IOException {
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("C:\\Users\\USUARIO\\Documents\\input.txt");
         out = new FileOutputStream("C:\\Users\\USUARIO\\Documents\\output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }
       catch (FileNotFoundException ex) {
           Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(Archivos.class.getName()).log(Level.SEVERE, null, ex);
       }      finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
         //es muy importante finalizar el procesamiento de los archivos, 
         //de lo contrario podemos tener problemas después.
      }
   }
}