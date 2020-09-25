/*
 * Project Developed By Jose Daniel Jiménez Medina
 * jdjimenezm@correo.udistrital.edu.co
 */
package modelo;

import controlador.Actividad;
import controlador.Diagrama;
import javax.swing.JTable;

/**
 *
 * @author Jimenez Medina
 */
public class Manager {
    
    Actividad A;
    Diagrama D;
    
    public Manager (){
        D = new Diagrama();
        
        
    }
    //Método para dibujar el diagrama
    public void Dibujar(Diagrama D){
    
    }
    
    //Método para crear actividades y añadirlas al diagrama
    public void crearActividades(JTable J){
        int columnas, filas;
        columnas = J.getModel().getColumnCount();
        filas = J.getModel().getRowCount();
        
        
        
        
        for (int i = 0; i < J.getModel().getRowCount(); i++){
        //Recorre Cada Fila                            
        
        //Creación del objeto actividad con los respectivos datos de cada fila
            A = new Actividad(J.getModel().getValueAt(i, 0).toString()
                    ,Integer.parseInt(J.getModel().getValueAt(i, 1).toString())
                    ,Integer.parseInt(J.getModel().getValueAt(i, 2).toString())
                    ,J.getModel().getValueAt(i, 3).toString());                   
//        System.out.println("Nombre :"+ A.getNombre()+", Duración :"+A.getDuracion()+", Id Actividad:"+A.getId()+", Id Antecesores:"+A.getStringPredecesores());
//        System.out.println("------");

            D.add(A);
            
            
            
            
            
        }
                
        
    }
}
