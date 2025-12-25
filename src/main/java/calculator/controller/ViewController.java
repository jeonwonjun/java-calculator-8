package calculator.controller;

import calculator.view.InputHandler;
import calculator.view.OutputHandler;

public class ViewController {

    public String readInput() {
        System.out.println("덧셈할 문자열을 입력해 주세요.");
        return InputHandler.read();
    }

    public void printOutput(int result) {
        OutputHandler.printResult(result);
    }
}
