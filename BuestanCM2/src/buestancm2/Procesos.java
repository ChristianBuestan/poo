/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buestancm2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Procesos {
    ArrayList lista=new ArrayList();
    public void menu(){
        Scanner a=new Scanner(System.in);
        System.out.println("METODO DE BUSQUEDA BINARIA");
        System.out.print("Ingrese el tamaño de su vector: ");
        int tamanio=a.nextInt();
        
        for(int i=0;i<tamanio;i++){
            System.out.print("Ingrese su valor en la posicion ["+i+"]:");
            int val=a.nextInt();
            lista.add(val);
        }
    }
    public void procesos(){
        Scanner a=new Scanner(System.in);
        for(int i=0;i<lista.size()-1;i++){
            for(int j=i+1;j<lista.size();j++){
                int primero=(int) lista.get(i);
                int segundo=(int) lista.get(j);
                if(primero>segundo){
                    int aux=primero;
                    lista.set(i, segundo);
                    lista.set(j, aux);
                    
                }
            }
        }
        System.out.print("Ingrese el numero que desea buscar:");
        int numero=a.nextInt();
        boolean enc=false;
        int m=0; //base
        int n=(int) lista.size()-1; //altura
        int centro=n;
        while(enc!=true){
            for(int i=m;i<=n;i++){
                int dato=(int) lista.get(i);
                System.out.print("|"+dato+"|");
            }
            System.out.println("");
            centro=(int)(m+n)/2;
            int valCentro=(int)lista.get(centro);
            if(numero<(int)lista.get(m)|| numero>(int)lista.get(n)){
                enc=true;
                break;
            }
            if(n==centro+1){
                if(numero<valCentro && numero>(int)lista.get(centro-1)){
                    enc=true;
                }else if(numero<valCentro && numero>(int)lista.get(centro+1)){
                    enc=true;
                }
            }
            if(numero>valCentro){
                System.out.println("Base="+m+" Altura="+n+" Centro="+centro+" ValorCentro="+valCentro+" NumeroBuscado="+numero+" -> DERECHA");
                m=centro+1;
                n=n;
            }else if(numero<valCentro){
                System.out.println("Base="+m+" Altura="+n+" Centro="+centro+" ValorCentro="+valCentro+" NumeroBuscado="+numero+" -> IZQUIERDA");
                n=centro-1;
                m=m;
            }else if(valCentro==numero){
                System.out.println("Base="+m+" Altura="+n+" Centro="+centro+" ValorCentro="+valCentro+" -> ENCONTRADO");
                break;
            }
        }
        if(enc==true){
            System.out.println("Numero no existe en el arreglo");
        }
    }    
}
