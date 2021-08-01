/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class Registro  implements  Serializable{
    private long id;
    private Date fechaEntrada;
    private Date fechaSalida;
    private double costo;
    private Vehiculo vehiculo;

    public Registro(long id,Date fechaEntrada, Date fechaSalida, double costo, Vehiculo vehiculo) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.costo = costo;
        this.vehiculo = vehiculo;
        this.id=id;
    }

    public Registro(long id,Date fechaEntrada, Date fechaSalida, double costo) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.costo = costo;
        this.id=id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Registro{" + "fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + ", costo=" + costo + ", vehiculo=" + vehiculo + '}';
    }
    
}
