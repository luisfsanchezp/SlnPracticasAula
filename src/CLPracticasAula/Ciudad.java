/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLPracticasAula;

/**
 *
 * @author USUARIO
 */
public class Ciudad {
    //Region Atributos Miembro
       private double presupuesto, deudaPublica;
       private static String gobernador = "Igor Sanxo Dìez";
       private static final String zipCode = "057";
    //Fin Region Atributos Miembro
    
    //Region Propiedades
       int id, poblacion, area; //aquì especifico algunas variables, presen atención a que no utilizo modificadores.
       public String nombre, descripcion, historia, noticias;
       private static String alcalde="Fernando Sánchez";
    //Fin Region Propiedades
    
   //Region Constructores
       
       
        private Ciudad(){}
        
        public Ciudad(String n, String a, double p){
            this.nombre=n;
            this.presupuesto=p;
            EleccionPopular(a);
        }
    
    //Fin Region Constructores

    //Region Mètodos pùblicos
       public static void EleccionPopular(String ae){
        SetAlcalde(ae);
       }
    
    //FinRegion Mètodos pùblicos
       
    //Region Mètodos Privados
        private static void SetAlcalde(String ae) {
            Ciudad.setAlcalde("Susso el Passpi!");         
        }
    //Fin Region Mètodos Privados

        
    //Region Mètodos Funcionales
    void AcercaDe() {    
        
      System.out.println("Nuestro corresponsal desde  el lugar de los hechos...");
      System.out.println(this.nombre+" es una ciudad con un presupuesto superior a los "+this.presupuesto);      
      System.out.println("y cuenta con una extensión cercana a los "+this.area);
      System.out.println("\n La inconformidad de sus "+this.poblacion+" habitantes es por el anterior concejo, que estableció un presupuesto de "+this.presupuesto+ "Pero no tuvo en cuenta la actual Deuda Pública que ahora asciende a ");
      System.out.println(this.deudaPublica);
      System.out.println(" si reuqiere más información escriba al ZCode "+this.zipCode + "directametne al Alcalde \n");
      System.out.println(getAlcalde());
      System.out.println("O en su defecto al gobernador \n"+getGobernador());
    }
    //Region Mètodos Funcionales

    //Region Gets-Sets
    
    /**
     * @return the gobernador
     */
    public static String getGobernador() {
        return gobernador;
    }

    /**
     * @param aGobernador the gobernador to set
     */
    public static void setGobernador(String aGobernador) {
        gobernador = aGobernador;
    }

    /**
     * @return the alcalde
     */
    public static String getAlcalde() {
        return alcalde;
    }

    /**
     * @param aAlcalde the alcalde to set
     */
    public static void setAlcalde(String aAlcalde) {
        alcalde = aAlcalde;
    }


    //Fin Region Gets-Sets
    
}
