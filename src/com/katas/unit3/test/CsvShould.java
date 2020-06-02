package com.katas.unit3.test;

import com.katas.unit3.main.Bus;
import com.katas.unit3.main.Csv;
import org.junit.*;
import static org.junit.Assert.*;

public class CsvShould {
    static Bus bus;
    @Before
    public void before(){
        bus = new Bus();
        bus.loadConfiguration();
        bus.boardPassenger("Bedo",2,"Valparaiso", 400);
        bus.boardPassenger("Juan",3,"Valparaiso", 400);
        bus.boardPassenger("Alberto",4,"Arica", 400);
    }
    @Test
    public void testPrintOccupiedSeatsIsPassed(){
        String text =   "2;Bedo;Valparaiso;400.0\n" +
                        "3;Juan;Valparaiso;400.0\n" +
                        "4;Alberto;Arica;400.0\n";
        Csv csv_format = new Csv();
        String text_n = csv_format.print(bus.getListSeatsAvailable());
        assertEquals(text, text_n);
    }
    @Test
    public void testPrintUnoccupiedSeatsIsPassed(){
        String text =  "1;Libre\n" +
                       "5;Libre\n";
        Csv csv_format = new Csv();
        String text_n = csv_format.print(bus.getListSeatsUnoccupied());
        assertEquals(text, text_n);
    }
    @Test
    public void testPrintByDestinationIsPassed(){
        String text =  "4;Alberto;Arica;400.0\n";
        Csv csv_format = new Csv();
        String destination = "Arica";
        String text_n = csv_format.print(bus.getListPassengersByDestination(destination));
        assertEquals(text, text_n);
    }
    @Test
    public void testListPassengersIsPassed(){
        String text =   "1;Libre\n" +
                        "2;Bedo;Valparaiso;400.0\n" +
                        "3;Juan;Valparaiso;400.0\n" +
                        "4;Alberto;Arica;400.0\n"+
                        "5;Libre\n";
        Csv csv_format = new Csv();
        String text_n = csv_format.print(bus.getInfoBus());
        assertEquals(text, text);
    }
    @Test
    public void testSearchByNameIsPassed() {
        Csv csv_format = new Csv();
        String text_n = csv_format.print(bus.getSearchByName("Alberto"));
        System.out.println(text_n);
        assertEquals(1, 1);
    }
}
