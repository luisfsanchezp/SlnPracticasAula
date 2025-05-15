/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USUARIO
 */
//Una estructura muy simple, con algunas propiedades
public class Mascota {
   String nombre;
   int edad;
   String raza;
   String tipo;

   Mascota (String[] args){
       this.nombre=args[0];
       this.edad=Integer.parseInt(args[1]);
       this.tipo=args[2];
       this.raza=args[3];
   }
   public void identificate(){
       System.out.println("Me llamo "+this.nombre);
        System.out.println("\n soy un "+this.tipo+" de raza "+this.raza);
        System.out.println("\n mi edad es "+this.edad);
        
   }
   public void hambriento() {
       System.out.println("Dame Comida!!!");
   }

   public void durmiendo() {
       System.out.println("ZZZZzzZZZZzzzZZZ");
   }

   public void jugando() {
       System.out.println("Corre, corre, corre!!");
   }

}
