/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Factura;
import Modelo.Cliente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class ClienteControlador {
    private List<Cliente> listaclientes;
    private Cliente seleccionado;
    public ClienteControlador(){
        listaclientes=new ArrayList<>(); //this.
        seleccionado=null;
    }
    public long generarId(){
        return (listaclientes.size() >0)? listaclientes.get(listaclientes.size() - 1).getId() + 1 : 1;
    }
    public boolean crear(String nombre, String cedula, int fiabilidad_pago){
        Cliente cliente=new Cliente(this.generarId(),nombre, cedula, fiabilidad_pago);
        return listaclientes.add(cliente);
    }
    public Cliente buscar(String nombre){
        for (Cliente cliente : listaclientes) {
            if(cliente.getNombre().equals(nombre)){
                seleccionado=cliente;
                return cliente;
            }
        }
        return null;
    }
    public boolean Actualizar(String nombre,String nombreNuevo, String cedula, int fiabilidad_pago ){
        Cliente cliente=this.buscar(nombre);
        if(cliente!=null){
            int posicion=listaclientes.indexOf(cliente);
            cliente.setNombre(nombreNuevo);
            cliente.setCedula(cedula);
            cliente.setFiabilidad_pago(fiabilidad_pago);
            listaclientes.set(posicion, cliente);
            return true;
        }
        return false;
    }
    public boolean eliminar(String nombre){
        Cliente cliente=this.buscar(nombre);
        if (cliente!=null) {
            return listaclientes.remove(cliente);
        }
        return false;
    }

    public List<Cliente> getListaclientes() {
        return listaclientes;
    }

    public void setListaclientes(List<Cliente> listaclientes) {
        this.listaclientes = listaclientes;
    }

    public Cliente getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Cliente seleccionado) {
        this.seleccionado = seleccionado;
    }
    
}
