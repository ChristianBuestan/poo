/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Cliente;
import Modelo.Factura;
import Modelo.Producto;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class FacturaControlador {
    private List<Factura> listafacturas;
    private Factura seleccionado;
    public FacturaControlador(){
        listafacturas=new ArrayList<>();
    }
    public long generarId(){
        return (listafacturas.size() >0)? listafacturas.get(listafacturas.size() - 1).getId() + 1 : 1;
    }
    public boolean crear(Date fecha,int valor,double total,int cantidad){
        Factura factura=new Factura(this.generarId(),fecha, total,valor,cantidad);
        return listafacturas.add(factura);
    }
    public boolean crear(Date fecha,int valor,double total,int cantidad,Cliente cliente){
        Factura factura=new Factura(this.generarId(),fecha, total,valor,cantidad,cliente);
        return listafacturas.add(factura);
    }
    
    public Factura buscar(Date fecha){
        for (Factura factura : listafacturas) {
            if(factura.getFecha().equals(fecha)){
                seleccionado=factura;
                return factura;
            }
        }
        return null;
    }
    public boolean Actualizar( Date fecha, int cantidad , int valor){
        Factura factura=this.buscar(fecha);
        if(factura!=null){
            int posicion=listafacturas.indexOf(factura);
            factura.setFecha(fecha);
            factura.setCantidad(cantidad);
            factura.setValor(valor);
            listafacturas.set(posicion, factura);
            return true;
        }
        return false;
    }
    
    public boolean eliminar(Date fecha){
        Factura factura=this.buscar(fecha);
        return listafacturas.remove(factura);
    }

    public List<Factura> getListafacturas() {
        return listafacturas;
    }

    public void setListafacturas(List<Factura> listafacturas) {
        this.listafacturas = listafacturas;
    }

    public Factura getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Factura seleccionado) {
        this.seleccionado = seleccionado;
    }        
}
