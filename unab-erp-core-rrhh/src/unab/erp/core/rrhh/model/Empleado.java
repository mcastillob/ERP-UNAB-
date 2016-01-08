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
public class Empleado extends Persona{
    
       
        public Date  fechaIngreso;
        public int   hhContratadas;
        public float sueldo;
        public Cargo cargo;

        
  
        public Set<Solicitud>     solicitudes = new HashSet();
        public Set<Liquidacion> liquidaciones = new HashSet();
        public Set<Jornada>  horasSolicitadas = new HashSet();

    public void setSolicitudes(Set<Solicitud> solicitudes) {
        this.solicitudes = solicitudes;
    }

    public Set<Solicitud> getSolicitudes() {
        return solicitudes;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public float getSueldo() {
        return sueldo;
    }
        
        
    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

        
    public Cargo getCargo() {
        return cargo;
    }
    public void setHhContratadas(int hhContratadas) {
        this.hhContratadas = hhContratadas;
    }

    public void setHorasSolicitadas(Set<Jornada> horasSolicitadas) {
        this.horasSolicitadas = horasSolicitadas;
    }

    public int getHhContratadas() {
        return hhContratadas;
    }

    public Set<Jornada> getHorasSolicitadas() {
        return horasSolicitadas;
    }
        
        
        
        
        
}
