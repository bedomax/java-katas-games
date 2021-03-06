package com.katas.store.test;

import com.katas.store.main.IPCamera;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IPCameraMegapixelesShould {
    static com.katas.store.main.IPCamera ipcamera;
    @Before
    public void before(){
        ipcamera = new IPCamera();
    }

    @Test
    public void testIPCameraSetMegapixelesIsPassed(){
        double num = 12.3;
        ipcamera.setMegapixels(num);
        assertEquals(ipcamera.getMegapixels(), num,0);
    }
    @Test (expected = NullPointerException.class)
    public void testIPCameraSetMegapixelesIsError(){
        int num = 180;
        ipcamera.setMegapixels(num);
    }
}
