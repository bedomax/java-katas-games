package com.katas.unit3.test;

import com.katas.unit3.main.Bus;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusDownPassengerShould {
    static Bus bus;
    @Before
    public void before(){
        bus = new Bus();
        bus.loadConfiguration();
        bus.boardPassenger("Bedo",2,"Valparaiso", 400);
        bus.boardPassenger("Juan",3,"Valparaiso", 400);
    }

    @Test
    public void testDownPassengerIsPassed(){
        int number_pax = 3;
        bus.downPassenger(number_pax);
        assertEquals(bus.getSeats().size(), 1);
    }
}
