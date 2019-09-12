package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void shouldReturnSumOfTwoNumbers() {
        int actualSum = calculator.add(1, 2);

        assertEquals(3, actualSum);
    }

    @Test
    public void shouldReturnSumOfThreeNumbers() {
        //int actualSum = calculator.add(1, 2).add(3).s.getResult();
        int actualSum = calculator.add(1, 2);
        assertEquals(6, actualSum);
    }

    @Test
    public void shouldReturnSubtractionOfTwoNumbers() {
        int actualSubtraction = calculator.subtract(3, 1);
        assertEquals(2, actualSubtraction);
    }

    @Test
    public void shouldReturnMultiplicationOfTwoNumbers() {
        int actualMultiplication = calculator.multiplication(3, 2);
        assertEquals(6, actualMultiplication);
    }

    @Test
    public void shouldReturnDivisionOfTwoNumbers() {
        int actualDivision = calculator.divide(4, 2);
        assertEquals(2, actualDivision);
    }

    @Test public void shouldReturnSquareRoot(){
        int actualSquareRoot=calculator.squareRoot(4);
        assertEquals(2,actualSquareRoot);
    }
}
