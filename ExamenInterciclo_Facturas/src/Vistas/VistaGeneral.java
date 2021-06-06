/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.ClienteControlador;
import Controladores.FacturaControlador;
import Controladores.ProductoControlador;
import Modelo.Cliente;
import Modelo.Producto;
import java.util.Scanner;
import org.w3c.dom.CDATASection;

/**
 *
 * @author Cristian
 */
public class VistaGeneral {
    private Scanner teclado;
    private FacturaVista facturaVista;
    private FacturaControlador facturaControlador;
    private ClienteVista clienteVista;
    private ClienteControlador clienteControlador;
    private ProductoVista productoVista;
    private ProductoControlador productoControlador;
    public VistaGeneral(){
        teclado=new Scanner(System.in);
        //facturaControlador=new FacturaControlador();
        clienteControlador=new ClienteControlador();
        productoControlador= new ProductoControlador();
        productoVista=new ProductoVista(productoControlador);
        clienteVista=new ClienteVista(clienteControlador);
        facturaVista=new FacturaVista(clienteControlador, productoControlador);
    }
    public void menu() {
        int opcion = 0;
        do {
            System.out.println("Gestión de Registros");
            System.out.println(" 1.productos \n 2.cliente \n 3.Factura \n 4.Salir");
            opcion = teclado.nextInt();
            switch(opcion){
                case 1: productoVista.menu(); break;
                case 2: clienteVista.menu(); break;
                case 3: facturaVista.menu();break;
            }
        } while (opcion < 4);
    }
    //aqui iba el factura
    
}
