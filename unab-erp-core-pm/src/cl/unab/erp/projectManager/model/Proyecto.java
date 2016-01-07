/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.unab.erp.projectManager.model;


/**
 *
 * @author mcamilettimellado
 */
public class Proyecto {
   
   private String id;
   private String nombre;
   private String inicio;
   private String fin;
   private String RutJpLocal;
   private String jpCliente;
   private String idCliente;
   private String descripcion;

   
    public Proyecto(String id, String nombre, String inicio, String fin, String jp,String jpCliente, String cliente) {
        this.id = id;
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.RutJpLocal=jp;
        this.jpCliente=jpCliente;
        this.idCliente = cliente;
 
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getFin() {
        return fin;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

 

    public String getJpCliente() {
        return jpCliente;
    }

    public void setJpCliente(String jpCliente) {
        this.jpCliente = jpCliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getRutJpLocal() {
        return RutJpLocal;
    }

    public void setRutJpLocal(String RutJpLocal) {
        this.RutJpLocal = RutJpLocal;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }
 
}
