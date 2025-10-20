package calculator;

public class Parse {
    public static String[] inputParse(String input) {
        String customDelimiter = GetDelimiter.getDelimiter(input);

        // 올바른 구분자 존재시
        if (customDelimiter != null) {

            input = GetDelimiter.removeCustomCondition(input, customDelimiter);
            return input.split("[,:" + customDelimiter + "]+");
        }
        return input.split("[,:]+");
    }
}
