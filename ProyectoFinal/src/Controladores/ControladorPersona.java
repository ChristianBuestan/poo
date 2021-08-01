/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class ControladorPersona {
    private Persona seleccionado;
    private List<Persona> datos;
    public ControladorPersona(){
        datos=new ArrayList<>();
        seleccionado=null;
        
    }
    public long GenerarId(){
        if(datos.size()>0)      
            return datos.get(datos.size()-1).getId()+1;
        else
            return 1;
    }
    public boolean crear(String nombre, String cedula){
        Persona persona=new Persona(nombre, cedula, this.GenerarId());
        return datos.add(persona);
    }
    public Persona buscar(String cedula){
        for (Persona persona : datos) {
            if (persona.getCedula().equals(cedula)) {
                return persona;
            }
        }
        return null;
    }
    public boolean actualizar(String nombre,String cedula){
        Persona persona=this.buscar(cedula);
        if (persona!=null) {
            int posicion=datos.indexOf(persona);
            persona.setCedula(cedula);
            persona.setNombre(nombre);
            datos.set(posicion, persona);
        }
        
        return true;
    }
    public boolean eliminar(String cedula){
        Persona persona=this.buscar(cedula);
        if (persona!=null) {
            return datos.remove(persona);
        }
        return false;
    }

    public Persona getSeleccionado() {
        return seleccionado;
    }

    public void setSeleccionado(Persona seleccionado) {
        this.seleccionado = seleccionado;
    }

    public List<Persona> getDatos() {
        return datos;
    }

    public void setDatos(List<Persona> datos) {
        this.datos = datos;
    }
    
}
