/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.unab.erp.projectManager.util;

import cl.unab.erp.projectManager.model.Actividad;
import java.util.ArrayList;

/**
 *
 * @author elDanyWeb
 */
public class ActividadUtils {
    
    public static ArrayList<Actividad> actividades = new ArrayList<>();
    
     public static ArrayList<Actividad> init() {
        actividades.add(new Actividad("AC1","Toma de Requerimientos","05/01/2016","05/02/2016",ProyectoUtils.proyectos.get(2).getId(),EmpleadoUtils.empleados.get(3).getRut(),false));
        actividades.add(new Actividad("AC2","Analisis de Requerimientos","10/02/2016","05/02/2016",ProyectoUtils.proyectos.get(1).getId(),EmpleadoUtils.empleados.get(1).getRut(),true));
        actividades.add(new Actividad("AC3","Pruebas de Integración","20/01/2016","25/01/2016",ProyectoUtils.proyectos.get(2).getId(),EmpleadoUtils.empleados.get(2).getRut(),false));
        actividades.add(new Actividad("AC4","Desarrollo Modulo 1","05/01/2016","10/02/2016",ProyectoUtils.proyectos.get(3).getId(),EmpleadoUtils.empleados.get(3).getRut(),true));
        actividades.add(new Actividad("AC5","Presentación Demo 1.0","05/01/2016","05/02/2016",ProyectoUtils.proyectos.get(1).getId(),EmpleadoUtils.empleados.get(1).getRut(),false));
        actividades.add(new Actividad("AC6","Toma de Requerimientos","05/01/2016","05/02/2016",ProyectoUtils.proyectos.get(3).getId(),EmpleadoUtils.empleados.get(2).getRut(),false));
        return actividades;
    }
     
//     public static String getProyectById(String id) {
//        for (Actividad actividad : actividades) {
//            if (actividad.getId().equals(id)) {
//                return actividad.getProyecto().getNombre();
//            }
//        }
//        return null;
//    }
//     
//     public static String getRecursoById(String id) {
//        for (Actividad actividad : actividades) {
//            if (actividad.getId().equals(id)) {
//                return actividad.getRecurso().getNombres().substring(0, 7) + "." + actividad.getRecurso().getApellidos().substring(0, 10) + ".";
//            }
//        }
//        return null;
//    }
//     
    
    
}
