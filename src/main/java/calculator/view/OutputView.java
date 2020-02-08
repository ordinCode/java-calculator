package calculator.view;

public final class OutputView {
    public static void showResult(double result) {
        System.out.println("결과 : " + result);
    }

    public static void showErrorMessage(Exception message) {
        System.out.println(message);
    }
}
