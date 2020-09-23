/*
 * Project Developed By Jose Daniel Jiménez Medina
 * jdjimenezm@correo.udistrital.edu.co
 */
package vista;

/**
 *
 * @author Jimenez Medina
 */
public class checker {
    
    public boolean registro_exitoso;
    public int n_actividades;
    
    public checker(){
        registro_exitoso = false;
        n_actividades = 0;
    }
    
    public void registro (){
        registro_exitoso = true;
        System.out.println("Actividad número "+n_actividades);
        n_actividades = n_actividades+1;
        
    }
    
}
