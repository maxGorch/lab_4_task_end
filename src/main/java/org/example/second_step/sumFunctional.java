package org.example.second_step;

import org.example.first_step.forOneVariableOf_R;

public class sumFunctional <T extends forOneVariableOf_R> implements functionalInterface<T>{

    @Override
    public double calculate(T function) {
        double a = function.getLLine();
        double b = function.getULine();
        double middle = (a + b) / 2.0;

        // Суммируем значения функции в трёх точках
        return function.evaluate(a) + function.evaluate(middle) + function.evaluate(b);
    }
}
