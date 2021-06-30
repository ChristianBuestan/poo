/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventos;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Cristian
 */
public class Mouse extends JPanel 
        implements  MouseListener, MouseMotionListener{  //implementa el escuchar el raton
    public FiguraRaton figuraRaton;
    public Random rnd =new Random(); //color randomico
    public Mouse(){
        setBounds(0, 0, 500, 500);
        figuraRaton=new FiguraRaton(0, 0, 10, 10);
    }
    @Override
    public void paint(Graphics lienzo){
        lienzo.clearRect(0, 0, 500, 500); // limpio todo el espacio de trabajo lo dinujo
        lienzo.setColor(Color.black);
        //lienzo.setColor(generadorColorAleatorio());
        lienzo.drawLine(100, 100, 300, 100); //1
        lienzo.drawLine(150, 100, 150, 120); //2
        lienzo.drawLine(150, 120, 270, 120);//3
        lienzo.drawLine(180, 120, 180, 175);//4
        lienzo.drawLine(180, 150, 230, 150);//11
        lienzo.drawLine(150, 140, 150, 200);//5
        lienzo.drawLine(110, 140, 150, 140);//6
        lienzo.drawLine(100, 200, 300, 200);//7
        lienzo.drawLine(250, 140, 250, 200); //8
        lienzo.drawLine(250, 170, 290,170 ); //9
        lienzo.drawLine(270, 120, 270, 150); //10
        lienzo.drawString("Inicio", 50, 150);
        lienzo.drawString("Final", 310, 150);
        lienzo.fillOval(figuraRaton.getX(), figuraRaton.getY(), figuraRaton.getAncho(), figuraRaton.getAlto());
        
    }
    /*public Color generadorColorAleatorio(){
        float r=rnd.nextFloat();  //red
        float g=rnd.nextFloat();  //green
        float b=rnd.nextFloat();  //blue
        Color colorrnd=new Color(r, g, b);
        return  colorrnd;
    }*/
    @Override
    public void mouseClicked(MouseEvent me) {
        /* para obtener coordenadas
        String mensaje="Click en X: "+me.getX()+"Click en Y: "+me.getY();
        JOptionPane.showMessageDialog(this, mensaje);*/
        figuraRaton.setX(me.getX());
        figuraRaton.setY(me.getY());
        this.repaint();
    }
    
    //mouse listener al clickeo y presion
    @Override
    public void mousePressed(MouseEvent me) {
    }

    @Override
    public void mouseReleased(MouseEvent me) {
    }

    @Override //cuando sale o entr  mi panel
    public void mouseEntered(MouseEvent me) {
    }

    @Override
    public void mouseExited(MouseEvent me) {
    }

    //mouse motion listener al movimiento del raton
    @Override
    public void mouseDragged(MouseEvent me) {
    }

    @Override
    public void mouseMoved(MouseEvent me) {
        figuraRaton.setX(me.getX());
        figuraRaton.setY(me.getY());
        if(me.getY()==100 && (me.getX()<=300 && me.getX()>=100)){ //1
            JOptionPane.showMessageDialog(this, "FALLO");
        }else if(me.getX()==150 && me.getY()>=100 && me.getY()<=120){//2
            JOptionPane.showMessageDialog(this, "FALLO");
        }else if(me.getY()==120 && me.getX()>=150 && me.getX()<=270){//3
            JOptionPane.showMessageDialog(this, "FALLO");
        }else if(me.getX()==180 && me.getY()>=120 && me.getY()<=175){//4
            JOptionPane.showMessageDialog(this, "FALLO");
        }else if(me.getX()==150 && me.getY()>=140 && me.getY()<=200){//5
            JOptionPane.showMessageDialog(this, "FALLO");
        }else if(me.getY()==140 && me.getX()>=110 && me.getX()<=150){//6
            JOptionPane.showMessageDialog(this, "FALLO");
        }else if(me.getY()==200 && me.getX()>=100 && me.getX()<=300){//7
            JOptionPane.showMessageDialog(this, "FALLO");
        }else if(me.getX()==250 && me.getY()>=140 && me.getY()<=200){//8
            JOptionPane.showMessageDialog(this, "FALLO");
        }else if(me.getY()==170 && me.getX()>=250 && me.getX()<=290){//9
            JOptionPane.showMessageDialog(this, "FALLO");
        }else if(me.getX()==270 && me.getY()>=120 && me.getY()<=150){//10
            JOptionPane.showMessageDialog(this, "FALLO");
        }else if(me.getY()==150 && me.getX()>=180 && me.getX()<=230){//11
            JOptionPane.showMessageDialog(this, "FALLO");
        }else if (me.getX()==300){
            JOptionPane.showMessageDialog(this, "Ganaste");
        }
        this.repaint();
    }
}
