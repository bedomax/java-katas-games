package com.katas.store.test;
import com.katas.store.main.IPCamera;
import org.junit.*;
import static org.junit.Assert.*;

public class IPCameraTurnDegreesShould {
    static com.katas.store.main.IPCamera ipcamera;
    @Before
    public void before(){
        ipcamera = new IPCamera();
    }

    @Test
    public void testIPCameraSetTurnDegreesIsPassed(){
        int num = 180;
        ipcamera.setTurnDegrees(num);
        assertEquals(ipcamera.getTurnDegrees(), num);
    }
    @Test (expected = NullPointerException.class)
    public void testIPCameraSetTurnDegreesIsError(){
        int num = 1800;
        ipcamera.setTurnDegrees(num);
    }
}
