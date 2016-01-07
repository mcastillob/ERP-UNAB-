/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.unab.erp.projectManager.controller;

import cl.unab.erp.projectManager.dao.ActividadDao;
import cl.unab.erp.projectManager.model.Actividad;
import cl.unab.erp.projectManager.util.ActividadUtils;

/**
 *
 * @author elDanyWeb
 */
public class ActividadController implements ActividadDao {
    @Override
    public void save(Actividad actividad) {
        int id=Integer.parseInt(ActividadUtils.actividades.get(ActividadUtils.actividades.size()-1).getId().substring(2))+1;
        actividad.setId("AC"+id);
        ActividadUtils.actividades.add(actividad);
    }

    @Override
    public void edit(Actividad actividad) {
        for (int i = 0; i < ActividadUtils.actividades.size(); i++) {
            if (ActividadUtils.actividades.get(i).getId().equals(actividad.getId())) {
                ActividadUtils.actividades.set(i, actividad);
                return;
            }
        }
    }

    @Override
    public void delete(String idActividad) {
        for (int i = 0; i < ActividadUtils.actividades.size(); i++) {
            if (ActividadUtils.actividades.get(i).getId().equals(idActividad)) {
                ActividadUtils.actividades.remove(i);
                return;
            }
        }
    }


}
