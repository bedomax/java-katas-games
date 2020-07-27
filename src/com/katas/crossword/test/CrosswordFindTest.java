package com.katas.crossword.test;

import com.katas.crossword.main.Crossword;
import org.junit.*;
import static org.junit.Assert.*;

public class CrosswordFindTest {
    static Crossword crossword;
    @Before
    public void before(){
        crossword = new Crossword();
    }
    @Test
    public void testThatFindManzanaIsPassed(){
        String name = "MANZANA";
        crossword.process(name);
        assertEquals(true, crossword.isPresent());
    }
    @Test
    public void testThatFindManzanaIsFailed(){
        String name = "BEDO";
        crossword.process(name);
        assertEquals(false, crossword.isPresent());
    }
    @Test
    public void testThatFirstPositionPassed(){
        String name = "MANZANA";
        crossword.process(name);
        assertEquals("[2,0]", crossword.getFirstPositionArray());
    }
    @Test
    public void testThatLastPositionPassed(){
        String name = "MANZANA";
        crossword.process(name);
        assertEquals("[2,6]", crossword.getLastPositionArray());
    }
}
