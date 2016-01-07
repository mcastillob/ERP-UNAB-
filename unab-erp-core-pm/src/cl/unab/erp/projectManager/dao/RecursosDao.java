/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.erp.projectManager.dao;

//import cl.unab.erp.projectManager.model.Empleado;
import unab.erp.core.rrhh.model.Empleado;

/**
 *
 * @author Miguel
 */
public interface RecursosDao {
  void save(Empleado empleado);
    void edit(Empleado empleado);
    void delete(int idEmpleado);  
}
