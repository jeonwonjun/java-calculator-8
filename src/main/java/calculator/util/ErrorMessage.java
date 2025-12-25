package calculator.util;

public enum ErrorMessage {
    NEGATIVE_NUMBER("양수만 입력 가능합니다."),
    INVALID_ZERO("0은 정수가 아닙니다."),
    INVALID_FORMAT("유효한 입력형식이 아닙니다."),
    INVALID_DELIMITER_FORMAT("잘못된 구분자 형식입니다."),
    EMPTY_CUSTOM_DELIMITER("커스텀 구분자가 공백입니다."),
    INVALID_CUSTOM_DELIMITER_LENGTH("커스텀 구분자가 한 글자 이상입니다."),
    DIGIT_NOT_ALLOWED("숫자는 구분자로 사용할 수 없습니다."),
    INTEGER_OVERFLOW("정수 범위를 초과했습니다."),
    INVALID_NEGATIVE_SIGN("음수 부호는 구분자로 사용할 수 없습니다.");

    private final String message;
    private static final String ERROR_FORMAT = "[ERROR] %s";
    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return String.format(ERROR_FORMAT, message);
    }
}
