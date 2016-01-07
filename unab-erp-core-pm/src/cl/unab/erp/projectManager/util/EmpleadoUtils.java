/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.erp.projectManager.util;

import cl.unab.erp.projectManager.model.Empleado;
import java.util.ArrayList;

/**
 *
 * @author mcamilettimellado
 */
public class EmpleadoUtils {

    public static ArrayList<Empleado> empleados = new ArrayList<>();

    public static ArrayList<Empleado> init() {
        empleados.add(new Empleado("12.434.323-1", "Fabian Alex", "Altamirano Hollber", "Ortiz #364", "faltamirano@empresa.cl", "098324324", CargoUtils.cargos.get(0)));
        empleados.add(new Empleado("13.434.323-k", "Maria Alexandra", "Gomez Perez", "Quinta Vergara #374", "mgomez@empresa.cl", "09856324", CargoUtils.cargos.get(1)));
        empleados.add(new Empleado("14.123.768-9", "Mauricio Ignacio", "Sepulveda Gomez", "Santa Isabel #394", "msepulveda@empresa.cl", "0123324", CargoUtils.cargos.get(2)));
        empleados.add(new Empleado("15.434.758-1", "Franco Paul", "Gomez Hernandes", "Maipu #304", "fgomez@empresa.cl", "0983124324", CargoUtils.cargos.get(2)));
        empleados.add(new Empleado("16.567.768-2", "Fabian Alex", "Sanchez Gonzalez", "Las Condes #384", "fsanchez@empresa.cl", "0213324", CargoUtils.cargos.get(2)));
        empleados.add(new Empleado("17.890.212-3", "Andres Nicolas", "Vidal Medel", "Lo Prado #394", "avidal@empresa.cl", "0831321324", CargoUtils.cargos.get(3)));
        empleados.add(new Empleado("18.434.323-4", "Eduardo Felipe", "Del Pino Mercedes", "San Martin #3784", "edelpino@empresa.cl", "0983435324", CargoUtils.cargos.get(4)));
        empleados.add(new Empleado("19.434.323-5", "Alejandra Ignacia", "Quezada Navarro", "Alamaeda #374", "aquezada@empresa.cl", "0984324", CargoUtils.cargos.get(5)));
        empleados.add(new Empleado("20.809.788-6", "Joao Francisco", "Meza Mellado", "Brasil #37764", "jmeza@empresa.cl", "098132124", CargoUtils.cargos.get(4)));
        empleados.add(new Empleado("11.434.323-7", "David Patricio", "Tobar Gomez", "Bellavista #32344", "dtobar@empresa.cl", "098322124", CargoUtils.cargos.get(4)));
        empleados.add(new Empleado("9.434.788-7", "Juan Pablo", "Sandoval Perez", "Santigo #34654", "jsandoval@empresa.cl", "02124324", CargoUtils.cargos.get(5)));
        empleados.add(new Empleado("8.434.323-9", "Jorge Arturo", "Tapia Gonzales", "Pajaritos #32344", "jtapia@empresa.cl", "09812324", CargoUtils.cargos.get(6)));

        return empleados;
    }

    public static ArrayList<Empleado> getJefesProyecto() {
        ArrayList<Empleado> jp = new ArrayList<>();
        for (int i = 0; i < EmpleadoUtils.empleados.size(); i++) {
            if (EmpleadoUtils.empleados.get(i).getCargo().getId().equals(CargoUtils.cargos.get(2).getId())) {
                jp.add(EmpleadoUtils.empleados.get(i));
            }
        }
        return jp;
    }
      public static String getEmpleadoById(String rut) {
        ArrayList<Empleado> jp = new ArrayList<>();
        for (int i = 0; i < EmpleadoUtils.empleados.size(); i++) {
            if (EmpleadoUtils.empleados.get(i).getRut().equals(rut)) {
                return  EmpleadoUtils.empleados.get(i).getNombres().substring(0, 7) + "." + EmpleadoUtils.empleados.get(i).getApellidos().substring(0, 10) + ".";
            }
        }
        return "NO-ASIGNADO";
    }
}
