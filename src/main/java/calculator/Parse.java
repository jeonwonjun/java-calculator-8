package calculator;

import java.util.Objects;

public class Parse {
    public static String[] inputParse(String input) {
        String customDelimiter = GetDelimiter.getDelimiter(input);

        if (Objects.equals(customDelimiter, "\\")) {
            input = input.replaceFirst("//\\\\\\\\n", "");
            return input.split("[,:\\\\]+");
        }

        // 올바른 구분자 존재시
        if (customDelimiter != null) {

            input = GetDelimiter.removeCustomCondition(input, customDelimiter);
            return input.split("[,:" + customDelimiter + "]+");
        }
        return input.split("[,:]+");
    }
}
