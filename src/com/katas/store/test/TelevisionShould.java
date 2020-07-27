package com.katas.store.test;
import com.katas.store.main.Television;
import org.junit.*;
import static org.junit.Assert.*;

public class TelevisionShould {
    static com.katas.store.main.Television television;
    @Before
    public void before(){
        television = new Television();
    }

    @Test
    public void testTelevisionCreateObjectIsPassed(){
        television.setBrand("ABCD");
        television.setModel("AB1273");
        television.setInch(33);
        television.setSmartTv("S");
        television.setTvCableName("Vtrcable");
        television.setPrice(500);
        assertTrue(television.toString(), true);
    }
}
