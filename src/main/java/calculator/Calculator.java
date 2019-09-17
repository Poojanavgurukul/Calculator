package calculator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public double divide(int number1, int number2) {
        return number1 / number2;
    }

    public double squareRoot(int number) {
        return Math.sqrt(number);
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

    public static String solveEquation(String finalStr) {

        while (finalStr.contains("(") && finalStr.contains(")")) {
            int fIndex = finalStr.indexOf("(");
            int nIndex = finalStr.indexOf(")");
            String subString = finalStr.substring(fIndex + 1, nIndex);
            finalStr = finalStr.substring(0, fIndex)
                    + calculate(subString)
                    + finalStr.substring(nIndex + 1);
        }
        return calculate(finalStr);

    }

    public static String calculate(String finalString) {

        while (finalString.contains("(") && finalString.contains(")")) {
            solveEquation(finalString);
        }
        while (!isNum(finalString)) {
            List<Integer> positions = getOperandPosition(finalString);
            int pos = positions.get(0);
            if (positions.size() >= 2 && positions.get(1) != null) {
                int nxtPos = positions.get(1);
                finalString = getValue(finalString.substring(0, nxtPos), pos)
                        + finalString.substring(nxtPos);
            } else {
                finalString = getValue(
                        finalString, pos);
            }
        }
        return finalString;

    }

    public static boolean isNum(String str) {
        if (str.contains("+") || str.contains("-") || str.contains("*")
                || str.contains("/")) {
            return false;
        }
        return true;
    }

    public static List<Integer> getOperandPosition(String str) {

        List<Integer> integers = new ArrayList<Integer>();

        if (str.contains("+")) {
            integers.add(str.indexOf("+"));
        }

        if (str.contains("-")) {
            integers.add(str.indexOf("-"));
        }

        if (str.contains("*")) {
            integers.add(str.indexOf("*"));
        }

        if (str.contains("/")) {
            integers.add(str.indexOf("/"));
        }

        Collections.sort(integers);
        return integers;
    }

    public static String getValue(String str, int pos) {
        double finalVal = 0;
        double a = Double.parseDouble(str.substring(0, pos));
        double b = Double.parseDouble(str.substring(pos + 1, str.length()));
        char c = str.charAt(pos);

        if (c == '*') {
            finalVal = a * b;
        } else if (c == '/') {
            finalVal = a / b;
        } else if (c == '+') {
            finalVal = a + b;
        } else if (c == '-') {
            finalVal = a - b;
        }
        return String.valueOf(finalVal);
    }
}
