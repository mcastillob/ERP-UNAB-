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
public class Liquidacion {
    
    public int               liquidacion_id;
    public String            periodo;
    public Date              fechaIngreso;
    public float             sueldoBruto;
    public float             totalDescuneto;
    public float             sueldoLiquido;
    public Set<Descuento>    descuentos = new HashSet();
    private Set<Solicitud>   _solicitudes;
    private Set<Jornada>     _horasTrabajadas;

    public void setLiquidacion_id(int liquidacion_id) {
        this.liquidacion_id = liquidacion_id;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public void setSueldoBruto(float sueldoBruto) {
        this.sueldoBruto = sueldoBruto;
    }

    public void setTotalDescuneto(float totalDescuneto) {
        this.totalDescuneto = totalDescuneto;
    }

    public void setSueldoLiquido(float sueldoLiquido) {
        this.sueldoLiquido = sueldoLiquido;
    }

    public void setDescuentos(Set<Descuento> descuentos) {
        this.descuentos = descuentos;
    }

    
    
    
    
    public int getLiquidacion_id() {
        return liquidacion_id;
    }

    public String getPeriodo() {
        return periodo;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public float getSueldoBruto() {
        return sueldoBruto;
    }

    public float getTotalDescuneto() {
        return totalDescuneto;
    }

    public float getSueldoLiquido() {
        return sueldoLiquido;
    }

    public Set<Descuento> getDescuentos() {
        return descuentos;
    }
    
    
    
    
    
    
    
    
    
    
    public void horasSolicitadas(Set<Solicitud> solicitudes ){
    
    this._solicitudes=solicitudes;
    }
    
    
    public void horasTrabajadas(Set<Jornada> horasTrabajadas){
    
    this._horasTrabajadas=horasTrabajadas;
    
    }
    
}
