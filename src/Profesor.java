/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USUARIO
 */
public class Profesor extends Persona {

    public Profesor(String[] params) {
        super(params);
    }
    
    public boolean dictaClase(String day){
        if("Martes".equals(day)){
            System.out.println("Programación en Java | 18:00 a 20:00");
            return true;
        }else{
            System.out.println("Juega con Santiago | 06:00 a 20:00");
            return false;
        }
    }
}
