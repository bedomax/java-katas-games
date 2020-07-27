package com.katas.busticket.test;

import com.katas.busticket.main.Bus;
import com.katas.busticket.main.Seat;
import com.katas.busticket.main.Person;
import org.junit.*;

import static org.junit.Assert.*;

public class BusLoadSeatsOccupiedShould {
    static Bus bus;

    @Before
    public void before(){
        bus = new Bus();
        bus.loadConfiguration();
        bus.loadSeatsOccupied();
    }

    @Test
    public void testBusSetFirstSeatNumberIsPassed(){
        int number = 4;
        Seat seat = bus.getSeats().get(0);
        assertEquals(seat.getNumber(),number);
    }
    @Test
    public void testBusSetFirstSeatPersonIsPassed(){
        Person person = new Person("Eduardo Perez");
        Seat seat = bus.getSeats().get(0);
        assertEquals(seat.getPerson().getName(),person.getName());
    }
    @Test
    public void testBusSetFirstSeatDestinationIsPassed(){
        String destination = "Providencia";
        Seat seat = bus.getSeats().get(0);
        assertEquals(seat.getTicket().getDestination(),destination);
    }
    @Test
    public void testBusSetFirstSeatCostIsPassed(){
        double cost = 500;
        Seat seat = bus.getSeats().get(0);
        assertEquals(seat.getTicket().getCost(), cost,0);
    }
}
