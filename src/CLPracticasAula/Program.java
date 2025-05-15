/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLPracticasAula;



/**
 *
 * @author LUIS FERNANDO SÁNCHEZ PÉREZ
 */
public class Program {
    //El metodo Main es quien indica que esta clase se puede ejecutar, 
    // y es el objeto inicial de nuestro proyecto
    public static void main(String []args) {
      System.out.println("Hola Clase!!"); 
      System.out.println("\n Aquí vamos a desarrollar varios conceptos acerca de soluciones desarrolladas con POO+MVC+Java\n\nBienvenidos!\n\n"); 
      
      //Llamo a la clase Empleado que hereda de Persona.
      Empleado Carguero = new Empleado("980021323","Federico", "Solorzano");
       Carguero.Murio("12-12-2019");
       
       //Llamo a la clase Ciudad y consumo sus métodos
        Ciudad Pompeya = new Ciudad("Pompeya","Santiago González",20000); 
        Pompeya.AcercaDe();
      
 
   }
}
