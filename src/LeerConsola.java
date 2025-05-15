/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USUARIO
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerConsola {
    //este metodo realiza una lectura de los datos ingresados por el usuario.
   public void escribe() throws IOException {
      try (InputStreamReader cin = new InputStreamReader(System.in)) {
         System.out.println("Entre algun texto para verificar la funcionalidad, '!' para salir.");
         char c;
         do {
            c = (char) cin.read();
            System.out.print(c);
         } while(c != '!');
      }catch (IOException ex) {
           Logger.getLogger(LeerConsola.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
}
