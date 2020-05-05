package com.uniacc.unit2.test;

import com.uniacc.unit2.main.Constants;
import com.uniacc.unit2.main.Model;
import org.junit.*;
import static org.junit.Assert.*;


public class TelevisionModelShould {
    static com.uniacc.unit2.main.Model model;

    @Before
    public void before(){
        model = new Model(Constants.MODEL_TYPE_TELEVISION);
    }

    @Test
    public void testTelevisionSetNameIsPassed(){
        String name = "AB1273";
        model.setName(name);
        assertEquals(model.getName(), name);
    }

    @Test (expected = NullPointerException.class)
    public void testTelevisionSetNameMoreChars(){
        String name = "AB12732323";
        model.setName(name);
        assertEquals(model.getName(), name);
    }
//
    @Test  (expected = NullPointerException.class)
    public void testTelevisionSetNameWithOutZeroFirstPos(){
        //The name without ZERO first position
        String name = "AB0234";
        model.setName(name);
    }
//
    @Test  (expected = NullPointerException.class)
    public void testTelevisionSetNameNotPair(){
        //No debe terminar en par
        String name = "AB1232";
        model.setName(name);
    }

    @Test  (expected = NullPointerException.class)
    public void testTelevisionSetNameNotMoreThan20(){
        //La suma no es mayor a 20
        String name = "AB9633";
        model.setName(name);
    }

    @Test  (expected = NullPointerException.class)
    public void testTelevisionSetNameMustHave7(){
        // Si no tiene 7
        String name = "AB2343";
        model.setName(name);
    }
}
