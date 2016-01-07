/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.erp.projectManager.controller;

import cl.unab.erp.projectManager.dao.ProjectDao;
import cl.unab.erp.projectManager.model.Proyecto;
import cl.unab.erp.projectManager.util.ProyectoUtils;

/**
 *
 * @author Miguel
 */
public class ProjectController implements ProjectDao {
    @Override
    public void delete(String idProject) {
        for (int i = 0; i < ProyectoUtils.proyectos.size(); i++) {
            if (ProyectoUtils.proyectos.get(i).getId().equals(idProject)) {
                ProyectoUtils.proyectos.remove(i);
                return;
            }
        }
    }

    @Override
    public void save(Proyecto proyecto) {
        int id=Integer.parseInt(ProyectoUtils.proyectos.get(ProyectoUtils.proyectos.size()-1).getId().substring(2))+1;
        proyecto.setId("PR"+id);
        ProyectoUtils.proyectos.add(proyecto);
    }

    @Override
    public void edit(Proyecto proyecto) {
         for (int i = 0; i < ProyectoUtils.proyectos.size(); i++) {
            if (ProyectoUtils.proyectos.get(i).getId().equals(proyecto.getId())) {
                ProyectoUtils.proyectos.set(i, proyecto);
                return;
            }
        }
    }

}
