package calculator;

public class InputValidation {
    // 문자열에 숫자, 구분자 이외의 문자가 존재

    // 문자열에 숫자와 구분자 이외의 문자가 존재하면 예외 발생
    public static void validateInput(String input) {
        String customDelimiter = GetDelimiter.getDelimiter(input);
        System.out.println(input);
        boolean isOkay = input.matches("[,:0-9" + customDelimiter + "]+");
        if (!isOkay) {
            throw new IllegalArgumentException("잘못된 문자열 입니다.");
        }

    }
}
