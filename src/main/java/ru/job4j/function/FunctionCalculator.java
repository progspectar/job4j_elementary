package ru.job4j.function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionCalculator {
    public final Function<Double, Double> linear = (Double v) -> 2 * v + 1;
    public final Function<Double, Double> quadratic = (Double v) -> v * v;
    public final Function<Double, Double> pow = (Double v) -> Math.pow(v, 3);

    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> res = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            res.add(func.apply((double) i));
        }
        return res;
    }
}