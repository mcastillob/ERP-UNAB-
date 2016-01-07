/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguelcastillo
 */

import java.util.Date;
import unab.erp.configuracion.HibernateUtil;
import java.util.List;
import org.hibernate.*;
import unab.erp.core.rrhh.model.*;
import unab.erp.core.rrhh.dao.*;

public class inicio {

    public inicio() {
    }
 
    public static void main(String[] args){
   //inicio la fabrica de sesiones que se conectan a una base de datos embebida 
    
    try{
        //se inicia una transaccion para asegurara la grabación 
      
       
        EmpleadoDao empleadoDao=new EmpleadoDao();
        
    
        
        Empleado obj_empleado=new Empleado();
        obj_empleado.rut="16122203-9";
        obj_empleado.nombre="Miguel berrios";
        obj_empleado.apellidoPat="Castillo";
        obj_empleado.apellidoMat="Berrios";
        obj_empleado.correo="mcastillo.berrios@gmail.com";
        obj_empleado.setFechaIngreso(new Date());
        obj_empleado.setFechaNacimiento(new Date(2015,03,22));
        obj_empleado.hhContratadas=48;
        
       empleadoDao.openCurrentSessionwithTransaction();
       empleadoDao.save(obj_empleado);
       empleadoDao.closeCurrentSessionwithTransaction();
        
        
        
        
   
    
    }catch(Exception error){
    
       
    }finally{
    // se  libera la sesion utilizada 
   
    }
 
   
    
    }
    
    
}
