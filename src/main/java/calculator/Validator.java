package calculator;

public class Validator {

    // 구분자가 숫자일 경우
    public static boolean validateCustomDelimiterChar(String delimiter) {
//        String delimiter = GetDelimiter.getDelimiter(input);
        if (delimiter == null || delimiter.isEmpty()) {
            return false;
        }
        boolean isChar = delimiter.matches("[a-zA-Z]");
        return isChar;
    }

    // 구분자가 숫자일 경우
    public static boolean validateCustomDelimiterDigit(String delimiter) {
//        String delimiter = GetDelimiter.getDelimiter(input);
        if (delimiter == null || delimiter.isEmpty()) {
            return false;
        }
        boolean isDigit = delimiter.matches("\\d+");
        return isDigit;
    }

    // 구분자가 한글자인지 판별
    public static boolean validateCustomDelimiterLength(String delimiter) {
//        String delimiter = GetDelimiter.getDelimiter(input);
        if (delimiter == null) {
            return true;
        }

        return delimiter.length() == 1;
    }

    // 구분자 검증
    public static boolean validateInput(String input) {
        input = input.replaceAll("\\s+", "");

        if (!validateCustomDelimiterLength(input)) {
            System.out.println("커스텀 구분자가 한 글자가 아닙니다.");
            return false;
        }
        if (validateCustomDelimiterDigit(input)) {
            System.out.println("커스텀 구분자가 숫자입니다.");
            return false;
        }
        if (validateCustomDelimiterChar(input)) {
            System.out.println("커스텀 구분자가 문자입니다.");
            return false;
        }

        return true;
    }
}
