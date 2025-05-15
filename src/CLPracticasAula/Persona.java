/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CLPracticasAula;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

/**
 *
 * @author USUARIO
 */
public class Persona {
    private String documento, nombre1, nombnre2, apellido1, apellido2, direccion, telefono, fNacido, fDefuncion;

    public Persona(String documento, String nombre1, String nombnre2, String apellido1, String apellido2, String direccion, String telefono, String fNacido) {
        this.documento = documento;
        this.nombre1 = nombre1;
        this.nombnre2 = nombnre2;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fNacido = fNacido;
    }

    public Persona(String documento, String nombre1, String apellido1) {
        this.documento = documento;
        this.nombre1 = nombre1;
        this.apellido1 = apellido1;
    }
    
    Persona(){}
    
    /**
     * @return the documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(String documento) {
        this.documento = documento;
    }

    /**
     * @return the nombre1
     */
    public String getNombre1() {
        return nombre1;
    }

    /**
     * @param nombre1 the nombre1 to set
     */
    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    /**
     * @return the nombnre2
     */
    public String getNombnre2() {
        return nombnre2;
    }

    /**
     * @param nombnre2 the nombnre2 to set
     */
    public void setNombnre2(String nombnre2) {
        this.nombnre2 = nombnre2;
    }

    /**
     * @return the apellido1
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * @param apellido1 the apellido1 to set
     */
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    /**
     * @return the apellido2
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * @param apellido2 the apellido2 to set
     */
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the fNacido
     */
    public String getfNacido() {
        return fNacido;
    }

    /**
     * @param fNacido the fNacido to set
     */
    public void setfNacido(String fNacido) {
        this.fNacido = fNacido;
    }

    /**
     * @return the fDefuncion
     */
    public String getfDefuncion() {
        return fDefuncion;
    }

    /**
     * @param fDefuncion the fDefuncion to set
     */
    private void setfDefuncion(String fDefuncion) {
        this.fDefuncion = fDefuncion;
    }
    
    public void Murio( String fmuerte){
        setfDefuncion(fmuerte);
        
    }
}
