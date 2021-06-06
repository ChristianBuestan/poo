/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.FacturaControlador;
import Controladores.ProductoControlador;
import Modelo.Producto;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class ProductoVista {
    private ProductoControlador productoControlador;
    private Scanner teclado;
    public ProductoVista(ProductoControlador productoControlador){
        this.productoControlador=productoControlador;
        teclado=new Scanner(System.in);
    }
    public void menu(){
        int opcion=0;
        do {    
            System.out.println(" Gestion de productos \n 1.crear \n 2.buscar \n 3.actualizar \n 4.eliminar \n 5.listar \n 6.salir");
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
        System.out.println("descripcion del producto");
        String descripcion=teclado.next();
        System.out.println("stock");
        int stock=teclado.nextInt();
        System.out.println("precio unitario del producto");
        double precio_unitario=teclado.nextDouble();
        System.out.println("De poseerlo,ingrese el iva, de lo contrario solo ingrese 0");
        double iva=teclado.nextDouble();
        System.out.println("Creado "+productoControlador.crear(descripcion, precio_unitario, stock, iva));
    }
    public Producto buscar(){
        System.out.println("ingrese la descripcion a buscar");
        String descripcion=teclado.next();
        System.out.println(productoControlador.buscar(descripcion));
        return productoControlador.getSeleccionado();
    }
    public void Actualizar(){
        System.out.println("Ingrese \ndescripcion anterior");
        String descripcion=teclado.next();
        System.out.println("ingrese la descripcion nueva");
        String descripcionNueva=teclado.next();
        System.out.println("stock nuevo");
        int stock=teclado.nextInt();
        System.out.println("precio unitario nuevo");
        double precio_unitario=teclado.nextDouble();
        System.out.println("Iva nuevo");
        double iva=teclado.nextDouble();
        System.out.println("Actualizado"+productoControlador.Actualizar(descripcion, descripcionNueva,precio_unitario, stock, iva));
    }
    public void eliminar(){
        System.out.println("ingrese la descripcion del producto a elminar");
        String descripcion=teclado.next();
        boolean resultado=productoControlador.eliminar(descripcion);
        System.out.println("eliminado "+resultado);
    }
    public void listar(){
        productoControlador.listar();
    }

}
