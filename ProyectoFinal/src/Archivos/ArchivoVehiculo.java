/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import Modelo.Vehiculo;
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
public class ArchivoVehiculo {
    private String ruta;

    public ArchivoVehiculo(String ruta) {
        this.ruta = ruta;
    }
    public void escribir(List<Vehiculo> vehiculos){
        try {
            FileOutputStream archivo= new FileOutputStream(ruta);
            ObjectOutputStream escritura=new ObjectOutputStream(archivo);
            for (Vehiculo vehiculo : vehiculos) {
                escritura.writeObject(vehiculo);
            }
            escritura.close();
            archivo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
    public List<Vehiculo> leer(){
        List<Vehiculo> listaVehiculo=new ArrayList<>();
        try {
            FileInputStream archivo=new FileInputStream(this.ruta);
            ObjectInputStream lectura=new ObjectInputStream(archivo);
            Vehiculo vehiculo;
            while ((vehiculo=(Vehiculo)lectura.readObject())!=null) {                
                listaVehiculo.add(vehiculo);
            }
            lectura.close();
            archivo.close();
        } catch (FileNotFoundException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace();
        }
        return listaVehiculo;
    }
    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }
    
}
