/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.erp.projectManager.util;

import cl.unab.erp.projectManager.model.Empleado;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author mcamilettimellado
 */
public class ComboManagerUtil {

    public static void doComboCargo(JComboBox jComboCargo) {
        String[] cargos = new String[CargoUtils.cargos.size()];
        for (int i = 0; i < CargoUtils.cargos.size(); i++) {
            cargos[i] = CargoUtils.cargos.get(i).getNombre();
        }
        jComboCargo.setModel(new javax.swing.DefaultComboBoxModel(cargos));
    }

    public static void doComboCliente(JComboBox jComboClienteProject) {
        String[] clientes = new String[ClienteUtils.clientes.size()];
        for (int i = 0; i < ClienteUtils.clientes.size(); i++) {
            clientes[i] = ClienteUtils.clientes.get(i).getRazonSocial();
        }
        jComboClienteProject.setModel(new javax.swing.DefaultComboBoxModel(clientes));
    }

    public static void doComboProject(JComboBox jComboProyecto) {
        String[] proyectos = new String[ProyectoUtils.proyectos.size()];
        for (int i = 0; i < ProyectoUtils.proyectos.size(); i++) {
            proyectos[i] = ProyectoUtils.proyectos.get(i).getNombre();
        }
        jComboProyecto.setModel(new javax.swing.DefaultComboBoxModel(proyectos));
    }

    public static void doComboJefeProject(JComboBox jComboJefeProyecto) {
        ArrayList<Empleado> jp = EmpleadoUtils.getJefesProyecto();
        String[] JPproyectos = new String[jp.size()];
        for (int i = 0; i < jp.size(); i++) {
            JPproyectos[i] = jp.get(i).getNombres().substring(0, 7) + "." + jp.get(i).getApellidos().substring(0, 10) + ".";
        }
        jComboJefeProyecto.setModel(new javax.swing.DefaultComboBoxModel(JPproyectos));
    }

    public static void doComboEmpleados(JComboBox jComboEmpleado) {
        String[] empleados = new String[EmpleadoUtils.empleados.size()];
        for (int i = 0; i < EmpleadoUtils.empleados.size(); i++) {
            empleados[i] = EmpleadoUtils.empleados.get(i).getNombres().substring(0, 7) + "." + EmpleadoUtils.empleados.get(i).getApellidos().substring(0, 10) + ".";
        }
        jComboEmpleado.setModel(new javax.swing.DefaultComboBoxModel(empleados));
    }

    public static void selectProyectChangeJPCombo(String id, JComboBox jComboJefeProyecto) {
        jComboJefeProyecto.setSelectedItem(ProyectoUtils.getJpById(id));
    }

    public static void selectProyectChangeClienteCombo(String id, JComboBox jComboClienteProyecto) {
        jComboClienteProyecto.setSelectedItem(ProyectoUtils.getClienteById(id));
    }


}
