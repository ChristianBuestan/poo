/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Cristian
 */
public class Producto {
    private long id;
    private String descripcion;
    private double precio_unitario;
    private int stock;
    private double iva;

    public Producto(long id, String descripcion, double precio_unitario, int stock, double iva) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio_unitario = precio_unitario;
        this.stock = stock;
        this.iva =iva;
    }
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }
    

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", descripcion=" + descripcion + ", precio_unitario=" + precio_unitario + ", stock=" + stock + ", iva=" + iva + '}';
    }
    
}
