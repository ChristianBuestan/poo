package controlador;


import Modelo.Asignatura;
import Modelo.Aula;
import Modelo.Grupo;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian
 */
public class Grupo_controlador {
    private List<Grupo> datos;
    public Grupo_controlador(){
        datos= new ArrayList<Grupo>();
    }
    //Crud
    public boolean crear(long id, String nombre){
        Grupo grupo=new Grupo(id, nombre);
        return datos.add(grupo);
    }
    public Grupo buscar(List<Aula> Aula){
        for(Grupo grupo:datos){
            if(grupo.getAula().equals(Aula)==true){
                return grupo;
            }
        }
        return null;
    }
    public boolean Actualizar(String nombre, List<Asignatura> Asignatura, List<Aula> Aula){
        Grupo grupo=this.buscar(Aula);
        if(grupo!=null){
            int posicion=datos.indexOf(grupo);
            grupo.setNombre(nombre);
            grupo.setAsignatura(Asignatura);
            datos.set(posicion, grupo);
            return true;
        }
        return false;
    }
    public boolean borrar(List<Aula> Aula){
        Grupo grupo=this.buscar(Aula);
        if(grupo!=null){
            return datos.remove(grupo);
        }
        return false;
    }
    public void imprimir(){
        for(Grupo grupo: datos){
            System.out.println(grupo);
        }
    }

    public List<Grupo> getDatos() {
        return datos;
    }

    public void setDatos(List<Grupo> datos) {
        this.datos = datos;
    }
    
}
