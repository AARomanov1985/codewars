package ru.aaromanov1985.codewars.kata;

/**
 * Two tortoises named A and B must run a race. A starts with an average speed of 720 feet per hour.
 * Young B knows she runs faster than A, and furthermore has not finished her cabbage.
 * <p>
 * When she starts, at last, she can see that A has a 70 feet lead but B's speed is 850 feet per hour.
 * How long will it take B to catch A?
 * <p>
 * More generally: given two speeds v1 (A's speed, integer > 0) and v2 (B's speed, integer > 0) and
 * a lead g (integer > 0) how long will it take B to catch A?
 * <p>
 * The result will be an array [hour, min, sec] which is the time needed in hours, minutes and seconds
 * (round down to the nearest second) or a string in some languages.
 * <p>
 * If v1 >= v2 then return nil, nothing, null, None or {-1, -1, -1} for C++, C, Go, Nim, [] for Kotlin or "-1 -1 -1".
 * Examples:
 * <p>
 * (form of the result depends on the language)
 * <p>
 * race(720, 850, 70) => [0, 32, 18] or "0 32 18"
 * race(80, 91, 37)   => [3, 21, 49] or "3 21 49"
 * <p>
 * ** Note:
 * <p>
 * See other examples in "Your test cases".
 * <p>
 * In Fortran - as in any other language - the returned string is not permitted to contain any redundant trailing
 * whitespace: you can use dynamically allocated character strings.
 * <p>
 * ** Hints for people who don't know how to convert to hours, minutes, seconds:
 * <p>
 * Tortoises don't care about fractions of seconds
 * <p>
 * Think of calculation by hand using only integers (in your code use or simulate integer division)
 * <p>
 * or Google: "convert decimal time to hours minutes seconds"
 */
public class Tortoise {
    public static int[] race(int v1, int v2, int g) {
        if (v1 >= v2) {
            return null;
        }
        int speed = (v2 - v1);
        int time = g * 3600 / speed;
        int hours = time / 3600;
        int minutes = (time - hours * 3600) / 60;
        int seconds = time % 60;
        return new int[]{hours, minutes, seconds};
    }

    public static int[] raceOptimal(int v1, int v2, int g) {
        if (v1 >= v2) return null;
        int t = 3600 * g / (v2 - v1);
        return new int[]{t / 3600, t % 3600 / 60, t % 60};
    }

    public static int[] raceOptimal2(int v1, int v2, int g) {
        if (v1 >= v2) return null;
        int[] ary = new int[3];
        int time = (int) (((double) (g) / (v2 - v1)) * 3600);
        ary[0] = time / 3600;
        ary[1] = time % 3600 / 60;
        ary[2] = time % 3600 % 60 % 60;
        return ary;
    }
}
