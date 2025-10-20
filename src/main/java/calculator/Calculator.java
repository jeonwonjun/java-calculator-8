package calculator;

import java.util.Objects;

public class Calculator {
    public static double add(String input) {
        if (input.trim().isEmpty()) {
            return 0;
        }
        String[] numbers = Parse.inputParse(input);
        double sum = 0;

        for (String numberString : numbers) {
            double number = Double.parseDouble(numberString);
            InputValidation.validateNumber(number);
            sum += number;
            InputValidation.validateOverFlow(sum);
        }

        return sum;
    }

}
