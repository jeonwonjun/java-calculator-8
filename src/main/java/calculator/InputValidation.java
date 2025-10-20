package calculator;

public class InputValidation {

    // 숫자 이외의 값이 있을 시
    public static void validateInput(String token) {
        if (token.matches("\\D")) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_INT);
        }
    }

    // 양수가 아닐 시 예외
    public static void validateNumber(double number) {
        if (number <= 0) {
            throw new IllegalArgumentException(
                    ErrorMessage.NEGATIVE_NUBER);
        }
    }

    // 숫자 범위가 INT범위를 초과할 시 예외
    public static void validateOverFlow(double number) {
        if (number > Integer.MAX_VALUE) {
            throw new IllegalArgumentException(ErrorMessage.INTEGER_OVERFLOW);
        }
    }
}
