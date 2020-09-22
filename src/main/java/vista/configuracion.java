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
    
    int id;
    private JLabel jlLeyenda, jlNombre, jlDuracion, jlAutor, jlId, jlID_Antecesor;
    private JButton jbRegistrar, jbLimpiar, jbCancelar;
    private JPanel jpHeader, jpBody, jpFooter, jpInicio, jpBotones;
    private JTextField jtFNombren, jtFDuracion, jtFidAntecesor, jtFid_Actividad;
    
    
          
    public configuracion(){
        
        super ("Configuración de las actividades.");       
        
        //inicializacion de los label
        id = 1;
        jlLeyenda = new JLabel();         
        jlNombre = new JLabel();
        jlDuracion = new JLabel();
        jlAutor = new JLabel();
        jlId = new JLabel();
        jlID_Antecesor = new JLabel();
        
        //Inicializacion de los JPanel
        
        jpHeader = new JPanel();
        jpBody = new JPanel();
        jpFooter = new JPanel();
        jpInicio = new JPanel();        
        jpBotones = new JPanel();
        
        
        //Inicializacion de los JButton
        
        this.jbRegistrar = new JButton();
        this.jbLimpiar = new JButton();
        this.jbCancelar = new JButton();
        
        //Inicializacion de los JTextField
        
        this.jtFDuracion = new JTextField ();
        jtFNombren = new JTextField ();
        jtFidAntecesor = new JTextField ();
        jtFid_Actividad = new JTextField ();
                                                
                
        
        //Configuración del texto de los label
        this.jlLeyenda.setText("A continuacion puedes añadir actividades especificando su nombre, duración y antecesor.");
        this.jlLeyenda.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
        this.jlLeyenda.setAlignmentX(CENTER_ALIGNMENT);                
        
        this.jlNombre.setText("Nombre: ");
        this.jlNombre.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
        
        this.jlDuracion.setText("Duración: ");
        this.jlDuracion.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
        
        this.jlId.setText("ID: ");
        this.jtFid_Actividad.setText(id+"");
    
        this.jlId.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));        
        
        this.jlAutor.setText("Creado Por José Daniel Jiménez Medina - Universidad Distrital Francisco José de Caldas, 2020.");
        this.jlAutor.setFont(new Font("Tw Cen MT", Font.PLAIN, 10));
        this.jlAutor.setAlignmentX(CENTER_ALIGNMENT);
        
        this.jlID_Antecesor.setText("ID_Antecesor: ");
        this.jlID_Antecesor.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
        
        //Configuracion de los botones
        
        this.jbRegistrar.setText("Registrar Actividad");
        this.jbRegistrar.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
        
        this.jbLimpiar.setText("Limpiar Campos");
        this.jbLimpiar.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));
        
        this.jbCancelar.setText("Cancelar");
        this.jbCancelar.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));        
        
        
        //Configuración de los JTextField
        
        jtFDuracion.setFont(new Font("Tw Cen MT", Font.PLAIN, 14)); 
        jtFDuracion.setColumns(6);
        
        
        
        jtFNombren.setFont(new Font("Tw Cen MT", Font.PLAIN, 14));         
        jtFNombren.setColumns(8);
        
        jtFid_Actividad.setFont(new Font("Tw Cen MT", Font.PLAIN, 14)); 
        jtFid_Actividad.setColumns(3);
        jtFid_Actividad.setEditable(false);
                
        jtFidAntecesor.setFont(new Font("Tw Cen MT", Font.PLAIN, 14)); 
        jtFidAntecesor.setColumns(3);
        
        this.initComponents();
 
        
    }
    
    public void initComponents(){
        
        //Default Close Operation 
        
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        //Creacion del Contenedor Principal del la ventana.
        Container Contenedor = this.getContentPane();
        
        //Agregación de los elementos a su panel correspondiente
        //Panel encabezado
        this.jpHeader.add(this.jlLeyenda);
        
        //Panel cuerpo
        this.jpBody.add(this.jpInicio);        
        this.jpBody.add(jpBotones);
        
        
        //Panel pie de página        
        this.jpFooter.add(this.jlAutor);
        
        //Panel Cuerpo/Inicio        
        jpInicio.add(jlNombre);
        jpInicio.add(jtFNombren);
        jpInicio.add(jlDuracion);
        jpInicio.add(jtFDuracion);
        jpInicio.add(jlId);
        jpInicio.add(jtFid_Actividad);
        jpInicio.add(jlID_Antecesor);
        jpInicio.add(jtFidAntecesor);
        
        //Panel Cuerpo/ Actividades
               
        
        //Panel Cuerpo/ Botono
        
        jpBotones.add(jbRegistrar);
        jpBotones.add(jbLimpiar);
        jpBotones.add(jbCancelar);
                                        
        
        Contenedor.add(this.jpHeader, BorderLayout.NORTH);
        Contenedor.add(this.jpBody, BorderLayout.CENTER);
        Contenedor.add(this.jpFooter, BorderLayout.SOUTH);
        
        
        
        
        
        //Configuración del tamaño de la ventana
        this.setSize(new java.awt.Dimension (580,170)); 
                
        
        this.setVisible(true);
        
    }
    
    
            
}

