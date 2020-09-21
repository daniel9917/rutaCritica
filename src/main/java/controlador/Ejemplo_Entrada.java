/*
 * Project Developed By Jose Daniel Jiménez Medina
 * jdjimenezm@correo.udistrital.edu.co
 */
package controlador;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jimenez Medina
 */
public class Ejemplo_Entrada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner S = new Scanner (System.in);
        
        System.out.println("Bienvenido a la calculadora de Ruta Critica:");
        boolean ingresar;
        ingresar = true;
        
        Actividad A = new Actividad();
        Diagrama D = new Diagrama();
        
               
        
        
        System.out.println("Ingresar Actividades ------------->");
        System.out.println("");
        
        
        
        
        do {
            
            //Captura de Datos Iniciales de la actividad
            System.out.println("Nombre de la Actividad: ");
            String Nombre = S.next();
            System.out.println("");
            
            System.out.println("ID de la Actividad (entero): ");
            int id = S.nextInt();
            System.out.println("");            
            
            System.out.println("Ingresar duración (entero)");
            int Duracion = S.nextInt();
            System.out.println("");
            
            System.out.println("Ingresar actividades separadas por comas. Ejemplo (A,B,C,D,... etc)");
            String Predecesoras =  S.next();
            System.out.println("");
            
            System.out.println("Actividad "+ Nombre+" Registrada con exito.");
            
            System.out.println("");
        
            System.out.println("Escriba 1 si desea ingresar más actividades, cualquier otra cosa si no.");
            String opt = S.next();
            System.out.println("");
            
            
            
            //Creación del objeto Actividad
            
            
            
        
            
            if (!("1".equals(opt))){
                ingresar = false;
                System.out.println("Armando Diagrama");
            }
        
        }while (ingresar);               
    }
//    public static void main (String Args[]){
//        ArrayList <String> Prueba = new ArrayList();
//        Prueba.add("");
//        System.out.println("Longitud del arrreglo vacío: "+Prueba.size());
//    }
    
    
}