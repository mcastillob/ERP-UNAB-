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
    
    
    public void horasSolicitadas(Set<Solicitud> solicitudes ){
    
    this._solicitudes=solicitudes;
    }
    
    
    public void horasTrabajadas(Set<Jornada> horasTrabajadas){
    
    this._horasTrabajadas=horasTrabajadas;
    
    }
    
}
