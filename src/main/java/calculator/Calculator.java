package calculator;

public class Calculator {
    private int finalResult = 0;

    public Calculator add(int number1, int number2) {
        this.finalResult = number1 + number2;
        return this;
    }

    public Calculator subtract(int number1, int number2) {
        this.finalResult = number1 - number2;
        return this;
    }

    public Calculator multiply(int number1, int number2) {
        this.finalResult = number1 * number2;
        return this;
    }

    public int divide(int number1, int number2) {
        return number1 / number2;
    }

    public int squareRoot(int number) {
        return (int) Math.sqrt(number);
    }

    public Calculator add(int number) {
        this.finalResult = finalResult + number;
        return this;
    }

    public Calculator subtract(int number) {
        this.finalResult = finalResult - number;
        return this;
    }

    public Calculator multiply(int number) {
        this.finalResult = finalResult * number;
        return this;
    }

    public int getResult() {
        return this.finalResult;
    }
}
