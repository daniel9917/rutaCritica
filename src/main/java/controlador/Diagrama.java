/*
 * Project Developed By Jose Daniel Jiménez Medina
 * jdjimenezm@correo.udistrital.edu.co
 */
package controlador;

import java.util.ArrayList;

/**
 *
 * @author Jimenez Medina
 */
public class Diagrama {
    
    private int duracion_total;
    private Actividad inicial;   
    private Actividad end;
    private ArrayList <Actividad> actividades;    
    private ArrayList <Actividad> ruta_critica;
    private Actividad A;
    
    //Método que calcula la ruta crítica dado un diagrama con actividades.
    
    //Crea un diagrama
    public Diagrama(){
        this.inicial = new Actividad("Actividad inicial",0,0,null);
        this.end = new Actividad("Actividad final",9999, 0 , "0");
        
        
    }
    
    private Actividad calcular_ruta_critica(){
        return null;
    }
    
    //Añade una actividad
    public void anadirAct(String Nombre, int id, int Duracion, String Predecesores){
        
        A = new Actividad(Nombre, id, Duracion, Predecesores);
        if (this.end.getStringPredecesores().equals("0")) {
            //Primera Actividad del Diagrama                        
            this.inicial.anadirSucesor(A);            
        }else{
            
        }
        
        System.out.println("Actividad añadida con éxito.");        
    }
    
    //Elimina una actividad a través del ID
    public void eliminarAct(int id){
        
        this.actividades.removeIf( A -> (A.getId() == id) );
        System.out.println("Actividad eliminada.");
    }    
    
    
}
