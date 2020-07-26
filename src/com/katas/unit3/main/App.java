package com.katas.unit3.main;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Bus bus = new Bus();
        Csv csv_format = new Csv();
        Seat seat = new Seat();
        Ticket ticket = new Ticket();
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
            System.out.println("7) Buscar por nombre");
            System.out.println("8) Total de asientos libres");
            System.out.println("9) La opción de Salir.");
            opcion = in.nextLine();

            switch (Integer.parseInt(opcion)){
                case 1:
                    seat = new Seat();
                    ticket = new Ticket();
                    System.out.println("\n| Subir Pasajero ");
                    System.out.println("| Número de Asiento ");
                    UI.inputNumberSeat(in,seat);
                    if(bus.seatIsFree(seat.getNumber())){
                        System.out.println("| Nombre:");
                        UI.inputPassengerName(in,seat);
                        System.out.println("| Destino:");
                        UI.inputDestination(in,ticket);
                        System.out.println("| Valor:");
                        UI.inputCost(in,ticket);
                        seat.setAvailable(false);
                        seat.setTicket(ticket);
                        bus.boardPassenger(seat);
                    }else{
                        System.out.println("*Alerta: Asiento Ocupado\n\n");
                    }
                    break;
                case 2:
                    seat = new Seat();
                    System.out.println("\n| Bajar Pasajero ");
                    System.out.println("| Número de Asiento ");
                    UI.inputNumberSeat(in,seat);
                    bus.downPassenger(seat.getNumber());
                    break;
                case 3:
                    System.out.println("*Listado de Asientos ocupados*");
                    System.out.println(csv_format.print(bus.getListSeatsOccupied()));
                    break;
                case 4:
                    System.out.println("*Listado de Asientos Desocupados*");
                    System.out.println(csv_format.print(bus.getListSeatsUnoccupied()));
                    break;
                case 5:
                    System.out.println("\n| Listar los pasajeros por destino ");
                    System.out.println("| Destino: ");
                    UI.inputDestination(in,ticket);
                    System.out.println(csv_format.print(bus.getListPassengersByDestination(ticket.getDestination())));
                    break;
                case 6:
                    System.out.println("*Listado de Pasajeros*");
                    System.out.println(csv_format.print(bus.getInfoBus()));
                    System.out.println("\n\n");
                    break;
                case 7:
                    System.out.println("\n| Buscar por nombre ");
                    System.out.println("| Nombre: ");
                    UI.inputPassengerName(in,seat);
                    System.out.println(csv_format.print(bus.getSearchByName(seat.getPerson().getName())));
                    break;
                case 8:
                    System.out.println("\n| Total asientos disponibles ");
                    System.out.println(bus.getTotalFreeSeats());
                    break;
            }
        }while(!opcion.equals("9"));

        Writer writer = null;
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(Constants.PATH_BACKUP_INFO), "utf-8"));
            writer.write(csv_format.print(bus.getListSeatsOccupied()));
        } catch (IOException ex) {
            // Report
        } finally {
            try {
                writer.close();
            } catch (Exception ex) {}
        }

    }
}