/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_1;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Deber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Ejerscicio <1>Crear un programa que permita determinar el grupo al que pertenece en base a la edad");
        Scanner teclado=new Scanner(System.in);
        int a=teclado.nextInt();
        System.out.println(a);
        if (a<=2 && a>0){
            System.out.println("Pertenece a los bebes");
        }else if(a<=12 && a>2){
            System.out.println("Pertenece a los ninos");
        }else if(a<=18 && a>12){
            System.out.println("Pertenece a los jovenes");
        }else if(a<=64 && a>18){
            System.out.println("Pertenece a los adultos");
        }else{
            System.out.println("Pertenece a los adultos mayores");
        }
        
        System.out.println("Ejercicio <2>Crear un programa que determine el mes segun su numero"); 
        int b=teclado.nextInt();
        System.out.println(b);
        switch(b){
            case 1: System.out.println("ENERO");
            break;
            case 2: System.out.println("FEBRERO");
            break;
            case 3: System.out.println("MARZO");
            break;
            case 4: System.out.println("ABRIL");
            break;
            case 5: System.out.println("MAYO");
            break;
            case 6: System.out.println("JUNIO");
            break;
            case 7: System.out.println("JULIO");
            break;
            case 8: System.out.println("AGOSTO");
            break;
            case 9: System.out.println("SEPTIEMBRE");
            break;
            case 10: System.out.println("OCTUBRE");
            break;
            case 11: System.out.println("NOVIEMBRE");
            break;
            case 12: System.out.println("DICIEMBRE");
            break;
            default: System.out.println("NUMERO NO ACEPTADO");
            break;   
        } 
    }
    
}
