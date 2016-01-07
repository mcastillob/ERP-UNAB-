/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unab.erp.core.rrhh.model;

import java.util.Date;

/**
 *
 * @author miguelcastillo
 */
public class DiaTrabajado {
    public int  diatrabajado_id;
    public Date dia;
    public String hora_inicio;
    public String hora_termino;

    public void setDiatrabajado_id(int diatrabajado_id) {
        this.diatrabajado_id = diatrabajado_id;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }

    public void setHora_inicio(String hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public void setHora_termino(String hora_termino) {
        this.hora_termino = hora_termino;
    }

    public int getDiatrabajado_id() {
        return diatrabajado_id;
    }

    public Date getDia() {
        return dia;
    }

    public String getHora_inicio() {
        return hora_inicio;
    }

    public String getHora_termino() {
        return hora_termino;
    }
    
}
