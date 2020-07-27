package com.katas.store.test;
import com.katas.store.main.IPCamera;
import org.junit.*;
import static org.junit.Assert.*;

public class IPCameraCodeShould {
    static IPCamera ipCamera;

    @Before
    public void before(){
        ipCamera = new IPCamera();
    }
    @Test
    public void testThatSetCodeIsPassed(){
        String code = "WRAE421";
        ipCamera.setCode(code);
        assertEquals(ipCamera.getCode(), code);
    }
    @Test (expected = NullPointerException.class)
    public void testThatSetCode5letters3NumbersIsError(){
        String code = "WRWWW23";
        ipCamera.setCode(code);
    }
    @Test (expected = NullPointerException.class)
    public void testThatSetCodeTwoVocalsisError(){
        String code = "WRWW123";
        ipCamera.setCode(code);
    }
    @Test (expected = NullPointerException.class)
    public void testThatSetCodeTwoVocalsIsError(){
        String code = "AEAE123";
        ipCamera.setCode(code);
    }
    @Test (expected = NullPointerException.class)
    public void testThatSetCodeTwoRepeatedConsonantsIsError(){
        String code = "FFAE123";
        ipCamera.setCode(code);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetCodeTwoRepeatedNumbersIsError(){
        String code = "FFAE122";
        ipCamera.setCode(code);
    }
}
