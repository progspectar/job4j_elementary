package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionCalculatorTest {
    private int start;
    private int end;
    private FunctionCalculator function = new FunctionCalculator();

    @Test
    public void whenLinearFunctionThenLinearResults() {
        Function<Double, Double> linear = (Double v) -> 2 * v + 1;
        List<Double> result = function.diapason(5, 8, linear);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        Function<Double, Double> quadratic = (Double v) -> v * v;
        List<Double> result = function.diapason(1, 6, quadratic);
        List<Double> expected = Arrays.asList(1D, 4D, 9D, 16D, 25D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenPowFunctionThenPowResults() {
        Function<Double, Double> pow = (Double v) -> Math.pow(v, 3);
        List<Double> result = function.diapason(1, 6, pow);
        List<Double> expected = Arrays.asList(1D, 8D, 27D, 64D, 125D);
        assertThat(result).containsAll(expected);
    }
}