package calculator;

public class Output {

    // 에러 메시지 출력
    public static void printError(String error) {
        System.out.println(error);
    }

    // 결과 값 출력
    public static void output(double result) {
        // 정수인 경우 소수점 없이 출력
        if (result == (int) result) {
            System.out.println("결과 : " + (int) result);
            return;
        }

        System.out.println("결과 : " + result);
    }
}
