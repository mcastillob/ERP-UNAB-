/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.erp.projectManager.util;

import cl.unab.erp.projectManager.model.Cargo;
import java.util.ArrayList;

/**
 *
 * @author mcamilettimellado
 */
public class CargoUtils {

    public static ArrayList<Cargo> cargos = new ArrayList<>();

    public static ArrayList<Cargo> init() {
        cargos.add(new Cargo("CAR00", "Gerente"));
        cargos.add(new Cargo("CAR01", "SubGerente"));
        cargos.add(new Cargo("CAR02", "Jefe de Proyecto"));
        cargos.add(new Cargo("CAR03", "Ing de Software Jr"));
        cargos.add(new Cargo("CAR04", "Ing de Software SemiSenior"));
        cargos.add(new Cargo("CAR05", "Ing de Software Senior"));
        cargos.add(new Cargo("CAR06", "Jefe Reursos Humanos"));
        return cargos;
    }
}
