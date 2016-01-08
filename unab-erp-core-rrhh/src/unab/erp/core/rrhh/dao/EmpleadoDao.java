/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unab.erp.core.rrhh.dao;

/**
 *
 * @author miguelcastillo
 */

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import unab.erp.configuracion.HibernateUtil;
import unab.erp.core.rrhh.repository.*;
import unab.erp.core.rrhh.model.Empleado;


public class EmpleadoDao  implements RepositorioRRHH<Empleado, Integer>  {
    
    
    private Session currentSession;
    private Transaction currentTransaction;

    
       public Session openCurrentSession() {
		this.currentSession = HibernateUtil.getSessionFactory().openSession();
		return this.currentSession;
	}

	public Session openCurrentSessionwithTransaction() {
		this.currentSession = HibernateUtil.getSessionFactory().openSession();
		this.currentTransaction = currentSession.beginTransaction();
		return this.currentSession;
	}
	
	public void closeCurrentSession() {
		this.currentSession.close();
	}
	
	public void closeCurrentSessionwithTransaction() {
		this.currentTransaction.commit();
		this.currentSession.close();
	}
	
	public Session getCurrentSession() {
		return currentSession;
	}

	public void setCurrentSession(Session currentSession) {
		this.currentSession = currentSession;
	}

	public Transaction getCurrentTransaction() {
		return currentTransaction;
	}

	public void setCurrentTransaction(Transaction currentTransaction) {
		this.currentTransaction = currentTransaction;
	}

           
            @Override
            public void update(Empleado entity) {
                 getCurrentSession().update(entity);

            }

            @Override
            public Empleado findById(Integer id) {
                 Empleado empleado = (Empleado) getCurrentSession().get(Empleado.class, id);

            return empleado;

            }

            @Override
            public void delete(Empleado entity) {
                getCurrentSession().delete(entity);
            }

            @Override
            public List<Empleado> findAll() {
                 List<Empleado> empleados = (List<Empleado>) getCurrentSession().createQuery("FROM Empleado e").list();
                 return empleados;

            }
            
            public Empleado findByRut(String rut) {
                 List<Empleado> empleados = (List<Empleado>) getCurrentSession().createQuery("FROM Empleado e WHERE e.rut=:PARAM_RUT").setParameter("PARAM_RUT", rut).list();
                 
                 if(empleados.size()>0){
                  return empleados.get(0);
                 }
                 
                 return null;

            }
            
                public List<Empleado>  findAllByRut(String rut) {
                 List<Empleado> empleados = (List<Empleado>) getCurrentSession().createQuery("FROM Empleado e WHERE e.rut=:PARAM_RUT").setParameter("PARAM_RUT", rut).list();
                 
                 return empleados;

            }

            @Override
            public void deleteAll() {
                 List<Empleado> entityList = findAll();

                for (Empleado entity : entityList) {

                    delete(entity);

                }

            }

            @Override
            public void save(Empleado entity) {
                getCurrentSession().save(entity);

            }
}
