package calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetDelimiter {

    public static Pattern pattern = Pattern.compile("//(.+?)\\\\n");

    // 구분자 구하기
    public static String getDelimiter(String input) {

        Matcher matcher = pattern.matcher(input);

        if (matcher.find()) {
            return matcher.group(1);
        }

        return null;
    }

    // 구분자 조건 제거
    public static String removeCustomCondition(String input, String customDelimiter) {
        if (ishasCustomDelimiter(input)) {
            input = input.replaceFirst("//" + customDelimiter + "\\\\n", "");
        }

        return input;
    }

    // 구분자가 존재하는가
    public static boolean ishasCustomDelimiter(String input) {
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            return true;
        }

        return false;
    }

}
