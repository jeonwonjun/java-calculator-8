package calculator;

public class InputValidation {

    // 양수가 아닐 시 예외
    public static void validateNumber(double number) {
        if (number < 0) {
            throw new IllegalArgumentException(
                    ErrorMessage.NEGATIVE_NUBER + number);
        }
    }

    // 숫자 범위가 INT범위를 초과할 시 예외
    public static void validateOverFlow(double number) {
        try {
            if (number > Integer.MAX_VALUE) {
                throw new IllegalArgumentException(ErrorMessage.INTEGER_OVERFLOW);
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INT);
        }
    }

    // 커스텀 구분자 유효성 검사
    public static void validateCustomDelimiter(String customDelimiter) {
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
