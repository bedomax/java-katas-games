package com.uniacc.unit2.test;
import com.uniacc.unit2.main.IPCamera;
import org.junit.*;
import static org.junit.Assert.*;

public class IPCameraShould {
    static com.uniacc.unit2.main.IPCamera ip_camera;
    @Before
    public void before(){
        ip_camera = new IPCamera();
    }

    @Test
    public void testTelevisionCreateObjectIsPassed(){
        ip_camera.setBrand("ABCD");
        ip_camera.setCode("WRAE421");
        ip_camera.setModel("Interior abcdeaa");
        ip_camera.setTurnDegrees(180);
        ip_camera.setMegapixels(12.3);
        ip_camera.setMetersWiFi(4);
        ip_camera.setPrice(50);
        assertTrue(ip_camera.toString(), true);
    }
}
