package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionCalculatorTest {
    private int start;
    private int end;
    private FunctionCalculator function = new FunctionCalculator();

    private void initialize(int s, int e, FunctionCalculator f) {
        this.start = s;
        this.end = e;
        this.function = f;
    }

    @Test
    public void whenLinearFunctionThenLinearResults() {
        initialize(5, 8, new FunctionCalculator());
        List<Double> result = function.diapason(start, end, function.linear);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenQuadraticFunctionThenQuadraticResults() {
        initialize(1, 6, new FunctionCalculator());
        List<Double> result = function.diapason(start, end, function.quadratic);
        List<Double> expected = Arrays.asList(1D, 4D, 9D, 16D, 25D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenPowFunctionThenPowResults() {
        initialize(1, 6, new FunctionCalculator());
        List<Double> result = function.diapason(start, end, function.pow);
        List<Double> expected = Arrays.asList(1D, 8D, 27D, 64D, 125D);
        assertThat(result).containsAll(expected);
    }
}