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
public class Actividad {
    
    //variables de caracterización de la actividad
    private int id;
    private String nombre;  
    private int duracion;
    private int holgura;
    
    //variables para el calculo de la ruta critica
    private int inicio_cercano;
    private int inicio_lejano;
    private int termino_cercano;
    private int termino_lejano;
    
    //Variables para el posicionamiento en la lista
    private ArrayList <Actividad> predecesores;
    private ArrayList <Actividad> sucesores;
    
    private String StringPredecesores;
    private int npredecesores;
    
    //Constructor Vacío
    public Actividad(){
        this.sucesores = new ArrayList();
        this.predecesores = new ArrayList();
        
    }
    
    public Actividad (String Nombre, int Duracion, int id, String Predecesores){
        this.nombre = Nombre;
        this.id = id;
        this.duracion = Duracion;        
        this.StringPredecesores = Predecesores;
        
        this.sucesores = new ArrayList();
        this.predecesores = new ArrayList();
        
        npredecesores = Predecesores.split("").length;
        
//        Metodo para convertir a arreglo.
//        String [] arreglo = Predecesores.split(",");                
        
        
    }
    
    
    //Metodo para buscar actividad en lista de actividades predecesoras
    public Actividad buscar_predecesor(int id){
        for (Actividad i : this.predecesores){
            if (i.id == id){
                return i;
            }
        }
        System.out.println("No se encontro actividad con tal id");
        return null;
    }
    
    //Metodo para buscar actividad en lista de actividades sucesoras
    public Actividad buscar_sucesor(int id){
        for (Actividad i : this.sucesores){
            if (i.id == id){
                return i;
            }
        }
        System.out.println("No se encontro actividad con tal id");
        return null;
    }    
    
    
    public void anadirSucesor(Actividad sucesor){
        this.sucesores.add(sucesor);
    }
    
    public void anadirPredecesor(Actividad predecesor){                
        this.predecesores.add(predecesor);                
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getHolgura() {
        return holgura;
    }

    public void setHolgura(int holgura) {
        this.holgura = holgura;
    }

    public int getInicio_cercano() {
        return inicio_cercano;
    }

    public void setInicio_cercano(int inicio_cercano) {
        this.inicio_cercano = inicio_cercano;
    }

    public int getInicio_lejano() {
        return inicio_lejano;
    }

    public void setInicio_lejano(int inicio_lejano) {
        this.inicio_lejano = inicio_lejano;
    }

    public int getTermino_cercano() {
        return termino_cercano;
    }

    public void setTermino_cercano(int termino_cercano) {
        this.termino_cercano = termino_cercano;
    }

    public int getTermino_lejano() {
        return termino_lejano;
    }

    public void setTermino_lejano(int termino_lejano) {
        this.termino_lejano = termino_lejano;
    }

    public ArrayList<Actividad> getPredecesor() {
        return predecesores;
    }
    
    public ArrayList<Actividad> getSucesor() {
        return sucesores;
    }

    public String getStringPredecesores() {
        return StringPredecesores;
    }

    public void setStringPredecesores(String StringPredecesores) {
        this.StringPredecesores = StringPredecesores;
        npredecesores = this.StringPredecesores.split("").length;
        
    }

    public ArrayList<Actividad> getPredecesores() {
        return predecesores;
    }

    public void setPredecesores(ArrayList<Actividad> predecesores) {
        this.predecesores = predecesores;
    }

    public ArrayList<Actividad> getSucesores() {
        return sucesores;
    }

    public void setSucesores(ArrayList<Actividad> sucesores) {
        this.sucesores = sucesores;
    }

    public int getNpredecesores() {
        return npredecesores;
    }

    public void setNpredecesores(int npredecesores) {
        this.npredecesores = npredecesores;
    }
    
    
    
    
    
}
