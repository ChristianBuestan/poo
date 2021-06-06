/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class Factura {
    private long id;
    private Date fecha;
    private double total;
    private int cantidad;
    private int valor;
    private List<Producto> listaproducto;
    private Cliente cliente;

    public Factura(long id, Date fecha, double total, int cantidad,int valor) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.cantidad = cantidad;
        this.valor=valor;
    }

    public Factura(long id, Date fecha, double total, int cantidad,int valor, Cliente cliente) {
        this.id = id;
        this.fecha = fecha;
        this.total = total;
        this.cantidad = cantidad;
        this.listaproducto = listaproducto;
        this.cliente = cliente;
        this.valor=valor;
    }

    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public List<Producto> getListaproducto() {
        return listaproducto;
    }

    public void setListaproducto(List<Producto> listaproducto) {
        this.listaproducto = listaproducto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public void borrado(){
        //metodo que no recibe ni devuelve nada
    }

    @Override
    public String toString() {
        return "Factura{" + "id=" + id + ", fecha=" + fecha + ", total=" + total + ", cantidad=" + cantidad + ", valor="+valor+", cliente="+cliente+ '}';//lista de productos /n"+ listaproducto+'}';
    }

    
    
            
}
