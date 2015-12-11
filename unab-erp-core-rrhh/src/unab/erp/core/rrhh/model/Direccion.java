/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unab.erp.core.rrhh.model;

/**
 *
 * @author MCastillo
 */
public class Direccion {
  public  int    Direccion_id;    
  public  String calle ;
  public  int     numero;
  public  Persona persona; 

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }


  
    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

  public Direccion(){
  
  }

    public void setDireccion_id(int Direccion_id) {
        this.Direccion_id = Direccion_id;
    }

    public int getDireccion_id() {
        return Direccion_id;
    }
  


    public String getCalle() {
        return calle;
    }

    public int getNumero() {
        return numero;
    }
    
}
