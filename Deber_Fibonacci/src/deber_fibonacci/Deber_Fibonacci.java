/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber_fibonacci;

/**
 *
 * @author Cristian
 */
public class Deber_Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //serie fibonacci con while
        System.out.println("Serie fibonacci con While");
        int contador=0;
        int cantidad=9; 
        int salva=0;
        int numero1=0;
        int numero2=1; 
        System.out.println(numero1);
        while(contador<=cantidad-2){
            
            System.out.println(numero2);
            salva=numero2;
            numero2=numero1+numero2;
            numero1=salva;
            contador++;
        }
        
        System.out.println("Serie fibonacci con Do-while");
        int cont=0;
        int cant=12;
        int save=0;
        int a=0;
        int b=1;  
        System.out.println(a);
        System.out.println(b);
        do{
            
            save=b;
            b=a+b;
            a=save;
            cont++;
            System.out.println(b);
        }while(cont<cant-2);
        
        System.out.println("Serie fibonacci con For");
        int num1=0;
        int num2=1;
        int auxiliar=0;
        System.out.println(num1);
        System.out.println(num2);
        for(int contador2=1;contador2<=9;contador2++){
            auxiliar=num2;
            num2=num1+num2;
            num1=auxiliar;
            System.out.println(num2);       
        }
    }
}
