/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class Aula {
    private long id;
    private String descripcion;
    private List<Grupo> listagrupo;
    public Aula(){
        id=0;
        descripcion="";
        listagrupo=new ArrayList<>();
    }
    public Aula(long id, String descripcion) {
        this.id =id;
        this.descripcion=descripcion;
        listagrupo=new ArrayList<>();

    }

    public Aula(long id, String descripcion, List<Grupo> listaGrupo) {
        this.id = id;
        this.descripcion= descripcion;
        this.listagrupo=listagrupo;
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

    public List<Grupo> getListagrupo() {
        return listagrupo;
    }

    public void setListagrupo(List<Grupo> listagrupo) {
        this.listagrupo = listagrupo;
    }

    

    @Override
    public String toString() {
        return "Aula{" + "id=" + id + ", descripcion=" + descripcion + '}';
    }
    
}
