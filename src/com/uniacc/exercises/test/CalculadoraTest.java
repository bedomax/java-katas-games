package com.uniacc.exercises.test;
import com.uniacc.exercises.main.Calculadora;
import org.junit.*;

import static org.junit.Assert.*;

public class CalculadoraTest {
    static Calculadora calc;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
        calc = new Calculadora();
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("After Class");
        calc.clear();
    }
//    @AfterClass


    @Before
    public  void before(){
        System.out.println("Before");
        calc = new Calculadora();
        calc.clear();
    }

    @After
    public  void after(){
        System.out.println("After");
    }


    @Test
    public void testSum() {
         int resul = calc.add(3,2);
        int esper = 5 ;
        assertEquals(esper,resul);
    }

    @Test
    public void testAnsSum() {
        calc.add(3,2);
        int resul = calc.ans();
        int esper = 5;
        assertEquals(esper,resul);
    }

    @Test
    public void testDiv(){
        calc.div(5,2);
    }

    @Test (expected = ArithmeticException.class)
    public void testDivPorCero(){
        calc.div(5,0);
    }

    @Test(timeout = 3000)
    public void testAlgoritmoOptimo(){
        calc.operacionOptima();
    }
}
