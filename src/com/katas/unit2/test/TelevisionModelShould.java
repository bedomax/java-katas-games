package com.katas.unit2.test;

import com.katas.unit2.main.Television;
import org.junit.*;
import static org.junit.Assert.*;


public class TelevisionModelShould {
    static com.katas.unit2.main.Television television;

    @Before
    public void before(){
        television = new Television();
    }

    @Test
    public void testTelevisionSetNameIsPassed(){
        String name = "AB1273";
        television.setModel(name);
        assertEquals(television.getModel(), name);
    }

    @Test (expected = NullPointerException.class)
    public void testTelevisionSetNameMoreChars(){
        String name = "AB12732323";
        television.setModel(name);
        assertEquals(television.getModel(), name);
    }
//
    @Test  (expected = NullPointerException.class)
    public void testTelevisionSetNameWithOutZeroFirstPos(){
        //The name without ZERO first position
        String name = "AB0234";
        television.setModel(name);
    }
//
    @Test  (expected = NullPointerException.class)
    public void testTelevisionSetNameNotPair(){
        //No debe terminar en par
        String name = "AB1232";
        television.setModel(name);
    }

    @Test  (expected = NullPointerException.class)
    public void testTelevisionSetNameNotMoreThan20(){
        //La suma no es mayor a 20
        String name = "AB9633";
        television.setModel(name);
    }

    @Test  (expected = NullPointerException.class)
    public void testTelevisionSetNameMustHave7(){
        // Si no tiene 7
        String name = "AB2343";
        television.setModel(name);
    }
}
