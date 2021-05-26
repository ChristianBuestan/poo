package buestancm;

import java.util.Scanner;


public class BuestanCM {
    public static void main(String[] args) {
        Scanner n=new Scanner(System.in);
        Procesos b=new Procesos();
        b.IngresarValores();
        System.out.println("MENU");
        System.out.print("Escoja el algoritmo de ordenamiento \n 1 para el metodo de seleccion \n 2 para el metodo de inserccion \n");
        System.out.print("Usted escoge la opcion:");
        int op=n.nextInt();
        if(op==1){
            b.Seleccion();
        }else if(op==2){
            b.inserccion();
        }else
            System.out.println("NUMERO DE OPCION NO ACEPTADA");
        
    }
    
}
