/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author miguelcastillo
 */

import java.util.Date;
import unab.erp.configuracion.HibernateUtil;
import java.util.List;
import org.hibernate.*;
import unab.erp.core.rrhh.model.*;


public class inicio {

    public inicio() {
    }
 
    public static void main(String[] args){
   //inicio la fabrica de sesiones que se conectan a una base de datos embebida 
    Session session=  HibernateUtil.getSessionFactory().openSession();
    try{
        //se inicia una transaccion para asegurara la grabación 
       session.beginTransaction();
       

       /*
       //se crea un objeto persona con sus datos correspondientes 
        Persona objPersona=new Persona();
        objPersona.rut="16122203-8";

        objPersona.nombre="Miguel";
        objPersona.apellidoPat="Castillo";
        objPersona.apellidoMat="Berrios";
        objPersona.correo="mcastillo.berrios@gmail.com";

                  
        //se realiza la grabación del objeto persona en la base de datos 
        session.save(objPersona); 
       
       */
   
        Usuario obj_usuario=new Usuario();
        obj_usuario.rut="16122203-9";
        obj_usuario.nombre="Miguel berrios";
        obj_usuario.apellidoPat="Castillo";
        obj_usuario.apellidoMat="Berrios";
        obj_usuario.correo="mcastillo.berrios@gmail.com";
        obj_usuario.setClave("123456");
        obj_usuario.setFechaIngreso(new Date());
        obj_usuario.setFechaNacimiento(new Date(2015,04,22));
        
        session.save(obj_usuario);
        
        
        
        
        
        /*
        //se agrega la primera direccion 
        Direccion objDireccion=new Direccion();        
        objDireccion.calle    ="amunategui";
        objDireccion.numero   =695;
        objDireccion.setPersona(objPersona);
        session.save(objDireccion);
        
        //se agrega la segunda direccion 
        Direccion objDireccion2=new Direccion();        
        objDireccion2.calle    ="agustinas";
        objDireccion2.numero   =1419;
        objDireccion2.setPersona(objPersona);
        session.save(objDireccion2);
        */
        //confirma la grabación 
        session.getTransaction().commit();
                
        
        
    //  Query qry_persona= session.createQuery("select p from Persona p left join fetch p.direcciones");   
     // List<Persona> list_personas=qry_persona.list();
       
       
/*
        System.out.println("PERSONAS REGISTRADAS");
       for(Persona objpersonaActual : list_personas){
       
           System.out.println("ID: "+objpersonaActual.getPersona_id()+" "+objpersonaActual.getNombre()+" "+objpersonaActual.getApellido_pat()+" "+objpersonaActual.getApellido_mat());
          
           if(objpersonaActual.getDirecciones()!=null){                                 
           for(Direccion objDir : objpersonaActual.getDirecciones()){
       
             System.out.println("DIRECCION: "+objDir.getCalle()+" NUMERO:"+objDir.getNumero());
             
           }
           }
          
           
       }*/
    
    }catch(Exception error){
    
        //en caso de algun error se anula la grabación 
        session.getTransaction().rollback();
    }finally{
    // se  libera la sesion utilizada 
    session.close();
    }
 
   
    
    }
    
    
}
