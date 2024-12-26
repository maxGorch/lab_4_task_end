package org.example.second_step;

import org.example.first_step.forOneVariableOf_R;

public class integralFunctional<T extends forOneVariableOf_R> implements functionalInterface<T> {
    public double a, b; // Верхний предел интегрирования
    public int numberOfIntervals; // Количество разбиений

    public integralFunctional(double a, double b, int numberOfIntervals) {
        if (a >= b) {
            throw new IllegalArgumentException("Нижний предел должен быть меньше верхнего.");
        }
        if (numberOfIntervals <= 0) {
            throw new IllegalArgumentException("Количество разбиений должно быть больше 0.");
        }
        this.a = a;
        this.b = b;
        this.numberOfIntervals = numberOfIntervals;
    }

    @Override
    public double calculate(T function) {
        // Проверяем, содержится ли [a; b] в области определения функции
        if (a < function.getLLine() || b > function.getULine()) {
            throw new IllegalArgumentException("Область определения функции не содержит отрезок интегрирования.");
        }

        double step = (b - a) / numberOfIntervals; // Шаг разбиения
        double sum = 0;

        for (int i = 0; i < numberOfIntervals; i++) {
            double x = a + i * step + step / 2; // Точка в середине прямоугольника
            sum += function.evaluate(x) * step; // Площадь прямоугольника
        }
        return sum;
    }
}

