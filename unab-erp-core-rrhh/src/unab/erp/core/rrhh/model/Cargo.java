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
public class Cargo {
     public int    cargo_id;
     public String nombre;
     public String descripcion;

    public int getCargo_id() {
        return cargo_id;
    }

    public void setCargo_id(int cargo_id) {
        this.cargo_id = cargo_id;
    }

  

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

 
    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
 
     
     
     
}
