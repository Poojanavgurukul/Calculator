package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator=new Calculator();

    @Test
    public void shouldReturnSumOfTwoNumbers() {
        int actualSum = calculator.add(1, 2);

        assertEquals(3, actualSum);
    }
    @Test public void shouldReturnSubtractionOfTwoNumbers(){
        int actualSubtraction=calculator.subtraction(3,1);
        assertEquals(2,actualSubtraction);
    }
}
