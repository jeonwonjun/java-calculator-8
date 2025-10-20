package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Calculator {
    private static List<Double> numbers;

    public static double add(String input) {
        numbers = new ArrayList<>();
        if (input == null || input.trim().isEmpty()) {
            return 0.0;
        }

        String[] numberString = Parse.inputParse(input);
        StringToDoulbe(numberString);

        double sum = 0;
        for (double number : numbers) {
            sum += number;
            InputValidation.validateOverFlow(sum);
        }

        return sum;
    }

    // 문자열 제거하고 숫자로 바꾸기
    public static void StringToDoulbe(String[] tokens) {

        for (String numberString : tokens) {
            numberString = numberString.trim();
            InputValidation.validateInput(numberString);
            double number = Double.parseDouble(numberString);
            InputValidation.validateNumber(number);
            numbers.add(number);
        }
    }

}
