package com.uniacc.demo.test;
import com.uniacc.demo.main.Calculadora;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)

public class CalculadoraParametroTest {

    @Parameterized.Parameters
    public static Iterable<Object[]> getData(){
//        List<Object[]> obj = new ArrayList<>();
//        obj.add(new Object[]{3,1,4});
//        obj.add(new Object[]{5,1,6});
//        return obj;
            return Arrays.asList(new Object[][]{
                    {3,1,4}, {2,3,5}
            });
    }

    private int a,b,exp;

    public  CalculadoraParametroTest(int a,int b,int exp){
        this.a = a;
        this.b = b;
        this.exp = exp;
    }

    @Test
    public void testAdd(){
        Calculadora calc = new Calculadora();
        int result = calc.add(a,b);
        assertEquals(exp,result);
    }

}
