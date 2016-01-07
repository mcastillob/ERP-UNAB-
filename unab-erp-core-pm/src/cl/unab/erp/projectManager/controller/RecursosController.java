/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.erp.projectManager.controller;

import cl.unab.erp.projectManager.dao.RecursosDao;
//import cl.unab.erp.projectManager.model.Empleado;
//import cl.unab.erp.projectManager.util.EmpleadoUtils;
import unab.erp.core.rrhh.model.Empleado;
import unab.erp.core.rrhh.dao.EmpleadoDao;
import org.hibernate.*;
/**
 *
 * @author Miguel
 */
public class RecursosController implements RecursosDao{

    
 
    public void save(Empleado empleado)  {
        EmpleadoDao empleadoDao=new EmpleadoDao();
        empleadoDao.openCurrentSessionwithTransaction();
        empleadoDao.save(empleado);
        empleadoDao.closeCurrentSessionwithTransaction();
    }

    @Override
    public void edit(Empleado empleado) {
        
        EmpleadoDao empleadoDao=new EmpleadoDao();
        empleadoDao.openCurrentSessionwithTransaction();
        empleadoDao.update(empleado);
        empleadoDao.closeCurrentSessionwithTransaction();
        
    }

    @Override
    public void delete(int idEmpleado) {
   
        EmpleadoDao empleadoDao=new EmpleadoDao();
        empleadoDao.openCurrentSessionwithTransaction();
        empleadoDao.delete(empleadoDao.findById(idEmpleado));
        empleadoDao.closeCurrentSessionwithTransaction();
    }
    
}
