package ru.aaromanov1985.codewars.kata;

import java.util.Arrays;

public class CountingDuplicates {
    public static long duplicateCount(String text) {
        String s = text.toLowerCase();
        return Arrays.stream(s.split(""))
                .filter(c -> (s.indexOf(c) != s.lastIndexOf(c)))
                .distinct()
                .count();
    }
}
