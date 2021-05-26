/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import controlador.Grupo_controlador;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class Grupo_Vista {
    private Scanner teclado;
    private Grupo_controlador grupoControlador;
    public Grupo_Vista(){
        teclado= new Scanner(System.in);
        grupoControlador=new Grupo_controlador();
    }
    public void menu(){
        int op=0;
        do{
            System.out.println("\n Gestor de grupos");
            System.out.println("1.Crear");
            System.out.println("2.Buscar");
            System.out.println("3.Actualizar");
            System.out.println("4.Eliminar");
            System.out.println("5.Imprimir");
            op=teclado.nextInt();
            switch(op){
                
                
            }
                
            
        }while(op<6);
    }
    public void crear(){
        System.out.println("Ingrese los siguientes datos");
        System.out.println("Id:");
        long id=teclado.nextLong();
        System.out.println("Nombre:");
        String nombre=teclado.next();
        System.out.println("Asignatura:");
        String asignatura=teclado.next();
        System.out.println("Aula:");
        String aula=teclado.next();
        //boolean resultado=grupoControlador.crear(id, nombre, asignatura,);
                
    }
    
    
}
