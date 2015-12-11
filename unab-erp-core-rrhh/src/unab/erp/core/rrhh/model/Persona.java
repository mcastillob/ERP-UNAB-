/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unab.erp.core.rrhh.model;


import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author miguelcastillo
 */
public class Persona {
    
    public int    Persona_id;
    public String Nombre;
    public String Apellido_pat;
    public String Apellido_mat;
    public int    Rut;
    public Set<Direccion> direcciones = new HashSet();
    
    public void setDirecciones(Set<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public Set<Direccion> getDirecciones() {
        return this.direcciones;
    }
    
    public Persona(){
    
    }
    


    public String getNombre() {
        return this.Nombre;
    }

    public String getApellido_pat() {
        return this.Apellido_pat;
    }

    public String getApellido_mat() {
        return this.Apellido_mat;
    }

    public int getRut() {
        return this.Rut;
    }

    public String getDv() {
        return this.Dv;
    }

    public int getPersona_id() {
        return this.Persona_id;
    }

    public void setPersona_id(int Persona_id) {
        this.Persona_id = Persona_id;
    }


    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido_pat(String Apellido_pat) {
        this.Apellido_pat = Apellido_pat;
    }

    public void setApellido_mat(String Apellido_mat) {
        this.Apellido_mat = Apellido_mat;
    }

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
    }
    public String Dv;
 
    
}
