/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.erp.projectManager.dao;

import cl.unab.erp.projectManager.model.Proyecto;

/**
 *
 * @author Miguel
 */
public interface ProjectDao {
    void save(Proyecto proyecto);
    void edit(Proyecto proyecto);
    void delete(String idProject);
}
