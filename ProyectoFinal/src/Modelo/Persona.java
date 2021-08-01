/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class Persona implements Serializable{
    private String Nombre;
    private String Cedula;
    private long id;
    private List<Vehiculo> listadoVehiculos;

    public Persona(String Nombre, String Cedula, long id) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.id = id;
        this.listadoVehiculos=new ArrayList<>();
    }

    public Persona(String Nombre, String Cedula, int id, List<Vehiculo> listadoVehiculos) {
        this.Nombre = Nombre;
        this.Cedula = Cedula;
        this.id = id;
        this.listadoVehiculos = listadoVehiculos;
    }
    

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Vehiculo> getListadoVehiculos() {
        return listadoVehiculos;
    }

    public void setListadoVehiculos(List<Vehiculo> listadoVehiculos) {
        this.listadoVehiculos = listadoVehiculos;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Cedula=" + Cedula + ", id=" + id + ", listadoVehiculos=" + listadoVehiculos + '}';
    }
    
}
