/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.erp.projectManager.util;

import cl.unab.erp.projectManager.model.Proyecto;
import java.util.ArrayList;

/**
 *
 * @author mcamilettimellado
 */
public class ProyectoUtils {

    public static ArrayList<Proyecto> proyectos = new ArrayList<>();

    public static ArrayList<Proyecto> init() {
        proyectos.add(new Proyecto("PR1", "Generacion de boletas", "01/12/2015", "01/05/2016", EmpleadoUtils.empleados.get(2).getRut(), "Emanuel Bravo", ClienteUtils.clientes.get(0).getRut()));
        proyectos.add(new Proyecto("PR2", "Generacion de Facturas", "11/12/2015", "01/07/2016", EmpleadoUtils.empleados.get(3).getRut(), "Manuel Perez", ClienteUtils.clientes.get(1).getRut()));
        proyectos.add(new Proyecto("PR3", "Notificacion SMS", "22/12/2015", "01/11/2016", EmpleadoUtils.empleados.get(4).getRut(), "Cristian Cepeda", ClienteUtils.clientes.get(2).getRut()));
        proyectos.add(new Proyecto("PR4", "Web BCI", "11/12/2015", "01/03/2016", EmpleadoUtils.empleados.get(3).getRut(), "Israel Sepulveda", ClienteUtils.clientes.get(0).getRut()));
        proyectos.add(new Proyecto("PR5", "Facturacion Electronica", "01/12/2015", "01/02/2016", EmpleadoUtils.empleados.get(4).getRut(), "Sandra Agudo", ClienteUtils.clientes.get(1).getRut()));
        proyectos.add(new Proyecto("PR6", "Caja los Andes Web", "01/12/2015", "01/05/2017", EmpleadoUtils.empleados.get(2).getRut(), "Cristian Aguilar", ClienteUtils.clientes.get(2).getRut()));
        return proyectos;
    }

    public static String getJpById(String id) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getId().equals(id)) {
                return EmpleadoUtils.getEmpleadoById(proyecto.getRutJpLocal());
            }
        }
        return "NO-ASIGNADO";
    }
       

    public static String getClienteById(String id) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getId().equals(id)) {
                return ClienteUtils.getClienteByRut(proyecto.getIdCliente());
            }
        }
        return "NO-ASIGNADO";
    }

    public static String getDescriptProjectById(String id) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getId().equals(id)) {
                return proyecto.getDescripcion();
            }
        }
        return "";
    }
      public static String getProjectById(String id) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getId().equals(id)) {
                return proyecto.getNombre();
            }
        }
        return "NO-ASIGNADO";
    }
       public static Proyecto getProject(String id) {
        for (Proyecto proyecto : proyectos) {
            if (proyecto.getId().equals(id)) {
                return proyecto;
            }
        }
        return null;
    }
}
