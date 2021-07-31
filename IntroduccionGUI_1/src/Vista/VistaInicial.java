/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package Vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Cristian
 */
public class VistaInicial extends JFrame{ //crea una ventana
    private JPanel panelPRincipal;
    private JButton boton1;
    public VistaInicial(){ //contructor
        super(); //clase padre 
        setTitle("Primer guit"); //titulo de la ventana
        setBounds(0,0,500,500); //tamanio y posicion de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //PARA PODER DARLE CLICK EN CERRAR
        initcomponentes(); //en este orden
        setContentPane(panelPRincipal); //contenedor dentro de la ventana que creamos le asignamos
        
        /*
creamos colores para fondo de pantalla, pero no porque 
        se necesita cambiar al panel
*/        
        setForeground(Color.BLUE); 
    }
    public void initcomponentes(){
        this.panelPRincipal=new JPanel(); //ojo esto es solo del panel dentro de la ventana
        panelPRincipal.setBounds(0,0,500,500); //inicio dentro de la propia ventana JFRAME
        panelPRincipal.setBackground(Color.GREEN);
        
        boton1=new JButton(); //creamos un boton como interfaz en el panel
        boton1.setText("Mi primer boton");
        boton1.setBackground(Color.blue);
        boton1.setBounds(50,50,50,48);
        panelPRincipal.add(boton1);

    }
            
}
