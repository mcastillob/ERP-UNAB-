/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unab.erp.core.rrhh.dao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import unab.erp.configuracion.HibernateUtil;
import unab.erp.core.rrhh.repository.*;
import unab.erp.core.rrhh.model.Liquidacion;
/**
 *
 * @author miguelcastillo
 */
public class LiquidacionDao implements RepositorioRRHH<Liquidacion, Integer>  {
    
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
            public void update(Liquidacion entity) {
                 getCurrentSession().update(entity);

            }

            @Override
            public Liquidacion findById(Integer id) {
                 Liquidacion liquidacion = (Liquidacion) getCurrentSession().get(Liquidacion.class, id);

            return liquidacion;

            }

            @Override
            public void delete(Liquidacion entity) {
                getCurrentSession().delete(entity);
            }

            @Override
            public List<Liquidacion> findAll() {
                 List<Liquidacion> liquidaciones = (List<Liquidacion>) getCurrentSession().createQuery("FROM Liquidacion e").list();
                 return liquidaciones;

            }
            
            public Liquidacion findById(int id) {
                 List<Liquidacion> empleados = (List<Liquidacion>) getCurrentSession().createQuery("FROM Empleado e WHERE e.liquidacion_id=:id").setParameter("id", id).list();
                 
                 if(empleados.size()>0){
                  return empleados.get(0);
                 }
                 
                 return null;

            }
            
           

            @Override
            public void deleteAll() {
                 List<Liquidacion> entityList = findAll();

                for (Liquidacion entity : entityList) {

                    delete(entity);

                }

            }

            @Override
            public void save(Liquidacion entity) {
                getCurrentSession().save(entity);

            }
    
}
