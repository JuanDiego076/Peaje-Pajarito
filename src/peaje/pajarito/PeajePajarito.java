/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package peaje.pajarito;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author juand
 */
public class PeajePajarito {

    public static ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String op;  //Esta variable la uso para controlar el menú principal
        
        //Un ciclo while para mostrar un menú de usuario, que haga el programa mas fácil de usar
        while (true) {
            System.out.println("\t\tBIENVENIDO\n");
            System.out.println("A] Pagar peaje");
            System.out.println("B] Mostrar lista de vehiculos");
            System.out.println("X] Salir");

            op = scan.nextLine();
            System.out.println("\n\n");

            String op2; //Esta variable me funciona para controlar el Menú siguiente
            if (op.equalsIgnoreCase("A")) {

                System.out.println("\t\tTipo de vehiculo\n");
                System.out.println("A] Motocicleta");
                System.out.println("B] Automovil");
                System.out.println("C] Camion 1 eje");
                System.out.println("D] Camion 2 ejes");
                System.out.println("X] Salir");
                op2 = scan.nextLine();

            } else {
                continue;
            }

            Vehiculo vehiculo = new Vehiculo();

            switch (op2) {
                case "a":
                    vehiculo = pedirDatos(vehiculo);
                    vehiculo.setValorPeaje(2000);
                    System.out.println("El valor de su peaje es: " + vehiculo.getValorPeaje());
                    vehiculo.toJson();
                    vehiculos.get(vehiculos.size() - 1).toXML();
                    continue;

                case "b":
                    vehiculo = pedirDatos(vehiculo);
                    vehiculo.setValorPeaje(7000);
                    System.out.println("El valor de su peaje es: " + vehiculo.getValorPeaje());
                    vehiculo.toJson();
                    continue;

                case "c":
                    vehiculo = pedirDatos(vehiculo);
                    vehiculo.setValorPeaje(10000);
                    System.out.println("El valor de su peaje es: " + vehiculo.getValorPeaje());
                    vehiculo.toJson();
                    vehiculos.get(vehiculos.size() - 1).toXML();
                    continue;

                case "d":
                    vehiculo = pedirDatos(vehiculo);
                    vehiculo.setValorPeaje(12000);
                    System.out.println("El valor de su peaje es: " + vehiculo.getValorPeaje());
                    vehiculo.toJson();
                    vehiculos.get(vehiculos.size() - 1).toXML();
                    continue;

                case "x":
                    continue;
            }
        }
    }

    /*Este método es para pedir algunos datos del usuario como placa y la marca
    *para posteriormente almaccenarlo en un nuevo vehichulo
     */
    public static Vehiculo pedirDatos(Vehiculo v) {

        Scanner scan = new Scanner(System.in);

        String placa;
        String marca;
        System.out.println("PLACA:");
        placa = scan.nextLine();
        System.out.println("MARCA: ");
        marca = scan.nextLine();

        v = new Vehiculo(placa, marca);
        vehiculos.add(v);

        return v;
    }

}
