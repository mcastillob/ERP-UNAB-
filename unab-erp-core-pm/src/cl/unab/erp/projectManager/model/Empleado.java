/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.erp.projectManager.model;

/**
 *
 * @author mcamilettimellado
 */
public class Empleado extends Persona{

   private Cargo cargo;
   
    public Empleado(String rut, String nombres, String apellidos, String direccion, String email, String fono,Cargo cargo) {
        super(rut, nombres, apellidos, direccion, email, fono);
        this.cargo=cargo;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }
    
}
