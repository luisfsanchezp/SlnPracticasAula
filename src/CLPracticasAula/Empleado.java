/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLPracticasAula;

import java.util.Date;

/**
 *
 * @author USUARIO
 */
public class Empleado extends Persona{

    Empleado(String d, String n, String a) {
        this.setDocumento(d);
        setNombre1(n);
        setApellido1(a);
        //TODO
        LiquidarPorFuerzaMayor(0);
    }
    
    private void LiquidarPorFuerzaMayor(int razonTerminacion){
        if(razonTerminacion == 0){
            this.Murio("12/12/12");
            System.out.println("El empleado "+this.getNombre1()+" "+this.getApellido1()+"\n Identificado con NUIP: "+this.getDocumento());
            System.out.println("\nFalleciò el dìa "+this.getfDefuncion());
            System.out.println("\nSentimos que haya muerto.\n");
        }
    }
   
}
