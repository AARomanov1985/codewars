package ru.aaromanov1985.codewars.kata;

public class Vowels {

    /**
     * Return the number (count) of vowels in the given string.
     *
     * We will consider a, e, i, o, and u as vowels for this Kata.
     *
     * The input string will only consist of lower case letters and/or spaces.
     */
    public static int getCount(String str) {
        return (int) str.chars().filter(c -> "aeiou".indexOf(c) >= 0).count();
    }
}
