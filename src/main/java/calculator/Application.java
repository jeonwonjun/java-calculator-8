package calculator;


public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현

        try {
            String input = Input.input();
            double result = Calculator.add(input);
            Output.output(result);
        } catch (IllegalArgumentException e) {
            Output.printError(e.getMessage());
            throw e;
        }


    }
}
