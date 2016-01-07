/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.unab.erp.projectManager.dao;

import cl.unab.erp.projectManager.model.Actividad;

/**
 *
 * @author elDanyWeb
 */
public interface ActividadDao {
    void save(Actividad actividad);
    void edit(Actividad actividad);
    void delete(String idActividad);
    
}
