package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void shouldReturnSumOfTwoNumbers() {
        double actualSum = calculator.add(1, 2).getResult();

        assertEquals(3, actualSum,1);
    }

    @Test
    public void shouldReturnSumOfThreeNumbers() {
        double actualSum = calculator.add(1, 2).add(3).getResult();
        assertEquals(6, actualSum,1);
    }

    @Test
    public void shouldReturnSubtractionOfTwoNumbers() {
        double actualSubtraction = calculator.subtract(3, 1).getResult();
        assertEquals(2, actualSubtraction,1);
    }

    @Test
    public void shouldReturnMultiplicationOfTwoNumbers() {
        double actualMultiplication = calculator.multiply(3, 2).getResult();
        assertEquals(6, actualMultiplication,1);
    }

    @Test
    public void shouldReturnDivisionOfTwoNumbers() {
        double actualDivision = calculator.divide(4, 2);
        assertEquals(2, actualDivision,1);
    }

    @Test
    public void shouldReturnSquareRoot() {
        double actualSquareRoot = calculator.squareRoot(4);
        assertEquals(2, actualSquareRoot,1);
    }

    @Test
    public void shouldGiveTheResultOfAddAndSubtractTogether() {
        double actualResult = calculator.add(2, 3).subtract(2).getResult();
        assertEquals(3, actualResult,1);
    }

    @Test
    public void shouldGiveTheResultOfMultipleOperationTogether() {
        double actualResult = calculator.add(2, 3).subtract(2).multiply(3).getResult();
        assertEquals(9, actualResult,1);
    }

    @Test
    public void shouldReturnTheAnswerOfEquation() {
        double actualResult = Double.parseDouble(calculator.solveEquation("(10+3)+(19-4)/7"));
        assertEquals(4, actualResult, 1);
    }
}
