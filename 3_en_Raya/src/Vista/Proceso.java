/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Cristian
 */
public class Proceso extends  JFrame{
    private JPanel panelPrincipal;
    private String val;
    private String val2;
    private String k[][];
    public Proceso(){
        super();
        val="X";
        setTitle("TRES EN RAYA");
        setBounds(0,0,600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.iniciarcomp();
        this.tabla();
        setContentPane(panelPrincipal);
    }
    public void iniciarcomp(){
        k=new String[3][3];
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k[i].length; j++) {
                k[i][j]="";
            }
        }
    }
    public void tabla(){
        this.panelPrincipal=new JPanel();
        GridLayout tabla=new GridLayout(3,3);
        panelPrincipal.setLayout(tabla);
        for (int i = 0; i < tabla.getRows(); i++) {
            for (int j = 0; j < tabla.getColumns(); j++) {
                JButton boton=new JButton();
                boton.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent pal) {
                        if (val=="X") {
                            val2=val;
                            boton.setText(val);
                            val="O";
                        }else if (val=="O") {
                            boton.setText(val);
                            val2=val;
                            val="X";
                        }
                    }
                });
                k[i][j]=val2;
                panelPrincipal.add(boton);
            }
        }
        
    }
    public void comprobar(){
        if(k[0][0].equals("X") && k[0][1].equals("X") &&  k[0][2].equals("X")){
            System.out.println("Gano el jugador 1");
            JOptionPane.showMessageDialog(panelPrincipal,"Gano el jugador 1");
        }else if(k[0][0].equals("O")&& k[0][1].equals("O") &&  k[0][2].equals("O")){
            System.out.println("Gano el jugador 2");
            JOptionPane.showMessageDialog(panelPrincipal,"Gano el jugador 2");
        }else if(k[1][0].equals("X")&& k[1][1].equals("X") &&  k[1][2].equals("X")){
            System.out.println("Gano el jugador 1");
            JOptionPane.showMessageDialog(panelPrincipal,"Gano el jugador 1");
        }else if(k[1][0].equals("O")&& k[1][1].equals("O") &&  k[1][2].equals("O")){
            System.out.println("Gano el jugador 2");
            JOptionPane.showMessageDialog(panelPrincipal,"Gano el jugador 2");
        }else if(k[2][0].equals("X")&& k[2][1].equals("X") &&  k[2][2].equals("X")){
            System.out.println("Gano el jugador 1");
            JOptionPane.showMessageDialog(panelPrincipal,"Gano el jugador 1");
        }else if (k[2][0].equals("O")&& k[2][1].equals("O") &&  k[2][2].equals("O")) { //lineas horizontales
            System.out.println("Gano el jugador 2");
            JOptionPane.showMessageDialog(panelPrincipal,"Gano el jugador 2");
        }else if(k[0][0].equals("X")&& k[1][0].equals("X") &&  k[2][0].equals("X")){
            System.out.println("Gano el jugador 1");
            JOptionPane.showMessageDialog(panelPrincipal,"Gano el jugador 1");
        }else if(k[0][0].equals("O")&& k[1][0].equals("O") &&  k[2][0].equals("O")){
            System.out.println("Gano el jugafor 2");
            JOptionPane.showMessageDialog(panelPrincipal,"Gano el jugador 2");
        }else if (k[0][1].equals("X")&& k[1][1].equals("X") &&  k[2][1].equals("X")) {
            System.out.println("Gano el jugador 1");
            JOptionPane.showMessageDialog(panelPrincipal,"Gano el jugador 1");
        }else if (k[0][1].equals("O")&& k[1][1].equals("O") &&  k[2][1].equals("O")) {
            System.out.println("Gano el jugador 2");
            JOptionPane.showMessageDialog(panelPrincipal,"Gano el jugador 2");
        }else if(k[0][2].equals("X")&& k[1][2].equals("X") &&  k[2][2].equals("X")){
            System.out.println("Gano el jugador 1");
            JOptionPane.showMessageDialog(panelPrincipal,"Gano el jugador 1");
        }else if(k[0][2].equals("O")&& k[1][2].equals("O") &&  k[2][2].equals("O")){ //lineas verticales
            System.out.println("Gano el jugador 2");  
            JOptionPane.showMessageDialog(panelPrincipal,"Gano el jugador 2");
        }else if(k[0][0].equals("O")&& k[1][1].equals("O") &&  k[2][2].equals("O")){
            System.out.println("Gano el jugador 2");
            JOptionPane.showMessageDialog(panelPrincipal,"Gano el jugador 2");
        }else if(k[0][0].equals("X")&& k[1][1].equals("X") &&  k[2][2].equals("X")){
            System.out.println("Gano el jugador 1");
            JOptionPane.showMessageDialog(panelPrincipal,"Gano el jugador 1");
        }else if(k[0][2].equals("X")&& k[1][1].equals("X") &&  k[2][0].equals("X")){
            System.out.println("Gano el jugador 1");
            JOptionPane.showMessageDialog(panelPrincipal,"Gano el jugador 1");
        }else if(k[0][2].equals("O")&& k[1][1].equals("O") &&  k[2][0].equals("O")){
            System.out.println("Gano el jugador 2");
            JOptionPane.showMessageDialog(panelPrincipal,"Gano el jugador 2");
        }
    }
}
