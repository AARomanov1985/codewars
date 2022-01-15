package ru.aaromanov1985.interview.booking.exercise;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TaskRectangleTest {

    private TaskRectangle instance = new TaskRectangle();

    @Test
    public void case1() {
        // given
        int A = 1;
        int B = 1;
        int C = 2;
        int D = 2;

        // when
        int result = instance.solve(A, B, C, D);

        // then
        assertTrue(result == 1);
    }

    @Test
    public void case2() {
        // given
        int A = 1;
        int B = 1;
        int C = 1;
        int D = 2;

        // when
        int result = instance.solve(A, B, C, D);

        // then
        assertTrue(result == 0);
    }

}