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
        //lienzo.setColor(Color.blue);
        lienzo.setColor(generadorColorAleatorio());
        lienzo.fillOval(figuraRaton.getX(), figuraRaton.getY(), figuraRaton.getAncho(), figuraRaton.getAlto());
        
        
    }
    public Color generadorColorAleatorio(){
        float r=rnd.nextFloat();  //red
        float g=rnd.nextFloat();  //green
        float b=rnd.nextFloat();  //blue
        Color colorrnd=new Color(r, g, b);
        return  colorrnd;
    }
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
        this.repaint();
    }
}
