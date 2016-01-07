/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.erp.projectManager.util;

import cl.unab.erp.projectManager.model.Cliente;
import java.util.ArrayList;

/**
 *
 * @author mcamilettimellado
 */
public class ClienteUtils {

    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void init() {
        Cliente cliente1 = new Cliente("12.234.234-6", "Distribuidora x", "Morande #232", "polinos@polinos.com", "09-88827872");
        Cliente cliente2 = new Cliente("13.434.234-8", "Facturas x", "Huerfanos #232", "facturadores@fact.com", "09-88007772");
        Cliente cliente3 = new Cliente("14.122.234-k","Bancaria x", "Moneda #132", "bci@bci.com", "09-81234872");
        clientes.add(cliente1);
        clientes.add(cliente2);
        clientes.add(cliente3);
    }

    public static String getClienteByRut(String rut) {
        for (Cliente cliente : clientes) {
            if (cliente.getRut().equals(rut)) {
                return cliente.getRazonSocial();
            }
        }
        return "NO-ASIGNADO";
    }

    public static Boolean addCliente(Cliente newCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getRut().equals(newCliente.getRut())) {
                return false;
            }
        }
        clientes.add(newCliente);
        return true;
    }
}
