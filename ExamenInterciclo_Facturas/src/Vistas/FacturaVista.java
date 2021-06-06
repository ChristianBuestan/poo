/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.ClienteControlador;
import Controladores.FacturaControlador;
import Controladores.ProductoControlador;
import Modelo.Factura;
import Modelo.Producto;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 *
 * @author Cristian
 */
public class FacturaVista {
    private FacturaControlador facturaControlador;
    private Scanner teclado;
    private ClienteControlador clienteControlador;
    private ProductoControlador productoControlador;
    public DateFormat formatoFecha;
    public FacturaVista(ClienteControlador clienteControlador,ProductoControlador productoControlador){
        teclado=new Scanner(System.in);
        this.facturaControlador= new FacturaControlador();
        this.clienteControlador=clienteControlador;
        this.productoControlador=productoControlador;
        formatoFecha = new SimpleDateFormat("dd/mm/yyyy");
    }
    public void menu(){
        int opcion=0;
        do {    
            System.out.println("\nGestion de facturas \n 1.crear \n 2.buscar \n 3.actualizar \n 4.eliminar \n 5.listar \n 6.salir");
            opcion=teclado.nextInt();
            switch(opcion){
                case 1: this.crear();break;
                case 2: this.buscar();break;
                case 3: this.actualizar();break;
                case 4: this.eliminar();break;
                case 5: this.listar();break;
                case 6:break;
            }
        } while (opcion<6);
    }
    public void crear(){
        System.out.println("<<Ingrese el nombre cliente que desea gestionar>>");
        String cliente=teclado.next();
        System.out.println("\nCliente"+clienteControlador.buscar(cliente));
        System.out.println("Ingrese la cantidad de facturas a trabajar");
        int cantidad=teclado.nextInt();
        System.out.println("Ingrese el valor de la factura en enteros");
        int valor=teclado.nextInt();
        System.out.println("Ingrese la fecha(dd/mm/yyyy):");
        String fecha=teclado.next();
        double total=this.total();
        try {
            System.out.println("resultado: "+facturaControlador.crear(formatoFecha.parse(fecha), valor, total, cantidad,clienteControlador.buscar(cliente)));//le anaido clietne
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void actualizar(){
        System.out.println("Ingrese la cantidad de facturas a trabajar");
        int cantidad=teclado.nextInt();
        System.out.println("Ingrese el valor de la factura en enteros");
        int valor=teclado.nextInt();
        System.out.println("Igrese la fecha(dd/mm/yyyy):");
        String fecha=teclado.next();
        try {
            System.out.println("resultado: "+facturaControlador.Actualizar(formatoFecha.parse(fecha), cantidad,valor));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public Factura buscar(){
        System.out.println("Ingrese la fecha (dd/mm/yyyy) de la factura a buscar: ");
        String fecha=teclado.next();
        try {
            return facturaControlador.buscar(formatoFecha.parse(fecha));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }
    public void eliminar(){
        this.buscar();
        System.out.println("Eliminado: "+facturaControlador.eliminar(facturaControlador.getSeleccionado().getFecha()));
    }
    public void listar(){
        for (Factura factura : facturaControlador.getListafacturas()) {
            System.out.println(factura);
            System.out.println("lista de productos");
            productoControlador.listar();
            
        }
    }
    public double total(){
        double total=0;
        double total2=0;
        for (Producto producto : productoControlador.getListaproductos()) {
            total2=total2+total;
            double val1=producto.getPrecio_unitario();
            double iva=producto.getIva();
            total=val1+(val1*iva);
            total=total*producto.getStock();
        }
        return total2;
    }

    public FacturaControlador getFacturaControlador() {
        return facturaControlador;
    }

    public void setFacturaControlador(FacturaControlador facturaControlador) {
        this.facturaControlador = facturaControlador;
    }
   
}
