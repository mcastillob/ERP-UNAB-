/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unab.erp.core.rrhh.model;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author miguelcastillo
 */
public class Persona {
    
    public int    persona_id;
    public String nombre;
    public String apellidoPat;
    public String apellidoMat;
    public String rut;
    public Date   fechaNacimiento;
    public Date   fechaIngreso;
    public String correo;
    
    /*public Set<Direccion> direcciones = new HashSet();
    
    public void setDirecciones(Set<Direccion> direcciones) {
        this.direcciones = direcciones;
    }

    public Set<Direccion> getDirecciones() {
        return this.direcciones;
    }*/
    
    public Persona(){
    
    }

    public void setPersona_id(int persona_id) {
        this.persona_id = persona_id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidoPat(String apellidoPat) {
        this.apellidoPat = apellidoPat;
    }

    public void setApellidoMat(String apellidoMat) {
        this.apellidoMat = apellidoMat;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getPersona_id() {
        return persona_id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPat() {
        return apellidoPat;
    }

    public String getApellidoMat() {
        return apellidoMat;
    }

    public String getRut() {
        return rut;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public String getCorreo() {
        return correo;
    }
    


  

 
    
}
