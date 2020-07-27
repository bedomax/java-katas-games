package com.katas.busticket.test;

import com.katas.busticket.main.Bus;
import com.katas.busticket.main.Seat;
import org.junit.*;
import static org.junit.Assert.*;

public class BusBoardPassengerShould {
    static Bus bus;
    @Before
    public void before(){
        bus = new Bus();
        bus.loadConfiguration();
        bus.boardPassenger("Bedo",2,"Valparaiso", 400);
        bus.boardPassenger("Juan",3,"Valparaiso", 400);
    }
    @Test
    public void testSeatPaxNameIsPassed(){
        String pax_name = bus.getSeats().get(0).getPerson().getName();
        assertEquals("Bedo", pax_name);
    }
    @Test
    public void testSeatNumberIsPassed(){
        int number = bus.getSeats().get(0).getNumber();
        assertEquals(2, number);
    }
    @Test
    public void testSeatDestinationIsPassed(){
        String destination = bus.getSeats().get(0).getTicket().getDestination();
        assertEquals("Valparaiso", destination);
    }
    @Test
    public void testSeatCostIsPassed(){
        double cost = bus.getSeats().get(0).getTicket().getCost();
        assertEquals(400, cost,0);
    }
    @Test
    public void testSearchSeatIsPassed(){
       Seat seat = bus.searchNumberSeat(2);
       assertEquals(seat.getPerson().getName(), "Bedo");
    }

    @Test
    public void testTotalFreeSeatsIsPassed(){
        assertEquals(3, bus.getTotalFreeSeats());
    }

    @Test (expected = NullPointerException.class)
    public void testNotFoundSeatIsPassed(){
        Seat seat = bus.searchNumberSeat(5);
    }
}
