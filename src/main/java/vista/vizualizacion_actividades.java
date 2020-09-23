/*
 * Project Developed By Jose Daniel Jiménez Medina
 * jdjimenezm@correo.udistrital.edu.co
 */
package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author Jimenez Medina
 */
public class vizualizacion_actividades extends JFrame{
    
    private Font Fuente_plana_14;
    private Font Fuente_plana_10;
    
    
    private JPanel JPDerecha, JPIzquierda, JPtexto, JPBotones, JPTabla;
    
    private JButton JBanadir, JBdibujar, JBReiniciar;
    
    private JTextArea JTaTexto;
    
    private JLabel jlprueba;
    
       
    public vizualizacion_actividades (){
        
        super("Cuadro de Actividades");        
        
        
        jlprueba = new JLabel();
        
        jlprueba.setText("Prueba");    
        
        
               
        
        //Instanciacion de las Fuentes
        this.Fuente_plana_14  = new Font("Tw Cen MT", Font.PLAIN, 14);
        this.Fuente_plana_10  = new Font("Tw Cen MT", Font.PLAIN, 14);                        
        
        //Inicializacion de los Panel
        JPDerecha = new JPanel();
        JPIzquierda = new JPanel();
        JPtexto = new JPanel();
        JPBotones = new JPanel();
        JPTabla = new JPanel();
        
        //Inicializacion de los Botones
        JBanadir = new JButton();
        JBdibujar = new JButton();
        JBReiniciar = new JButton();
        
        //Inicializacion de los TextArea
        JTaTexto = new JTextArea();    
        
        
        //Configuracion JTextArea
        JTaTexto.setRows(10);
        JTaTexto.setColumns(5);   
        JTaTexto.setText("Aquí podrá visualizar las actividades registradas, "
                + "listas para ser dibujadas en el diagrama de ruta critica.");
        JTaTexto.setEditable(false);        
        JTaTexto.setBackground(new java.awt.Color(240, 240, 240));
        JTaTexto.setFont(this.Fuente_plana_14);
                             
        
        //Configuración de los Botones
        
        JBReiniciar.setText("Reiniciar");
        JBReiniciar.setFont(Fuente_plana_14);
        JBReiniciar.setAlignmentX(CENTER_ALIGNMENT);
               
        JBanadir.setText("Añadir Actividad");
        JBanadir.setFont(Fuente_plana_14);
        JBanadir.setAlignmentX(CENTER_ALIGNMENT);
        
        JBdibujar.setText("Dibujar Diagrama");
        JBdibujar.setFont(Fuente_plana_14);                        
        JBdibujar.setAlignmentX(CENTER_ALIGNMENT);
        
        initComponents();
                        
    }
    
    private void initComponents(){
        
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        //Configuracion Izquierdo/Panel Texto
        this.JPtexto.setSize(216, 85);
        

        //Configuracion Izquierdo/Panel Botones
         this.JPBotones.setLayout(new BoxLayout (this.JPBotones, BoxLayout.Y_AXIS));
         this.JPBotones.setSize(216, 156);
         this.JPBotones.add(this.JBanadir);
         this.JPBotones.add(this.JBdibujar);
         this.JPBotones.add(this.JBReiniciar);
         
         
        //Configuracion del Panel del JFrame
        
        
        
        
        //Configuración Panel Izquierdo                        
        
        
        
        
        //Configuracion Panel Derecho
        
        
        
        //Configuracion Derecho/Tabla
        
        

        
        
        
        
        
        
        this.setSize(new Dimension (677,328));
        
        this.setVisible(true);
        
        
                
    }
    
    
}
