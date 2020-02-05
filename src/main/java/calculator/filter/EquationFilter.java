package calculator.filter;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class EquationFilter {

    private static final String NUMBER_FORMAT = "\\d+";

    public static List<Double> getNumbers(List<String> input) {
        return input.stream()
                .filter(EquationFilter::isNumber)
                .map(Double::parseDouble)
                .collect(toList());
    }

    public static List<String> getOperators(List<String> input) {
        return input.stream()
                .filter(EquationFilter::isNotNumber)
                .collect(toList());
    }

    private static boolean isNotNumber(String maybeNumber) {
        return !isNumber(maybeNumber);
    }

    private static boolean isNumber(String maybeNumber) {
        return maybeNumber.matches(NUMBER_FORMAT);
    }
}
