/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author Cristian
 */
public class ValidarCedula extends Exception{ //creamos nuestra propia excepcion
    public final static String mensaje="Cedula incorrecta";
    public ValidarCedula(){
        super(mensaje);
    }

    @Override
    public String getMessage() {
        return mensaje;
    }
    
}
