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
public class Actividad {
  private String id;
   private String nombre;
   private String inicio;
   private String fin;
   private String idProyecto;
   private String rutRecurso; 
   private boolean estado; 
   
   public Actividad(String id, String nombre, String inicio, String fin, String proyecto, String recurso, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.inicio = inicio;
        this.fin = fin;
        this.idProyecto = proyecto;
        this.rutRecurso = recurso;
        this.estado = estado;
    }
   
   public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public void setFin(String fin) {
        this.fin = fin;
    }

   

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getInicio() {
        return inicio;
    }

    public String getFin() {
        return fin;
    }

    public String getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(String idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getRutRecurso() {
        return rutRecurso;
    }

    public void setRutRecurso(String rutRecurso) {
        this.rutRecurso = rutRecurso;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
    public class getRecurso {

        public getRecurso() {
        }
    }
   
   
}



