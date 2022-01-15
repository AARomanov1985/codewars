package ru.aaromanov1985.interview.booking.exercise;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TaskArraysTest {

    private TaskArrays instance = new TaskArrays();

    @Test
    public void case1() {
        // given
        List<Integer> A = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> B = Arrays.asList(2, 3);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3, 4, 5, 1, 2));
        expected.add(Arrays.asList(4, 5, 1, 2, 3));

        // when
        List<List<Integer>> result = instance.solve(A, B);

        // then
        assertEquals(expected, result);
    }

    @Test
    public void case2() {
        // given
        List<Integer> A = Arrays.asList(5, 17, 100, 11);
        List<Integer> B = Arrays.asList(1);
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(17, 100, 11, 5));

        // when
        List<List<Integer>> result = instance.solve(A, B);

        // then
        assertEquals(expected, result);
    }

}