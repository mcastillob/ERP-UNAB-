/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.erp.projectManager.util;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mcamilettimellado
 */
public class TableManagerUtil {

    public static void doTableClientes(javax.swing.JTable jTableClientes) {
        String registros[] = new String[5];
        DefaultTableModel modelo = (DefaultTableModel) jTableClientes.getModel();
        removeRowsTable(modelo);
        for (int i = 0; i < ClienteUtils.clientes.size(); i++) {
            registros[0] = ClienteUtils.clientes.get(i).getRut();
            registros[1] = ClienteUtils.clientes.get(i).getRazonSocial();
            registros[2] = ClienteUtils.clientes.get(i).getDireccion();
            registros[3] = ClienteUtils.clientes.get(i).getEmail();
            registros[4] = ClienteUtils.clientes.get(i).getFono();
            modelo.addRow(registros);
        }
        jTableClientes.setModel(modelo);
    }

    public static void doTableProyectos(javax.swing.JTable jTableProject) {
        String registros[] = new String[7];
        DefaultTableModel modelo = (DefaultTableModel) jTableProject.getModel();
        removeRowsTable(modelo);
        for (int i = 0; i < ProyectoUtils.proyectos.size(); i++) {
            registros[0] = ProyectoUtils.proyectos.get(i).getId();
            registros[1] = ProyectoUtils.proyectos.get(i).getNombre();
            registros[2] = ProyectoUtils.proyectos.get(i).getInicio();
            registros[3] = ProyectoUtils.proyectos.get(i).getFin();
            registros[4] = ClienteUtils.getClienteByRut(ProyectoUtils.proyectos.get(i).getIdCliente());
            registros[5] = EmpleadoUtils.getEmpleadoById(ProyectoUtils.proyectos.get(i).getRutJpLocal());
            registros[6] = ProyectoUtils.proyectos.get(i).getJpCliente();
            modelo.addRow(registros);
        }
        jTableProject.setModel(modelo);
    }

    public static void doTableRecursos(javax.swing.JTable jTableRecursos) {
        String registros[] = new String[7];
        DefaultTableModel modelo = (DefaultTableModel) jTableRecursos.getModel();
        removeRowsTable(modelo);
        for (int i = 0; i < EmpleadoUtils.empleados.size(); i++) {
            registros[0] = EmpleadoUtils.empleados.get(i).getRut();
            registros[1] = EmpleadoUtils.empleados.get(i).getNombres();
            registros[2] = EmpleadoUtils.empleados.get(i).getApellidos();
            registros[3] = EmpleadoUtils.empleados.get(i).getDireccion();
            registros[4] = EmpleadoUtils.empleados.get(i).getEmail();
            registros[5] = EmpleadoUtils.empleados.get(i).getFono();
            registros[6] = EmpleadoUtils.empleados.get(i).getCargo().getNombre();
            modelo.addRow(registros);
        }
        jTableRecursos.setModel(modelo);
    }

    public static void removeRowsTable(DefaultTableModel model) {
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            model.removeRow(i);
        }
    }

    public static void doTableActividades(javax.swing.JTable jTableActividad, String idProject) {
        Object registros[] = new Object[7];
        DefaultTableModel modelo = (DefaultTableModel) jTableActividad.getModel();
        removeRowsTable(modelo);
        for (int i = 0; i < ActividadUtils.actividades.size(); i++) {
            if (ActividadUtils.actividades.get(i).getIdProyecto().equals(idProject)) {
                registros[0] = ActividadUtils.actividades.get(i).getId();
                registros[1] = ActividadUtils.actividades.get(i).getNombre();
                registros[2] = ActividadUtils.actividades.get(i).getInicio();
                registros[3] = ActividadUtils.actividades.get(i).getFin();
                registros[4] = EmpleadoUtils.getEmpleadoById(ActividadUtils.actividades.get(i).getRutRecurso());
                registros[5] = ActividadUtils.actividades.get(i).isEstado();
                modelo.addRow(registros);
            }
        }
        jTableActividad.setModel(modelo);
    }

    
}
