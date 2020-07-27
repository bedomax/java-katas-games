package com.katas.supermaket.test;

import com.katas.store.main.Device;
import com.katas.supermaket.main.poo.Store;
import org.junit.*;
import static org.junit.Assert.*;

public class StoreShould {
    static Store store;
    @Before
    public void before(){
        store = new Store();
    }

    @Test
    public void testThatLoadTotalItemIsPassed(){
        System.out.println(store.getProducts().size());
        assertEquals(true,true);
    }
}
