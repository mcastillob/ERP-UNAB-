/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unab.erp.core.rrhh.model;

/**
 *
 * @author miguelcastillo
 */
public class Persona {
    
    
    
    public int    Id;
    public String Nombre;
    public String Apellido_pat;
    public String Apellido_mat;
    public int    Rut;

  

    public Persona(){
    
    }
    
    public int getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido_pat() {
        return Apellido_pat;
    }

    public String getApellido_mat() {
        return Apellido_mat;
    }

    public int getRut() {
        return Rut;
    }

    public String getDv() {
        return Dv;
    }

    public void setId(int Id) {
        this.Id = Id;
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
