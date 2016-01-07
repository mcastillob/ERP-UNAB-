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
public class Solicitud extends DiaTrabajado{
    
    public int    solicitud_id;
    public String tipoSolicitud;
    public String tipoEstado;

    public void setSolicitud_id(int solicitud_id) {
        this.solicitud_id = solicitud_id;
    }

    public void setTipoSolicitud(String tipoSolicitud) {
        this.tipoSolicitud = tipoSolicitud;
    }

    public void setTipoEstado(String tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    public int getSolicitud_id() {
        return solicitud_id;
    }

    public String getTipoSolicitud() {
        return tipoSolicitud;
    }

    public String getTipoEstado() {
        return tipoEstado;
    }
    
    
}
