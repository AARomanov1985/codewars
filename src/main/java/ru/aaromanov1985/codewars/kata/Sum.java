package ru.aaromanov1985.codewars.kata;

import java.util.stream.IntStream;

/**
 * Given two integers a and b, which can be positive or negative, find the sum of all the numbers between including
 * them too and return it. If the two numbers are equal return a or b.
 * <p>
 * Note: a and b are not ordered!
 * Examples
 * <p>
 * GetSum(1, 0) == 1   // 1 + 0 = 1
 * GetSum(1, 2) == 3   // 1 + 2 = 3
 * GetSum(0, 1) == 1   // 0 + 1 = 1
 * GetSum(1, 1) == 1   // 1 Since both are same
 * GetSum(-1, 0) == -1 // -1 + 0 = -1
 * GetSum(-1, 2) == 2  // -1 + 0 + 1 + 2 = 2
 */
public class Sum {
    public int GetSum(int a, int b) {
        return IntStream.range(Math.min(a, b), Math.max(a, b) + 1).sum();
    }

    public int simplest(int a, int b) {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}