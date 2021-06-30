/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficas;

import javax.swing.JFrame;

/**
 *
 * @author Cristian
 */
public class Ventana extends JFrame{
    private Panel panelprincipal=new Panel();
    
    public Ventana(){
        setTitle("Grafica 2D");
        setBounds(0, 0, 500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponentes();
    }
    public void initComponentes(){
        panelprincipal=new Panel();
        setContentPane(panelprincipal);
        panelprincipal.repaint();
        addKeyListener(panelprincipal);
    }
}
