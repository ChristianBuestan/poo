/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.ClienteControlador;
import Modelo.Cliente;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class ClienteVista {
    private ClienteControlador clienteControlador;
    private Scanner teclado;
    public ClienteVista(ClienteControlador clienteControlador){
        this.clienteControlador=clienteControlador;
        teclado=new Scanner(System.in);
    }
    public void menu(){
        int opcion=0;
        do {    
            System.out.println(" Gestion de clientes \n 1.crear \n 2.buscar \n 3.actualizar \n 4.eliminar \n 5.listar \n 6.salir");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1: this.crear();break;
                case 2: this.buscar();break;
                case 3: this.Actualizar();break;
                case 4: this.eliminar();break;
                case 5: this.listar();break;
                case 6: break;
            }
            
        } while (opcion<6);
    }
    public void crear(){
        System.out.println("Ingrese los datos");
        System.out.println("nombre del cliente");
        String nombre=teclado.next();
        System.out.println("entero de fiabilidad de pago");
        int fiabilidad_pago=teclado.nextInt();
        System.out.println("cedula");
        String cedula=teclado.next();
        System.out.println("Creado= "+clienteControlador.crear(nombre, cedula, fiabilidad_pago));
    }
    public Cliente buscar(){
        System.out.println("ingres el nombre a buscar");
        String nombre=teclado.next();
        return clienteControlador.buscar(nombre);
    }
    public void Actualizar(){
        System.out.println("Ingrese los datos");
        System.out.println("nombre a actualizar");
        String nombre=teclado.next();
        System.out.println("nombre nuevo del cliente");
        String nombreNuevo=teclado.next();
        System.out.println("entero de fiabilidad de pago");
        int fiabilidad_pago=teclado.nextInt();
        System.out.println("cedula");
        String cedula=teclado.next();
        System.out.println("Actualizado"+clienteControlador.Actualizar(nombre,nombreNuevo, cedula, fiabilidad_pago));
        
    }
    public void eliminar(){
        System.out.println("ingrese la descripcion del producto a elminar");
        String nombre=teclado.next();
        boolean resultado=clienteControlador.eliminar(nombre);
        System.out.println("eliminado "+resultado);
        }
    public void listar(){
        for (Cliente cliente : clienteControlador.getListaclientes()) {
            System.out.println(cliente);
        }
    }
}
