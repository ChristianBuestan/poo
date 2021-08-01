/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Modelo.Registro;
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
public class ArchivoRegistro {
    private String ruta;

    public ArchivoRegistro(String ruta) {
        this.ruta = ruta;
    }
    public void escribir(List<Registro> registros){
        try {
            FileOutputStream archivo= new FileOutputStream(ruta);
            ObjectOutputStream escritura=new ObjectOutputStream(archivo);
            for (Registro registro : registros) {
                escritura.writeObject(registro);
            }
            escritura.close();
            archivo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public List<Registro> leer(){
        List<Registro> listaRegistro=new ArrayList<>();
        try {
            FileInputStream archivo=new FileInputStream(this.ruta);
            ObjectInputStream lectura=new ObjectInputStream(archivo);
            Registro registro;
            while ((registro=(Registro)lectura.readObject())!=null) {                
                listaRegistro.add(registro);
            }
            lectura.close();
            archivo.close();
        } catch (FileNotFoundException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return listaRegistro;
    }
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}
