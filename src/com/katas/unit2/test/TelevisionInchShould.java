package com.katas.unit2.test;
import com.katas.unit2.main.Television;
import org.junit.*;
import static org.junit.Assert.*;
public class TelevisionInchShould {
    static com.katas.unit2.main.Television television;
    @Before
    public void before(){
        television = new Television();
    }

    @Test
    public void testTelevisionSetInchIsPassed(){
        int num = 33;
        television.setInch(num);
        assertEquals(television.getInch(), num);
    }

    @Test (expected = NullPointerException.class)
    public void testTelevisionSetInchLesstThan32(){
        int num = 31;
        television.setInch(num);
        assertEquals(television.getInch(), num);
    }
    @Test (expected = NullPointerException.class)
    public void testTelevisionSetInchGreatertThan55(){
        int num = 55;
        television.setInch(num);
        assertEquals(television.getInch(), num);
    }
}
