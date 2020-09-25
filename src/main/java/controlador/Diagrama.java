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
        
    }
    
    private Actividad calcular_ruta_critica(){
        return null;
    }
    
    //Añade una actividad
    public void add(Actividad Nueva){
        System.out.println("Añadiendo Actividad "+Nueva.getNombre()+" "+Nueva.getId());
        if (Nueva.getId() == 0){
            this.inicial = Nueva;
            System.out.println("Actividad Inicial Añadida");
            System.out.println(Nueva.getNombre()+" "+Nueva.getId());
        }
        
        if (Nueva.getId() == 999){
            this.end = Nueva;    
            System.out.println("Actividad Final Añadida");
        }
        
        if ((Nueva.getId()!= 0) && (Nueva.getId() != 999)){
            System.out.println(buscarNodo(Integer.parseInt(Nueva.getStringPredecesores().split(",")[0]), this.inicial));
            for (int i = 0; i < Nueva.getNpredecesores(); i++){
                buscarNodo(Integer.parseInt(Nueva.getStringPredecesores().split(",")[i]), this.inicial).getSucesores().add(Nueva);                               
            }            
        }        
    }
    
    
    
    /*
    *Método para Buscar una Actividad en el diagrama:
    *Parámetro id: Almacena la información del id
    * de la actividad que se está buscando   
    *    
    *Parámetro Actividad A: Almacena la actividad que va a actuar    
    *como nodo raiz para buscar entre sus hijos.
    *
    *Operación:
    *Consiste en que entra el id que se está buscando junto con la actividad inicial
    *el método primero verifica que hayan sucesores, (aplica para actividad inicial y final)    
    *si no hay sucesores quiere decir que no se encontró la actividad y por tanto no exite.
    *
    *En caso de que haya sucesores, el metodo itera teniendo en cuenta la cantidad de suceres,    
    *en la iteración verifica si el sucesor i es el elemento que se busca, en caso de ser así
    *retorna ese elemento, luego verifica si al buscar por las ramasa del nodo encuentra la actividad buscada,
    *en caso de ser así, retornará esa actividad para poder gestionarla.
    *
    *
    *
     */
    public Actividad buscarNodo(int id, Actividad A){
        if (A.getSucesores().isEmpty()){
        return null;
        }
        for (int i = 0; i < A.getSucesores().size(); i++){
            if (A.getSucesores().get(i).getId() == id){
                return A.getSucesores().get(i);
            }
            if (buscarNodo (id, A.getSucesores().get(i)) != null){
               return buscarNodo(id, A.getSucesores().get(i));
            }
        }                
        return null;
    }
    
    //Elimina una actividad a través del ID
    public void eliminarAct(int id){

    }    
    
    
}
