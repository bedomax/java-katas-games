package com.katas.unit3.main;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Bus implements Transport{
    private String patent;
    public Person driver;
    private ArrayList<Seat> seats;
    private Integer size;

    public Bus(){
        this.patent = null;
        this.driver = new Person();
        this.size = null;
        this.seats =  new ArrayList<Seat>();
    }

    public void loadConfiguration(){
        String[] result;
        try {
        String fileToPath = Constants.PATH_CONFIGURATION_DATA;
        Scanner scanner = new Scanner(new File(fileToPath));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result = line.split(";");
                this.setPatent(result[0]);
                this.driver.setName(result[1]);
                this.setSize(Integer.parseInt(result[2]));
            }
        }   catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void loadSeatsOccupied(){
        //PATH_CONFIGURATION_SEATS
        String[] result;
        Ticket ticket;
        int count = 0;
        try {
            String fileToPath = Constants.PATH_CONFIGURATION_SEATS;
            Scanner scanner = new Scanner(new File(fileToPath));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                result = line.split(";");
                String pax_name = result[1];
                int numbear_seat = Integer.parseInt(result[0]);
                String destination = result[2];
                double cost = Double.parseDouble(result[3]);
                this.boardPassenger(pax_name, numbear_seat,destination,cost);

            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }

    public boolean boardPassenger(String name_pax, int number_seat, String destination, double cost){
        if(this.seatIsFree(number_seat)) {
            Seat seat = new Seat();
            Ticket ticket = new Ticket();
            seat.setPerson(new Person(name_pax));
            seat.setNumber(number_seat);
            seat.setAvailable(false);
            ticket.buy(cost, destination);
            seat.setTicket(ticket);
            this.seats.add(seat);
            return true;
        }else{
            return false;
        }
    }

    public void boardPassenger(Seat seat){
        this.seats.add(seat);
    }

    public void downPassenger(int number_seat){
        int pos = this.searchSeat(number_seat);
        this.seats.remove(pos);
    }

    public Seat searchNumberSeat(int number_seat){
        int pos = this.searchSeat(number_seat);
        if(pos == Constants.POS_NOT_FOUND)
            throw new NullPointerException(Constants.ERROR_MSG_NOT_FOUND_NUMBER_SEAT);
        return this.seats.get(pos);
    }
    public ArrayList getListSeatsOccupied(){
        return this.getSeats();
    }
//
    public ArrayList getListSeatsUnoccupied(){
        ArrayList free_seats =  new ArrayList<Seat>();
        for(int i =1; i <= this.size; i++){
            if(this.searchSeat(i) == Constants.POS_NOT_FOUND){
                Seat seat = new Seat();
                seat.setAvailable(true);
                seat.setNumber(i);
                free_seats.add(seat);
            }
        }
        return free_seats;
    }

    public ArrayList getListPassengersByDestination(String destination){
        ArrayList dest_seats =  new ArrayList<Seat>();
        Iterator<Seat> itr_seats = this.seats.iterator();
        int position = Constants.POS_NOT_FOUND, count = 0 ;
        while(itr_seats.hasNext()){
            Seat seat = itr_seats.next();
            if(seat.getTicket().getDestination() == destination){
                dest_seats.add(seat);
            }
            count++;
        }
        return dest_seats;
    }

    public ArrayList getInfoBus(){
        ArrayList seats =  new ArrayList<Seat>();
        for(int i =1; i <= this.size; i++){
            Seat seat = new Seat();
            if(!(this.searchSeat(i) == Constants.POS_NOT_FOUND)){
                seats.add(this.seats.get(this.searchSeat(i)));
            }else{
                seat.setAvailable(true);
                seat.setNumber(i);
                seats.add(seat);
            }
        }
        return seats;
    }

    public ArrayList getSearchByName(String name_passenger){
        ArrayList seats =  new ArrayList<Seat>();
        int pos = this.searchPassenger(name_passenger);
        if(pos == Constants.POS_NOT_FOUND)
            throw new NullPointerException(Constants.ERROR_MSG_NOT_FOUND_NUMBER_SEAT);
        seats.add(this.seats.get(pos));
        return seats;
    }

    public int getTotalFreeSeats(){
        return this.getListSeatsUnoccupied().size();
    }

    public boolean seatIsFree(int number_seat){
        int pos = this.searchSeat(number_seat);
        if(pos == Constants.POS_NOT_FOUND){
            return true;
        }else{
            return false;
        }
    }

    public String getPatent() {
        return patent;
    }

    public void setPatent(String patent) {
        this.patent = patent;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }
    public int getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void setSeats(ArrayList<Seat> seats) {
        this.seats = seats;
    }

    private int searchSeat(int number_seat){
        Iterator<Seat> itr_seats = this.seats.iterator();
        int position = Constants.POS_NOT_FOUND, count = 0 ;
        while(itr_seats.hasNext()){
            Seat seat = itr_seats.next();
            if(seat.getNumber() == number_seat){
                position = count;
            }
            count++;
        }
        return position;
    }

    private int searchPassenger(String name_pax){
        Iterator<Seat> itr_seats = this.seats.iterator();
        int position = Constants.POS_NOT_FOUND, count = 0 ;
        while(itr_seats.hasNext()){
            Seat seat = itr_seats.next();
            if(seat.getPerson().getName() == name_pax){
                position = count;
            }
            count++;
        }
        return position;
    }
}
