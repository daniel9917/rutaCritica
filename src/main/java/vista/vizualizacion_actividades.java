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
        JTaTexto.setText("Aquí podrá visualizar las actividades registradas, "
                + "listas para ser dibujadas en el diagrama de ruta critica.");
        JTaTexto.setEditable(false);        
        JTaTexto.setBackground(new java.awt.Color(240, 240, 240));
        JTaTexto.setFont(this.Fuente_plana_14);
        JTaTexto.setRows(4);
        JTaTexto.setColumns(10);                                
        
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
        //Configuracion del Panel del JFrame
        this.getContentPane().add(JPDerecha, BorderLayout.EAST);
        this.getContentPane().add(JPIzquierda, BorderLayout.WEST);
        
        //Configuración Panel Izquierdo
        JPIzquierda.setLayout(new BoxLayout(JPIzquierda, BoxLayout.Y_AXIS));
        
        this.JPIzquierda.add(JPtexto);
        this.JPIzquierda.add(JPBotones);
        
        //Configuracion Panel Derecho
        
        this.JPDerecha.add(JPTabla);
        
        //Configuracion Derecho/Tabla
        this.JPTabla.add(jlprueba);
        
        //Configuracion Izquierdo/Panel Texto
        JPtexto.add(JTaTexto);
        
        //Configuracion Izquierdo/Panel Botones
        JPBotones.setLayout(new BoxLayout(JPBotones, BoxLayout.Y_AXIS));
        
        JPBotones.add(JBanadir);
        JPBotones.add(JBdibujar);
        JPBotones.add(JBReiniciar);          
        
        this.setSize(new Dimension (677,328));
        
        this.setVisible(true);
        
        
                
    }
    
    
}
