package calculator;

public class Parse {
    public static String[] inputParse(String input) {
        input = input.replaceAll("\\s", "");
        boolean validateCustomDelimiter = DelimiterValidation.validateCustomDelimiter(input);
        InputValidation.validateInput(input);

        // 올바른 구분자 존재시
        if (validateCustomDelimiter) {
            String customDelimiter = GetDelimiter.getDelimiter(input);
            input = GetDelimiter.removeCustomCondition(input, customDelimiter);
            return input.split("[,:" + customDelimiter + "+]");
        }
        return input.split("[,:+]");
    }
}
