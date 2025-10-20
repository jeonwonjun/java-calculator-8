package calculator;

public class DelimiterValidation {

    // 커스텀 구분자가 존재하는가

    // 구분자 형식이 잘못 되었을 때
    public static void validateCustomDlimiterFormat(String input) {
        input = input.replaceAll("\\s", "");
        // 구분자 형식이 잘못 사용되었을 때
        if (!input.startsWith("//") || !input.contains("\\n")) {
            throw new IllegalArgumentException(ErrorMessage.WRONG_DELIMITER_FORMAT);
        }
    }

    // 커스텀 구분자 유효성 검사
    public static void validateCustomDelimiter(String customDelimiter) {

        // 구분자가 없을 때
        if (customDelimiter.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.EMPTY_CUSTOM_DELIMITER);
        }

        // 커스텀 구분자의 길이가 1보다 클 때
        if (customDelimiter.length() > 2) {
            throw new IllegalArgumentException(ErrorMessage.WRONG_CUSTOM_DELIMITER_LENGTH);
        }

        // 음수 기호(-) 커스텀 구분자로 입력 시
        if ("-".equals(customDelimiter)) {
            throw new IllegalArgumentException(ErrorMessage.NEGATIVE_SIGN_NOT_ALLOW);
        }

        // 숫자 구분자 입력 시
        if (customDelimiter.matches("\\d")) {
            throw new IllegalArgumentException(ErrorMessage.DIGIT_NOT_ALLOW);
        }
    }
}
