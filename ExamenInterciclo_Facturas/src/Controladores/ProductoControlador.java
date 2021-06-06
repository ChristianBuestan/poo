/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Factura;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class ProductoControlador {
    private List<Producto> listaproductos;
    private Producto seleccionado;
    private Factura factura;
    public ProductoControlador(){
        this.listaproductos=new ArrayList<>();
        seleccionado=null;
    }
    public long generarId(){
        return (listaproductos.size() >0)? listaproductos.get(listaproductos.size() - 1).getId() + 1 : 1;
    }
    public boolean crear(String descripcion, double precio_unitario, int stock, double iva){
        Producto producto=new Producto(this.generarId(), descripcion, precio_unitario, stock, iva);
        return listaproductos.add(producto);
    }
    public Producto buscar(String descripcion){
        for (Producto producto : listaproductos) {
            if(producto.getDescripcion().equals(descripcion)){
                seleccionado=producto;
                return producto;
            }
        }
        return null;
    }
    public boolean Actualizar(String descripcion,String descripcionNueva, double precio_unitario, int stock, double iva){
        Producto producto=buscar(descripcion);
        if(producto!=null){
            int posicion=listaproductos.indexOf(producto);
            producto.setDescripcion(descripcionNueva);
            producto.setIva(iva);
            producto.setStock(stock);
            producto.setPrecio_unitario(precio_unitario);
            listaproductos.set(posicion, producto);
            return true;
        }
        return false;
    }
    public boolean eliminar(String descripcion){
        Producto producto=this.buscar(descripcion);
        return listaproductos.remove(producto);
    }
    public void listar(){
        for (Producto producto : listaproductos) {
            System.out.println(producto);
        }
    }

    public List<Producto> getListaproductos() {
        return listaproductos;
    }

    public void setListaproductos(List<Producto> listaproductos) {
        this.listaproductos = listaproductos;
    }

    public Producto getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Producto seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
