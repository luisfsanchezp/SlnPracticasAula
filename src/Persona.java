


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author USUARIO
 */
//Para enender la herencia de clases, usemos la vida real
//El mundo está lleno de personas
public class Persona {
    int id;
    String nombre;
    //con ayuda de una enumeración puedo definir listas finitas de valores 
    enum orientacionSexual { MASCULINO, FEMENINO, BISEXUAL, TRANSEXUAL, HOMOSEXUAL, TRANSGENERO }
    //luego de definida la enumeración se utiliza como un tipo de dato cualquiera
    orientacionSexual genero;
    String direccion;
    String numTelefono;
    String profesion;
    
    
    //este es mi constructor, para inicializar las instancias de mi clase(objetos Persona)
    Persona(String[] params){
        this.id = Integer.parseUnsignedInt(params[0]);
        this.nombre = params[1];
        this.genero = orientacionSexual.valueOf(params[2]);
        this.direccion = params[3];
        this.numTelefono = params[4];
        this.profesion = params[5];
        
    }
    
    public void quienEeres(){
        System.out.println("Yo soy "+this.nombre);
        System.out.println("\n y mi documento es ["+this.id+"]");
        System.out.println("\n Mi profesión es "+this.profesion
                +"\n Vivo en "+this.direccion+"\n mi telefono es: "
                +this.numTelefono+"\n y mi genero es "+this.genero);       
    }
}
