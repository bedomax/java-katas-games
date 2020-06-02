package com.katas.unit3.test;

import com.katas.unit3.main.Bus;
import org.junit.*;
import static org.junit.Assert.*;

public class BusLoadConfigurationShould {
    static Bus bus;

    @Before
    public void before(){
        bus = new Bus();
        bus.loadConfiguration();
    }

    @Test
    public void testBusSetDriverIsPassed(){
        String name = "Luis Ahumada";
        assertEquals(bus.driver.getName(),name);
    }
    @Test
    public void testBusSetPatentIsPassed(){
        String patent = "XH6630";
        assertEquals(bus.getPatent(),patent);
    }
    @Test
    public void testBusSetSizeIsPassed(){
        int size = 40;
        assertEquals(bus.getSize(),size);
    }
}
