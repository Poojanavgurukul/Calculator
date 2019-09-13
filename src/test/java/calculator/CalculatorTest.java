package calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void shouldReturnSumOfTwoNumbers() {
        int actualSum = calculator.add(1, 2).getResult();

        assertEquals(3, actualSum);
    }

    @Test
    public void shouldReturnSumOfThreeNumbers() {
        int actualSum = calculator.add(1, 2).add(3).getResult();
        assertEquals(6, actualSum);
    }

    @Test
    public void shouldReturnSubtractionOfTwoNumbers() {
        int actualSubtraction = calculator.subtract(3, 1).getResult();
        assertEquals(2, actualSubtraction);
    }

    @Test
    public void shouldReturnMultiplicationOfTwoNumbers() {
        int actualMultiplication = calculator.multiply(3, 2).getResult();
        assertEquals(6, actualMultiplication);
    }

    @Test
    public void shouldReturnDivisionOfTwoNumbers() {
        int actualDivision = calculator.divide(4, 2);
        assertEquals(2, actualDivision);
    }

    @Test
    public void shouldReturnSquareRoot() {
        int actualSquareRoot = calculator.squareRoot(4);
        assertEquals(2, actualSquareRoot);
    }

    @Test
    public void shouldGiveTheResultOfAddAndSubtractTogether() {
        int actualResult = calculator.add(2, 3).subtract(2).getResult();
        assertEquals(3, actualResult);
    }

   /* @Test
    public void solveIt() {
//        ( 10 + 3) + ( 19 - 4 ) / 7 = 4
//        (10 / 20) / (10 - 10) = Error
        int actualResult = calculator.add(2, 3).subtract(2).getResult();
        assertEquals(3, actualResult);
    }*/

    @Test
    public void shouldGiveTheResultOfMultipleOperationTogether() {
        int actualResult = calculator.add(2, 3).subtract(2).multiply(3).getResult();
        assertEquals(9, actualResult);
    }
    @Test public void shouldReturnTheAnswerOfEquation(){
        int actualResult=calculator.solveEquation("(10+3)+(19-4)/7");
        assertEquals(4,actualResult);
    }
}
