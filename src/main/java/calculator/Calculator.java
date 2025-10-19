package calculator;

import java.util.Objects;

public class Calculator {
    public static int add(String input) {
        if (input.isEmpty()) {
            return 0;
        }
        String[] numbers = Parse.inputParse(input);
        int sum = 0;

        for (String numberString : numbers) {
            sum += Integer.parseInt(numberString);
        }

        return sum;
    }
}
