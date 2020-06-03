package com.katas.unit3.main;
import com.katas.unit2.main.Television;

import java.util.Scanner;
public final class UI {
    public static  void inputNumberSeat(Scanner in, Seat seat){
        boolean error;
        do{
            try{
                seat.setNumber(Integer.parseInt(in.nextLine()));
                error = false;
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
    }

    public static  void inputPassengerName(Scanner in, Seat seat){
        boolean error;
        do{
            try{
                Person person = new Person();
                person.setName(in.nextLine());
                seat.setPerson(person);
                error = false;
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
    }

    public static  void inputDestination(Scanner in, Ticket ticket){
        boolean error;
        do{
            try{
                error = false;
                ticket.setDestination(in.nextLine());
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
    }

    public static  void inputCost(Scanner in, Ticket ticket){
        boolean error;
        do{
            try{
                error = false;
                ticket.setCost(Integer.parseInt(in.nextLine()));
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
                error = true;
            }
        }while(error);
    }

}
