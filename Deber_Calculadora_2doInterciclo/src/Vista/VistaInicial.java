/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Cristian
 */
public class VistaInicial extends JFrame{
    private JPanel panelPrincipal;
    private JTextField cuadroTexto;
    private String valorT;
    private double val;
    private double resultado;
    private double val1;
    private double val2;
    private String llave;
    public VistaInicial(){
        super();
        setTitle("Calculadora");
        setBounds(0, 0, 600, 600);
        valorT="";
        llave="";
        cuadroTexto=new JTextField(valorT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.initcomponentesGrindLayout();
        setContentPane(panelPrincipal);
    }
    public void initcomponentesGrindLayout(){ //matriz de botones.
        this.panelPrincipal=new JPanel();
        GridLayout tablaPlantilla=new GridLayout(4,6);
        cuadroTexto=new JTextField();
        cuadroTexto.setBounds(0,0,50,50);
        panelPrincipal.setLayout(tablaPlantilla);
        panelPrincipal.add(cuadroTexto);
        int contador=0;
        for(int i=1;i<tablaPlantilla.getRows();i++){
            for(int j=0;j<tablaPlantilla.getColumns();j++){
                String texto=""+contador; //numeros
                switch (contador) {
                    case 10:
                        texto="-";
                        break;
                    case 11:
                        texto="+";
                        break;
                    case 12:
                        texto="=";
                        break;
                    case 13:
                        texto="*";
                        break;
                    case 14:
                        texto="/";
                        break;
                    case 15:
                        texto=",";
                        break;
                    case 16:
                        texto="c";
                        break;
                    case 17:
                        texto="";
                        break;
                    case 18:
                        texto="";
                        break;
                    case 19:
                        texto="";
                        break;
                }
                JButton boton=new JButton(texto);
                boton.addActionListener(new ActionListener() { //evento que escucha cuando presiono el boton
                    @Override
                    public void actionPerformed(ActionEvent ae){
                        JButton btn=(JButton)ae.getSource();
                        String valor=btn.getText();
                        if("+".equals(valor)){ 
                            llave="+";
                            val1=val;
                            valorT="";
                        }else if("-".equals(valor)){
                            llave="-";
                            val1=val;
                            valorT="";
                        }else if("*".equals(valor)){
                            llave="*";
                            val1=val;
                            valorT="";
                        }else if("/".equals(valor)){
                            llave="/";
                            val1=val;
                            valorT="";
                        }else if("=".equals(valor)){
                            llave="";
                            if(resultado==0){
                                valorT=valor;
                            }else
                                valorT=Double.toString(resultado);
                        }else if("c".equals(valor)){
                            llave="";
                            resultado=0;  
                            val=0;
                            valor="0";
                            valorT="0";
                        }else if(",".equals(valor)){
                            llave="";
                            valorT=valorT+",";
                            val=Double.parseDouble(valorT);
                        }else{
                            valorT=valorT+valor;
                            val=Double.parseDouble(valorT); //aux val
                        }
                        switch(llave){
                            case "+":
                                val2=val;
                                resultado=(double)val1+val2;
                                valorT=valor;
                                break;
                            case "-":
                                val2=val;
                                resultado=val1-val2;
                                valorT=valor;
                                break;
                            case "*":
                                val2=val;
                                resultado=val1*val2;
                                valorT=valor;
                                break;
                            case "/":
                                val2=val;
                                resultado=val1/val2;
                                valorT=valor;
                                break;
                        }
                        
                        panelPrincipal.add(cuadroTexto,BorderLayout.NORTH);
                        cuadroTexto.setText(valorT);
                    }
                });
                panelPrincipal.add(boton);
                contador++;
            }
        }
    }
}
