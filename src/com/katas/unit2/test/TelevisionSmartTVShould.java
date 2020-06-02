package com.katas.unit2.test;
import com.katas.unit2.main.Television;
import org.junit.*;
import static org.junit.Assert.*;

public class TelevisionSmartTVShould {
    static com.katas.unit2.main.Television television;
    @Before
    public void before(){
        television = new Television();
    }

    @Test
    public void testTelevisionSetSmartTvYesIsPassed(){
        String option = "S";
        television.setSmartTv(option);
        assertTrue(television.getSmartTV());
    }
    @Test
    public void testTelevisionSetSmartTvNoIsPassed(){
        String option = "N";
        television.setSmartTv(option);
        assertFalse(television.getSmartTV());
    }
    @Test (expected = NullPointerException.class)
    public void testTelevisionSetSmartTvIsError(){
        String option = "ASDSD";
        television.setSmartTv(option);
    }
}
