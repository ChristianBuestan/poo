/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Modelo.Persona;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class ArchivoPersona {
    private String ruta;

    public ArchivoPersona(String ruta) {
        this.ruta = ruta;
    }
    public void escribir(List<Persona> clientes){
        try {
            FileOutputStream archivo= new FileOutputStream(ruta);
            ObjectOutputStream escritura=new ObjectOutputStream(archivo);
            for (Persona cliente : clientes) {
                escritura.writeObject(cliente);
            }
            escritura.close();
            archivo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public List<Persona> leer(){
        List<Persona> listaClientes=new ArrayList<>();
        try {
            FileInputStream archivo=new FileInputStream(this.ruta);
            ObjectInputStream lectura=new ObjectInputStream(archivo);
            Persona persona;
            while ((persona=(Persona)lectura.readObject())!=null) {                
                listaClientes.add(persona);
            }
            lectura.close();
            archivo.close();
        } catch (FileNotFoundException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return listaClientes;
    }
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}
