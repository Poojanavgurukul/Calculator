package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void shouldReturnSumOfTwoNumbers() {
       // arrangement
        Calculator calculator=new Calculator();

        //action
        int actualSum = calculator.add(1, 2);

        //assertion
        assertEquals(3, actualSum);
    }
}
