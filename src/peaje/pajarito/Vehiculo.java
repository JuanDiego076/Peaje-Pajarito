/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peaje.pajarito;

import java.util.ArrayList;

/**
 *
 * @author juand
 */
public class Vehiculo {

    /**
     * Atributos del objeto vehiculo
     */
    private String placa; 
    private String marca;
    private int valorPeaje;

    /**
     * --------------------------------------------------------------------------
     * Hacemos el constructor sólo con los argumentos de placa y marca porque
     * necesitamos validar el valorPeaje posteriormente
     */
    public Vehiculo(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
    }

    //constructor vacío para crear Vehiculos por defecto
    public Vehiculo() {
    }

    /**
     * Implemantamos los getters and setters, para permitir la modificación de
     * los atributos
     */
    //Devuelve el valor del peaje
    public int getValorPeaje() {
        return valorPeaje;
    }

    //Modifica el valor de valorPeaje
    public void setValorPeaje(int valorPeaje) {
        this.valorPeaje = valorPeaje;
    }

    //Devuelve el valor de la placa
    public String getPlaca() {
        return placa;
    }

    //Modifica el valor de la placa
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    //Devuelve el valor de la marca
    public String getMarca() {
        return marca;
    }

    //Modifica el valor de la marca
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Entrega información del vehiculo en formato json
    public void toJson() {
        System.out.println("\n----------------JSON-------------------------------\n\n");
        System.out.println("{\n\t\"Vehiculo\":\n"
                + "\t\t\"Automovil\": {\n\t\t\t\"placa\": " + placa + "\n\t\t\t\"marca\": " + marca + "\n\t\t\t\"valor\":" + valorPeaje + "\n\t\t}"
                + "\n}");
    }
    
    //Entrega información del vehiculo en formato xml
    public void toXML(){
        System.out.println("\n------------------XML------------------------------\n\n");
    System.out.println("<Vehiculo>\n"
                + "\t\t<Automovil> \n\t\t\t<placa> " + placa + "</placa>" + "\n\t\t\t<marca>" + marca + "</marca>" + "\n\t\t\t<valor>" + valorPeaje +"</valor>"+ "\n\t\t</Automovil>"
                + "\n</Vehiculo>");
    
    }
    
}
