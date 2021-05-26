/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author Cristian
 */
public class Grupo {
    private long id; //valores globales
    private String nombre;
    private List<Asignatura> Asignatura;
    private List<Aula> Aula;

    public Grupo(long id, String nombre){// List<Asignatura> Asignatura, List<Aula> Aula) {
        this.id = id;
        this.nombre = nombre;
        //this.Asignatura = Asignatura;
        //this.Aula = Aula;
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

    public List<Asignatura> getAsignatura() {
        return Asignatura;
    }

    public void setAsignatura(List<Asignatura> Asignatura) {
        this.Asignatura = Asignatura;
    }

    public List<Aula> getAula() {
        return Aula;
    }

    public void setAula(List<Aula> Aula) {
        this.Aula = Aula;
    }

    @Override
    public String toString() {
        return "Grupo{" + "id=" + id + ", nombre=" + nombre + ", Asignatura=" + Asignatura + ", Aula=" + Aula + '}';
    }
    
    
    
}
