/*
 * Project Developed By Jose Daniel Jiménez Medina
 * jdjimenezm@correo.udistrital.edu.co
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import org.netbeans.lib.awtextra.AbsoluteLayout;

/**
 *
 * @author Jimenez Medina
 */
public class configuracion extends JFrame {
    
    
    private JLabel leyenda, A_inicial, nombre, duracion, autor, id, id_Antecesor;
    private JButton anadir_A, dibujar, Reiniciar;
    private JPanel header, body, footer;
    private JTextField jtNombren, jtDuracion, jtidAntecesor, jtid_Actividad;
    
    
          
    public configuracion(){
        
        super ("Configuración de las actividades.");       
        
        //inicializacion de los elementos
        leyenda = new JLabel(); 
        A_inicial = new JLabel(); 
        nombre = new JLabel();
        duracion = new JLabel();
        autor = new JLabel();
        id = new JLabel();
        id_Antecesor = new JLabel();
        
        
        
        //Configuración del texto de los label
        this.leyenda.setText("A continuacion puedes añadir actividades especificando su nombre, duración y antecesor.");
        this.leyenda.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
        this.leyenda.setAlignmentX(CENTER_ALIGNMENT);
        
        this.A_inicial.setText("Actividad Inicial: ");
        this.A_inicial.setFont(new Font("Tw Cen MT", Font.BOLD, 15));
        
        this.nombre.setText("Nombre: ");
        this.nombre.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
        
        this.duracion.setText("Duración: ");
        this.duracion.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
        
        this.id.setText("ID: ");
        this.id.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
        
        this.autor.setText("");
        this.autor.setFont(new Font("Tw Cen MT", Font.PLAIN, 10));
        
        this.id_Antecesor.setText("Antecesor: ");
        this.id_Antecesor.setFont(new Font("Tw Cen MT", Font.PLAIN, 13));
        
        this.initComponents();

        
        
        
    }
    
    public void initComponents(){
        
        //Default Close Operation 
        
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        //Creacion del Contenedor Principal del la ventana.
        Container Contenedor = this.getContentPane();
        
        Contenedor.add(this.leyenda, BorderLayout.NORTH);
        
        Contenedor.add(this.autor, BorderLayout.SOUTH);
        
        
        
        
        
        //Configuración del tamaño de la ventana
        this.setSize(new java.awt.Dimension (580,196)); 
                
        
        this.setVisible(true);
        
    }
    
    
            
}
