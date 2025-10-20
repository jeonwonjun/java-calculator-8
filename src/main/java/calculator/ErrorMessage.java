package calculator;

public class ErrorMessage {

    // 음수 입력 시
    public static final String NEGATIVE_NUBER = "양수만 입력 가능합니다.";

    // 0 포함 시
    public static final String INVALID_ZERO = "0은 정수가 아닙니다.";

    // 숫자 이외의 잘못된 값 포함 시(문자 등)
    public static final String INVALID_INT = "유효한 입력값이 아닙니다.";

    // 잘못된 커스텀 구분자 사용
    public static final String WRONG_DELIMITER_FORMAT = "잘못된 구분자 형식입니다.";

    // 숫자를 커스텀 구분자로 사용
    public static final String DELIMITER_FORMAT_DIGIT = "숫자는 구분자로 사용할 수 없습니다.";

    // 정수 범위를 초과
    public static final String INTEGER_OVERFLOW = "정수 범위를 초과했습니다.";
}
