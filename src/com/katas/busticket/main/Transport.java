package com.katas.busticket.main;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface Transport {
    public void loadConfiguration() throws FileNotFoundException;
    public boolean boardPassenger(String name_pax, int number_seat, String destination, double cost);
    public void boardPassenger(Seat seat);
    public Seat searchNumberSeat(int number_seat);
    public ArrayList getListSeatsOccupied();
    public ArrayList getListSeatsUnoccupied();
    public ArrayList  getListPassengersByDestination(String destination);
    public void downPassenger(int number_seat);
    public ArrayList getSearchByName(String name_passenger);
    public int getTotalFreeSeats();
    public boolean seatIsFree(int number_seat);
    public ArrayList getInfoBus();
    public String getPatent();
    public void setPatent(String patent);
    public Person getDriver();
    public void setDriver(Person driver);
}
