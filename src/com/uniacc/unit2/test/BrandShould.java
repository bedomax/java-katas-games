package com.uniacc.unit2.test;
import com.uniacc.unit2.main.Brand;
import org.junit.*;
import static org.junit.Assert.*;

public class BrandShould {
    static Brand brand;

    @Before
    public void before(){
        brand = new Brand();
    }

    @Test
    public void testThatSetNameInBrandIsPassed(){
        String name = "ABCD";
        brand.setName(name);
        assertEquals(brand.getName(), name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameInBrandWithNumbersIsError(){
        String name = "As3D";
        brand.setName(name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameInBrandWithRepeatLettersIsError(){
        String name = "ASDD";
        brand.setName(name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameInBrandWithMore4Chars(){
        String name = "ASDDRTTT";
        brand.setName(name);
    }

    @Test (expected = NullPointerException.class)
    public void testThatSetNameLess4Chars(){
        String name = "ASD";
        brand.setName(name);
    }

}
