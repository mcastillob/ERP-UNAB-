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
public class Cliente extends Persona {

    private String razonSocial;
    private String giro;

    public Cliente(String rut, String razonSocial, String direccion, String email, String fono) {
        super(rut, "", "", direccion, email, fono);
        this.razonSocial = razonSocial;
        this.giro = "";
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getGiro() {
        return giro;
    }

    public void setGiro(String giro) {
        this.giro = giro;
    }

}
