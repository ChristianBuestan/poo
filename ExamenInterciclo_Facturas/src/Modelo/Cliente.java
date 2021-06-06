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
public class Cliente {
    private long id;
    private String nombre;
    private String cedula;
    private int fiabilidad_pago;

    public Cliente(long id, String nombre, String cedula, int fiabilidad_pago) {
        this.id = id;
        this.nombre = nombre;
        this.cedula = cedula;
        this.fiabilidad_pago = fiabilidad_pago;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getFiabilidad_pago() {
        return fiabilidad_pago;
    }

    public void setFiabilidad_pago(int fiabilidad_pago) {
        this.fiabilidad_pago = fiabilidad_pago;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", nombre=" + nombre + ", cedula=" + cedula + ", fiabilidad_pago=" + fiabilidad_pago + '}';
    }
    
}
