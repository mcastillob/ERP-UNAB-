/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.erp.projectManager.controller;

import cl.unab.erp.projectManager.dao.ClienteDao;
import cl.unab.erp.projectManager.model.Cliente;
import cl.unab.erp.projectManager.util.ClienteUtils;

/**
 *
 * @author mcamilettimellado
 */
public class ClienteController implements ClienteDao{

    @Override
    public void save(Cliente cliente) {
    ClienteUtils.clientes.add(cliente);
    }

    @Override
    public void edit(Cliente cliente) {
        for (int i = 0; i <  ClienteUtils.clientes.size(); i++) {
            if(ClienteUtils.clientes.get(i).getRut().equals(cliente.getRut())){
              ClienteUtils.clientes.set(i, cliente);
              return;
            }
        }
    }

    @Override
    public void delete(String idCliente) {
      for (int i = 0; i <  ClienteUtils.clientes.size(); i++) {
            if(ClienteUtils.clientes.get(i).getRut().equals(idCliente)){
              ClienteUtils.clientes.remove(i);
              return;
            }
        }    }
    
}
