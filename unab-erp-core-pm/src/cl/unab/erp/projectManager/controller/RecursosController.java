/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.erp.projectManager.controller;

import cl.unab.erp.projectManager.dao.RecursosDao;
import cl.unab.erp.projectManager.model.Empleado;
import cl.unab.erp.projectManager.util.EmpleadoUtils;

/**
 *
 * @author Miguel
 */
public class RecursosController implements RecursosDao{

    @Override
    public void save(Empleado empleado) {
        EmpleadoUtils.empleados.add(empleado);
    }

    @Override
    public void edit(Empleado empleado) {
        for (int i = 0; i < EmpleadoUtils.empleados.size(); i++) {
            if (EmpleadoUtils.empleados.get(i).getRut().equals(empleado.getRut())) {
                EmpleadoUtils.empleados.set(i, empleado);
                return;
            }
        }
    }

    @Override
    public void delete(String idEmpleado) {
       for (int i = 0; i < EmpleadoUtils.empleados.size(); i++) {
           if (EmpleadoUtils.empleados.get(i).getRut().equals(idEmpleado)) {
                EmpleadoUtils.empleados.remove(i);
                return;
            }
        }
    }
    
}
