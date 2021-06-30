/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introducciongui;

import Graficas.Ventana;
import eventos.VentanaRaton;

/**
 *
 * @author Cristian
 */
public class IntroduccionGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VistaInicial vistainicio=new VistaInicial();
        //vistainicio.setVisible(true); //MUESTRE LA VENTANA
        //Ventana ventana=new Ventana();
        VentanaRaton ventana=new VentanaRaton();
        ventana.setVisible(true);
    }
    
}
