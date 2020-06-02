package com.katas.unit2.test;
import com.katas.unit2.main.Television;
import org.junit.*;
import static org.junit.Assert.*;

public class TelevisionTvCableShould {
    static com.katas.unit2.main.Television television;
    @Before
    public void before(){
        television = new Television();
    }

    @Test
    public void testTelevisionSetTvCableNameIsPassed(){
        String name = "Vtrcable";
        television.setTvCableName(name);
        assertEquals(television.getTvCableName(),name);
    }

    @Test (expected = NullPointerException.class)
    public void testTelevisionSetTvCableNameWithoutCapitalizeIsError(){
        String name = "vtrcable";
        television.setTvCableName(name);
    }
    @Test (expected = NullPointerException.class)
    public void testTelevisionSetTvCableNameMore8CharIsError(){
        String name = "Vtrcable compania";
        television.setTvCableName(name);
    }
}
