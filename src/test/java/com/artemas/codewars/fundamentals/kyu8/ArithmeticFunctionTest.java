package com.artemas.codewars.fundamentals.kyu8;

import com.artemas.codewars.fundamentals.ArithmeticFunction;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Artemas on 14/09/2017.
 */
public class ArithmeticFunctionTest {

    @Test
    public void testBasic() {
        Assert.assertEquals("'add' should return the two numbers added together!", 3, ArithmeticFunction.arithmetic(1, 2, "add"));
        assertEquals("'subtract' should return a mimus b!", 6, ArithmeticFunction.arithmetic(8, 2, "subtract"));
        assertEquals("'multiply' should return a multiplied by b!", 10, ArithmeticFunction.arithmetic(5, 2, "multiply"));
        assertEquals("'divide' should return a divided by b!", 4, ArithmeticFunction.arithmetic(8, 2, "divide"));
    }

}
