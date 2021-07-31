/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author Cristian
 */
public class VistaInicial extends JFrame{ //crea una ventana
    private JPanel panelPRincipal;
    private JButton boton1;
    private JTextField cuadroTexto;
    private JLabel etiqueta;
    private JTextArea cuadroTextoGrande;
    private JComboBox cajaCombo;
    public VistaInicial(){ //contructor
        super(); //clase padre 
        setTitle("Primer guit"); //titulo de la ventana
        setBounds(0,0,500,500); //tamanio y posicion de la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //PARA PODER DARLE CLICK EN CERRAR
        //initcomponentesBorderLayout(); //en este orden botones y varios
        this.initcomponentesGrindLayout(); //para crear tabla
        setContentPane(panelPRincipal); //contenedor dentro de la ventana que creamos le asignamos
        
        /*
creamos colores para fondo de pantalla, pero no porque 
        se necesita cambiar al panel
*/        
        setForeground(Color.BLUE); 
    }
    public void initcomponentesGrindLayout(){ //matriz de botones.
        this.panelPRincipal=new JPanel();
        GridLayout tablaPlantilla=new GridLayout(4,3);
        panelPRincipal.setLayout(tablaPlantilla);
        int contador=0;
        for(int i=0;i<tablaPlantilla.getRows();i++){
            for(int j=0;j<tablaPlantilla.getColumns();j++){
                String texto=""+contador; //numeros
                if(contador==10){
                    texto="+";
                }else if(contador==11){
                    texto="=";
                }
                JButton boton=new JButton(texto);
                boton.addActionListener(new ActionListener() { //evento que escucha cuando presiono el boton
                    @Override
                    public void actionPerformed(ActionEvent ae) {
                        JButton btn=(JButton)ae.getSource();
                        JOptionPane.showMessageDialog(panelPRincipal,"has prescionado "+btn.getText());
                    }
                });
                panelPRincipal.add(boton);
                contador++;
            }
        }
    }
    public void initcomponentesBorderLayout(){
        this.panelPRincipal=new JPanel(); //ojo esto es solo del panel dentro de la ventana
        panelPRincipal.setLayout(new BorderLayout());
        panelPRincipal.setBounds(0,0,500,500); //inicio dentro de la propia ventana JFRAME
        panelPRincipal.setBackground(Color.GREEN);
        
        boton1=new JButton(); //creamos un boton como interfaz en el panel
        boton1.setText("Mi primer boton");
        boton1.setBackground(Color.blue);
        boton1.setBounds(50,50,50,48);
        panelPRincipal.add(boton1,BorderLayout.CENTER); //border layout nos pone en determinado lugar el componente
        cuadroTexto=new JTextField("");
        panelPRincipal.add(cuadroTexto,BorderLayout.NORTH);
        cuadroTextoGrande=new JTextArea("");
        panelPRincipal.add(cuadroTextoGrande,BorderLayout.SOUTH);
        etiqueta=new JLabel("Esta es una etiqueta");
        panelPRincipal.add(etiqueta,BorderLayout.WEST);
        cajaCombo=new JComboBox();
        cajaCombo.addItem("seleccion 1");
        cajaCombo.addItem("seleccion 2");
        cajaCombo.addItem("seleccion 3");
        panelPRincipal.add(cajaCombo,BorderLayout.EAST);

    }
            
}
