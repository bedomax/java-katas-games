package com.katas.store.test;
import com.katas.store.main.Device;
import org.junit.*;
import static org.junit.Assert.*;

public class DeviceShould {
    static Device device;

    @Before
    public void before(){
        device = new Device();
    }

    @Test
    public void testThatSetNameInBrandIsPassed(){
        String name = "ABCD";
        device.setBrand(name);
        assertEquals(device.getBrand(), name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameInBrandWithNumbersIsError(){
        String name = "As3D";
        device.setBrand(name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameInBrandWithRepeatLettersIsError(){
        String name = "ASDD";
        device.setBrand(name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameInBrandWithMore4Chars(){
        String name = "ASDDRTTT";
        device.setBrand(name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameLess4Chars(){
        String name = "ASD";
        device.setBrand(name);
    }

}
