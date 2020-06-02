package com.katas.unit2.test;

import com.katas.unit2.main.IPCamera;
import org.junit.*;
import static org.junit.Assert.*;

public class IPCameraModelShould {
    static IPCamera ipcamera;

    @Before
    public void before(){
        ipcamera = new IPCamera();
    }

    @Test
    public void testThatSetNameIsPassedOption1(){
        String name = "Interior abcdeaa";
        ipcamera.setModel(name);
        assertEquals(ipcamera.getModel(), name);
    }

    @Test
    public void testThatSetNameIsPassedOption2(){
        String name = "Exterior abcdegj";
        ipcamera.setModel(name);
        assertEquals(ipcamera.getModel(), name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameWithMore7CharsIsError(){
        String name = "Exterior abcdegjabcdje";
        ipcamera.setModel(name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameWithLess7CharsIsError(){
        String name = "External asd";
        ipcamera.setModel(name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameOnlyLettersIsError(){
        String name = "External a2c4d6f";
        ipcamera.setModel(name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameWithOutHWFhwf(){
        String name = "External HWFhwfF";
        ipcamera.setModel(name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameWithOutInternal(){
        String name = "Iternal HWFhwfF";
        ipcamera.setModel(name);
    }
}
