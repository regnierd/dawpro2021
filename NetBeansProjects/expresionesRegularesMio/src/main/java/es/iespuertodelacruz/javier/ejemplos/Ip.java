/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iespuertodelacruz.javier.ejemplos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Javi
 */
public class Ip {
   private String patron = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]"
           + "|2[0-4][0-9]|[01]?[0-9][0-9]?).(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)."
           + "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
    
    Pattern pattern;
    Matcher matcher;

    /**
     * Funcion que evalua si una matricula cumple el patron 0000XXX o
     * @param valor a evaluar
     * @return true/false en funcion de si es correcto o no
     */
    public boolean validar(String valor) {
        boolean resultado = false;
        this.pattern = Pattern.compile(patron);
        this.matcher = pattern.matcher(valor);
        resultado = matcher.find();
        return resultado;
    } 
}
