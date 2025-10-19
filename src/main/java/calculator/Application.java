package calculator;


import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        int result;
        // 1. 문자열 입력받기
        String input = Input.input();
        // 2. 커스텀 구분자 구하기
        String customDelimiter = GetDelimiter.getDelimiter(input);
        input = GetDelimiter.removeCustomCondition(input, customDelimiter);
        System.out.println(input);
    }
}
