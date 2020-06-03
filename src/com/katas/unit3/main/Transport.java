package com.katas.unit3.main;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public interface Transport {
    public abstract void loadConfiguration() throws FileNotFoundException;
    public abstract boolean boardPassenger(String name_pax, int number_seat, String destination, double cost);
    public abstract void boardPassenger(Seat seat);
    public Seat searchNumberSeat(int number_seat);
    public abstract ArrayList getListSeatsOccupied();
    public abstract ArrayList getListSeatsUnoccupied();
    public ArrayList  getListPassengersByDestination(String destination);
    public abstract void downPassenger(int number_seat);
    public abstract ArrayList getSearchByName(String name_passenger);
    public abstract int getTotalFreeSeats();
    public abstract boolean seatIsFree(int number_seat);
    public abstract ArrayList getInfoBus();
    public abstract String getPatent();
    public abstract void setPatent(String patent);
    public abstract Person getDriver();
    public abstract void setDriver(Person driver);
}
