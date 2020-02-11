package calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class Calculator {
    @Test
    void 덧셈(){
        int result = StringCalculator.calculate("1 + 2");
        assertThat(result).isEqualTo(3);

        result = StringCalculator.calculate("2 + 3");
        assertThat(result).isEqualTo(5);
    }

    @Test
    void 뺄셈(){
        int result = StringCalculator.calculate("2 - 1");
        assertThat(result).isEqualTo(1);

        result = StringCalculator.calculate("6 - 3");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void 입력값이_null_또는_빈문자열(){
        assertThatThrownBy(()->StringCalculator.calculate(null))
                .isInstanceOf(IllegalStateException.class);

        assertThatThrownBy(()->StringCalculator.calculate(""))
                .isInstanceOf(IllegalStateException.class);
    }
}
