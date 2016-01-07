/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unab.erp.core.rrhh.model;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author miguelcastillo
 */
public class Jornada {
    public int  jornada_id;
    public int totalHH;
    public Set<DiaTrabajado> dias = new HashSet();

    public int getJornada_id() {
        return jornada_id;
    }

    public int getTotalHH() {
        return totalHH;
    }

    public void setJornada_id(int jornada_id) {
        this.jornada_id = jornada_id;
    }

    public void setTotalHH(int totalHH) {
        this.totalHH = totalHH;
    }
    
    
    
    
}
