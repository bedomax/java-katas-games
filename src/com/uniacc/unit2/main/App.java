package com.uniacc.unit2.main;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Television television = new Television();
        IPCamera ipcamera = new IPCamera();
        String opcion;

        do{
            System.out.println("*** Programa *** ");
            System.out.println("Seleccione una opción");
            System.out.println("1) Television ");
            System.out.println("2) Cámara IP ");
            System.out.println("3) Salir ");
            opcion = in.nextLine();
            if(opcion.equals("1")){
                System.out.println("\n| Información Televisión ");
                System.out.println("| Marca: ");
                UI.inputTelevisionName(in,television);
                System.out.println("\n| Ingreso los siguientes datos ");
                System.out.println("| Marca:"+television.getBrand());
            }
        }while(!opcion.equals("3"));
        System.out.printf("*** Cerrar Programa *** ");
    }
}
