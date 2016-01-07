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
public class Descuento {
    public int    descuento_id;
    public String nombre;
    public float valor;

    public void setDescuento_id(int descuento_id) {
        this.descuento_id = descuento_id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    
    
    public int getDescuento_id() {
        return descuento_id;
    }

    public String getNombre() {
        return nombre;
    }

    public float getValor() {
        return valor;
    }
    
    
    
}
