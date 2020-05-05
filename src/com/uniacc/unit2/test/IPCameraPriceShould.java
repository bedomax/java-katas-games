package com.uniacc.unit2.test;

import com.uniacc.unit2.main.IPCamera;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IPCameraPriceShould {
    static IPCamera ipcamera;
    @Before
    public void before(){
        ipcamera = new IPCamera();
    }

    @Test
    public void testIPCameraSetPriceIsPassed(){
        double num = 80;
        ipcamera.setPrice(num);
        assertEquals(ipcamera.getPrice(), num,0);
    }
    @Test (expected = NullPointerException.class)
    public void testIPCameraSetMegapixelesIsError(){
        int num = 180;
        ipcamera.setPrice(num);
    }
}
