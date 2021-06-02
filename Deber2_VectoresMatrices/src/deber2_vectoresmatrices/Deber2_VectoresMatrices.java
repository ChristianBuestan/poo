/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber2_vectoresmatrices;

import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Deber2_VectoresMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("<<<<<1.CREAR UN VECTOR Y POSTERIORMENTE ORDENARLO DE MAYOR A MENOR>>>>.");
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese la longitud de su vector");
        int tamanio=teclado.nextInt(); 
        int vector[]=new int[tamanio];
        for(int i=0;i<vector.length;i++){
            System.out.print("Ingrese el numero en la posicion ["+i+"]:");
            vector[i]=teclado.nextInt();
        }
        System.out.println("vuestro vector es");
        for(int i=0;i<vector.length;i++){
            
            System.out.print(vector[i]+"\t");
        }
        System.out.println("");
        for (int i=0;i<vector.length;i++){
            for(int j=i+1;j<vector.length;j++){
                if(vector[i]<vector[j]){
                    int auxiliar=vector[i];
                    vector[i]=vector[j];
                    vector[j]=auxiliar;
                }
            }
        }
        System.out.println("Su vector ordenado de mayor a menor es");
        for(int i=0;i<vector.length;i++){
            System.out.print(vector[i]+"\t");
        }
        ///Problematica 2 Crear un codigo que cree la transpuesta de una matriz
        System.out.println("");
        
        System.out.println("<<<<<2.SACAR LA TRANSPUESTA DE UNA MATRIZ>>>>..");
        //Scanner teclado2= new Scanner(System.in);
        System.out.println("Ingrese el numero de filas");
        int filas=teclado.nextInt();
        System.out.println("Ingrese el numero de columnas");
        int columnas=teclado.nextInt();
        double matriz[][]=new double[filas][columnas];
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                matriz[i][j]=Math.random()*100;
            }
        }
        System.out.println("Su Matriz:");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("");
        }
        double traspuesta[][]=new double[filas][columnas];
        for(int i=0;i<matriz.length;i++){
            int b=0; //conttador que ayuda a intercambiar columnas con filas
            for(int j=0;j<matriz[i].length;j++){
                traspuesta[b][i]=matriz[i][j];
                b++;
            }
        }
        System.out.println("La transpuesta de vuestra matriz es:");
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(traspuesta[i][j]+"\t");
            }
            System.out.println("");
        }
    }
}
