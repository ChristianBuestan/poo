/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Persona;
import Modelo.Vehiculo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class ControladorVehiculo {
    private Vehiculo vehiculo;
    private List<Vehiculo> listaVehiculos;

    public ControladorVehiculo() {
        this.listaVehiculos = new ArrayList<>();
    }
    public long GenerarId(){
        if(listaVehiculos.size()>0)      
            return listaVehiculos.get(listaVehiculos.size()-1).getId()+1;
        else
            return 1;
    }
    public boolean crear(String placa,String modelo,String marca){
        Vehiculo vehiculo=new Vehiculo(this.GenerarId(), placa, modelo, marca);
        return listaVehiculos.add(vehiculo);
    }
    public boolean crear(String placa,String modelo,String marca,Persona persona){
        Vehiculo vehiculo=new Vehiculo(this.GenerarId(), placa, modelo, marca, persona);
        persona.getListadoVehiculos().add(vehiculo); //mirar el modelo
        return listaVehiculos.add(vehiculo); 
    }
    public Vehiculo buscar(String placa){
        for (Vehiculo vehiculo : listaVehiculos) {
            if (vehiculo.getPlaca().equals(placa)) {
                return vehiculo;
            }
        }
        return null;
    }
    public boolean actualizar(String placa,String modelo,String marca,Persona persona){
        Vehiculo vehiculo=this.buscar(placa);
        if (vehiculo!=null) {
            int posicion=listaVehiculos.indexOf(vehiculo);
            vehiculo.setCliente(persona);
            vehiculo.setMarca(marca);
            vehiculo.setModelo(modelo);
            vehiculo.setPlaca(placa);
            listaVehiculos.set(posicion, vehiculo);
            return true;
        }
        return false;
    }
    public boolean eliminar(String placa){
        Vehiculo vehiculo=this.buscar(placa);
        if (vehiculo!=null) {
            vehiculo.getCliente().getListadoVehiculos().remove(vehiculo);
            listaVehiculos.remove(vehiculo);
            return true;
        }
        return false;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }
    
}
