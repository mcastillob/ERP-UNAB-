/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.erp.projectManager.dao;

import cl.unab.erp.projectManager.model.Cliente;

/**
 *
 * @author mcamilettimellado
 */
public interface ClienteDao {
    void save(Cliente cliente);
    void edit(Cliente cliente);
    void delete(String idCliente); 
}
