/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class Vehiculo implements Serializable{
    private long id;
    private String placa;
    private String modelo;
    private String marca;
    private List<Registro> registros;
    private Persona cliente;
    
    public Vehiculo(long id, String placa, String modelo, String marca) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
    }

    
    public Vehiculo(long id, String placa, String modelo, String marca, Persona cliente) {
        this.id = id;
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.registros = new ArrayList<>();
        this.cliente = cliente;
    }
    

    public List<Registro> getRegistros() {
        return registros;
    }

    public void setRegistros(List<Registro> registros) {
        this.registros = registros;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "id=" + id + ", placa=" + placa + ", modelo=" + modelo + ", marca=" + marca + ", cliente=" + cliente + '}';
    }
    
}
