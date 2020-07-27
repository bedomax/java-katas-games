package com.katas.store.test;

import com.katas.store.main.IPCamera;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IPCameraMetersWifi {
    static com.katas.store.main.IPCamera ipcamera;
    @Before
    public void before(){
        ipcamera = new IPCamera();
    }

    @Test
    public void testIPCameraSetMetersWifiIsPassed(){
        double num = 4;
        ipcamera.setMetersWiFi(num);
        assertEquals(ipcamera.getMetersWiFi(), num,0);
    }
    @Test (expected = NullPointerException.class)
    public void testIPCameraSetMetersWifiIsError(){
        int num =15;
        ipcamera.setMetersWiFi(num);
    }
}
