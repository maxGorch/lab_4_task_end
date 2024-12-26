package org.example;

import org.example.first_step.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFunction {

    @Test
    public void TestTask_1() {
        task_1 f = new task_1(2, 3, 0, 10);
        assertEquals(
                5.0,
                f.evaluate(1),
                "f(1) должно быть 2 * 1 + 3 = 5.0"
        );
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                f.evaluate(-1),
                "x вне границ"
        );
    }

    @Test
    public void TestTask_2() {
        task_2 f = new task_2(2, Math.PI, 0, 1);
        assertEquals(
                0.0,
                f.evaluate(0),
                "f(0) должно быть 2sin(0) = 0");
    }

    @Test
    public void TestTask_3() {
        task_3 f = new task_3(1, 2, 3, 4, 0, 10);
        assertEquals(
                0.5,
                f.evaluate(0),
                "f(0) должно быть (1*0 + 2) / (3*0 + 4) = 0.5");
    }

    @Test
    public void TestTask_4() {
        task_4 f = new task_4(2, 3, 0, 1);
        assertEquals(
                5.0,
                f.evaluate(0),
                "f(0) должно быть 2exp(0) + 3 = 5.0"
        );
    }
}
