package ru.aaromanov1985.codewars.kata;

import java.util.*;

/**
 * Your task is to make a function that can take any non-negative integer as a argument and return
 * it with its digits in descending order. Essentially, rearrange the digits to create the highest
 * possible number.
 * Examples:
 * <p>
 * Input: 42145 Output: 54421
 * <p>
 * Input: 145263 Output: 654321
 * <p>
 * Input: 123456789 Output: 987654321
 */
public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());
        return Integer.valueOf(String.join("", array));
    }
}