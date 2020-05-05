package com.uniacc.unit2.test;
import com.uniacc.unit2.main.Television;
import org.junit.*;
import static org.junit.Assert.*;

public class TelevisionPriceShould {
    static com.uniacc.unit2.main.Television television;
    @Before
    public void before(){
        television = new Television();
    }
    @Test
    public void testTelevisionSetPriceIsPassed(){
        float price = 100;
        television.setPrice(price);
        assertEquals(television.getPrice(),price,0);
    }
    @Test (expected = NullPointerException.class)
    public void testTelevisionSetPriceWithLessNegativeIsError(){
        float price = -1;
        television.setPrice(price);
    }
    @Test (expected = NullPointerException.class)
    public void testTelevisionSetPriceWithGreater1000IsError(){
        float price = 1001;
        television.setPrice(price);
    }
}
