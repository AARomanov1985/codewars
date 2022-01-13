package ru.aaromanov1985.interview.booking.codetest;

import java.util.ArrayList;
import java.util.List;

public class Task1 {

    /*
     * Complete the 'multiple' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER x
     *  2. INTEGER y
     *  3. INTEGER z
     *  4. INTEGER n
     */

    public static List<Integer> multiple(int x, int y, int z, int n) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if ((isMultiple(i, x) || isMultiple(i, y)) && isNotMultiple(i, z)) {
                numbers.add(i);
            }
        }
        return numbers;
    }

    private static boolean isMultiple(int a, int b) {
        return b == 0 ? false : a % b == 0;
    }

    private static boolean isNotMultiple(int a, int b) {
        return b == 0 ? false : a % b > 0;
    }
}
