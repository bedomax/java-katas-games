package com.uniacc.unit2.test;

import com.uniacc.unit2.main.Constants;
import com.uniacc.unit2.main.Model;
import org.junit.*;
import static org.junit.Assert.*;

public class IPCameraModelShould {
    static Model model;

    @Before
    public void before(){
        model = new Model(Constants.MODEL_TYPE_IP_CAMARA);
    }

    @Test
    public void testThatSetNameIsPassedOption1(){
        String name = "Interior abcdeaa";
        model.setName(name);
        assertEquals(model.getName(), name);
    }

    @Test
    public void testThatSetNameIsPassedOption2(){
        String name = "Exterior abcdegj";
        model.setName(name);
        assertEquals(model.getName(), name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameWithMore7CharsIsError(){
        String name = "Exterior abcdegjabcdje";
        model.setName(name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameWithLess7CharsIsError(){
        String name = "External asd";
        model.setName(name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameOnlyLettersIsError(){
        String name = "External a2c4d6f";
        model.setName(name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameWithOutHWFhwf(){
        String name = "External HWFhwfF";
        model.setName(name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameWithOutInternal(){
        String name = "Iternal HWFhwfF";
        model.setName(name);
    }
}
