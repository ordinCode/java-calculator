package calculator;

public class StringCalculator {
    public static int calculate(String value) {
        if (value == null){
            throw new IllegalStateException();
        }

        String[] values = value.split(" ");
        int first = Integer.valueOf(values[0]);
        int second = Integer.valueOf(values[2]);
        String operator = values[1];
        return calculate(first, second, operator);
    }

    private static int calculate(int first, int second, String operator) {
        if ("-".equals(operator)){
            return first - second;
        }
        return first + second;
    }
}
