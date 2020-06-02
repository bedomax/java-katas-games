package com.katas.unit3.main;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bus bus = new Bus();
        bus.loadConfiguration();
        bus.loadSeatsOccupied();
        String opcion;
        do{
            System.out.println("*** Programa *** ");
            System.out.println("Seleccione una opción");
            System.out.println("1) Subir un pasajero: esto significa agregar un nuevo pasajero al bus (Número de asiento, nombre, destino, valor). Se debe validar que el asiento a ocupar no esté ocupado. ");
            System.out.println("2) Bajar un pasajero: esto significa dejar disponible el asiento del pasajero que se baja.");
            System.out.println("3) Listar el contenido de los asientos ocupados.");
            System.out.println("4) Listar los asientos desocupados.");
            System.out.println("5) Listar los pasajeros del bus que van a un destino dado.");
            System.out.println("6) Mostrar los datos del bus y, gráficamente, dentro de las posibilidades, los asientos ocupados y desocupados del bus.");
            System.out.println("7) La opción de Salir.");
            opcion = in.nextLine();
            if(opcion.equals("1")){
                Seat seat = new Seat();
                System.out.println("\n| Subir Pasajero ");
                System.out.println("| Número de Asiento ");
                UI.inputNumberSeat(in,seat);
                if(bus.seatIsFree(seat.getNumber())){
                    System.out.println("| Nombre:");
                    UI.inputPassengerName(in,seat);
                    System.out.println("| Destino:");
                    UI.inputNumberSeat(in,seat);
                }else{
                    System.out.println("*Alerta: Asiento Ocupado\n\n");
                }
            }
        }while(!opcion.equals("7"));
    }
}