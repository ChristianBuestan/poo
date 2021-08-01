/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controladores.ControladorRegistro;
import Controladores.ControladorVehiculo;
import Modelo.Registro;
import Modelo.Vehiculo;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Cristian
 */
public class TablaRegistros extends AbstractTableModel{
    private final ControladorRegistro servicioControlador;
    private final ControladorVehiculo vehiculoControlador;
    private final SimpleDateFormat simpleDateFormat;
    private final Class tipoColumnas[]=new Class[]{Integer.class,String.class,String.class,String.class,Double.class};
    private final String nombreColumnas[]={"Id","Vehiculo","Hora Entrada","Hora Salida","Valor"};
    public TablaRegistros(ControladorRegistro servicioControlador,ControladorVehiculo vehiculoControlador){
        this.servicioControlador=servicioControlador;
        this.vehiculoControlador=vehiculoControlador;
        simpleDateFormat=new SimpleDateFormat("dd-MM-yyyy HH:mm");
    }
    @Override
    public Class<?> getColumnClass(int columnIndex){
        return tipoColumnas[columnIndex];
    }
    @Override
    public String getColumnName(int column) {
        return nombreColumnas[column];
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }
    @Override
    public int getRowCount() {
        return servicioControlador.getListaParqueos().size();
    }

    @Override
    public Object getValueAt(int row, int column) {
        Registro servicio=servicioControlador.getListaParqueos().get(row);
        switch(column){
            case 0:
                return servicio.getId();
            case 1: 
                if (servicio.getVehiculo()!=null) {
                    return servicio.getVehiculo().getPlaca();
                }
                return "";
            case 2:
                return simpleDateFormat.format(servicio.getFechaEntrada());
            case 3:
                if (servicio.getFechaSalida()!=null) {
                    return simpleDateFormat.format(servicio.getFechaSalida());
                }
            case 4:
                return servicio.getCosto();
        }
        return null;
    }
    
    @Override
    public void setValueAt(Object value,int row, int column) {
        Registro servicio=servicioControlador.getListaParqueos().get(row);
        try {
            switch(column){
                case 1:
                    Vehiculo vehiculo=vehiculoControlador.buscar((String)value);
                    if (vehiculo!=null) {
                        servicio.setVehiculo(vehiculo);
                    }
                    break;
                case 2:
                    Date date=simpleDateFormat.parse((String)value);
                    servicio.setFechaEntrada(date);
                    break;
                case 3:
                    Date dateSalida=simpleDateFormat.parse((String )value);
                    servicio.setFechaSalida(dateSalida);
                    servicioControlador.Actualizar(servicio.getFechaEntrada(), servicio.getFechaSalida(),servicio.getVehiculo());
                    break;
                case 4:
//                    servicio.setValorPagar((double)value);
                    break;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    @Override
    public boolean isCellEditable(int row,int column){
        if (column!=0) {
            return true;
        }
        return false;
    }
    
}
