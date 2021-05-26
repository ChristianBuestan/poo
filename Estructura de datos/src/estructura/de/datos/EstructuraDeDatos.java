/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura.de.datos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class EstructuraDeDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList p=new ArrayList();
        Scanner a=new Scanner(System.in);
        System.out.println("ingrese el numero de valores a introducir");
        int c=a.nextInt();
        for(int i=0;i<c;i++){
            System.out.print("ingrese el valor: ");
            int cad=a.nextInt();
            p.add(cad);
        }
        System.out.println(p);
        System.out.print("Cual valor desea buscar:");
        int valor= a.nextInt();
        boolean encontrado=false;
        for(int j=0; j<p.size() ;j++){
            int dato=(int) p.get(j);
            System.out.print(dato+"=="+valor+"");
            if(dato==valor){
                System.out.println(" Si");
                encontrado=true;
                break;
            }else
                System.out.println(" No");
        }
        if(encontrado){
            System.out.println("EL DATO FUE ENCONTRADO");
        }else
            System.out.println("EL DATO NO FUE ENCONTRADO");
        
        
    }
    
}
