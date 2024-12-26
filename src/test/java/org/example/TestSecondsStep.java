package org.example;

import org.example.first_step.*;
import org.example.second_step.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestSecondsStep {

    @Test
    public void testSumFunctional() {
        task_1 test = new task_1(2, 3, 0, 10);
        sumFunctional<task_1> sumFunctional_test = new sumFunctional<>();
        assertEquals(39.0,
                sumFunctional_test.calculate(test),
                0.1,
                "Сумма значений функции должна быть 66.0");
    }

    @Test
    public void testIntegralFunctional() {
        task_1 test = new task_1(2, 3, 0, 10);
        integralFunctional<task_1> integralFunctional_test = new integralFunctional<>(0, 10, 1000);
        assertEquals(
                130.0,
                integralFunctional_test.calculate(test),
                "Интеграл функции должен быть 130.0"
        );
    }

    @Test
    public void testIntegralFunctionalOutOfBounds() {
        task_1 test = new task_1(2, 3, 5, 15);
        integralFunctional<task_1> integralFunctional_test = new integralFunctional<>(0, 10, 1000);
        assertThrows(IllegalArgumentException.class, () ->
                        integralFunctional_test.calculate(test),
                "Должно быть исключение, если [a; b] не содержится в области определения функции"
        );
    }
}
