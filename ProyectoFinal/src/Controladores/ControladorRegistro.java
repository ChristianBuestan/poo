/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Registro;
import Modelo.Vehiculo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Cristian
 */
public class ControladorRegistro {
    private List<Registro> listaParqueos;
    private Registro Seleccionado;
     public static  double Costo_hora =1;

    public static double getCosto_hora() {
        return Costo_hora;
    }

    public static void setCosto_hora(double Costo_hora) {
        ControladorRegistro.Costo_hora = Costo_hora;
    }
    public ControladorRegistro(){
        listaParqueos=new ArrayList<>();
       
    }
    public long GenerarId(){
        if(listaParqueos.size()>0)      
            return listaParqueos.get(listaParqueos.size()-1).getId()+1;
        else
            return 1;
    }
    public boolean crear(Date fechaEntrada,Date fechaSalida,Vehiculo vehiculo){
        double valorPagar;
        long diferenciaSegundos=Math.abs(fechaSalida.getTime()-fechaEntrada.getTime()); //consigo las horas
        long minutos=TimeUnit.MINUTES.convert(diferenciaSegundos,TimeUnit.MILLISECONDS); //
        if (minutos>=10080) {
            valorPagar= minutos*(this.Costo_hora/60);
            double multa=valorPagar*0.1;
            valorPagar=valorPagar+multa;
        }else{
        valorPagar= minutos*(this.Costo_hora/60);}
        String str=String.format("%1.2f", valorPagar);
        valorPagar=Double.valueOf(str);
        Registro registro=new Registro(this.GenerarId(), fechaEntrada, fechaSalida, valorPagar,vehiculo);
        return listaParqueos.add(registro);
    }
   
    public Registro buscar(Date fechaEntrada){
        for (Registro registro : listaParqueos) {
            if (registro.getFechaEntrada().equals(fechaEntrada)) {
                return registro;
            }
        }
        return null;
    }
    public boolean Actualizar(Date fechaEntrada,Date fechaSalida,Vehiculo vehiculo){
        Registro registro=this.buscar(fechaEntrada);
        double valorPagar;
        if (registro!=null) {
            int posicion=listaParqueos.indexOf(registro);
            registro.setVehiculo(vehiculo);
            registro.setFechaSalida(fechaSalida);
            long diferenciaSegundos=Math.abs(registro.getFechaSalida().getTime()-registro.getFechaEntrada().getTime()); //consigo las horas
            long minutos=TimeUnit.MINUTES.convert(diferenciaSegundos,TimeUnit.MILLISECONDS); //
            if (minutos>=10080) {
                valorPagar= minutos*(this.Costo_hora/60);
                double multa=valorPagar*0.1;
                valorPagar=valorPagar+multa;
            }else{
            valorPagar= minutos*(this.Costo_hora/60);}
            String str=String.format("%1.2f", valorPagar);
            valorPagar=Double.valueOf(str);
            registro.setCosto(valorPagar);
            listaParqueos.set(posicion, registro);
            return true;
        }
        return false;
    }
    public boolean eliminar(Date fechaEntrada){
        Registro registro=this.buscar(fechaEntrada);
        if (registro!=null) {
            registro.getVehiculo().getRegistros().remove(registro);
            return listaParqueos.remove(registro);
        }
        return false;
    }

    public List<Registro> getListaParqueos() {
        return listaParqueos;
    }

    public void setListaParqueos(List<Registro> listaParqueos) {
        this.listaParqueos = listaParqueos;
    }

    public Registro getSeleccionado() {
        return Seleccionado;
    }

    public void setSeleccionado(Registro Seleccionado) {
        this.Seleccionado = Seleccionado;
    }

   
}
