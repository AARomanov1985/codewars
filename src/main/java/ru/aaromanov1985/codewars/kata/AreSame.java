package ru.aaromanov1985.codewars.kata;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        if (a == null && b == null || a.length == 0 && b.length == 0) {
            return true;
        }

        for (int x : b) {
            boolean isFound = false;
            for (int y : a) {
                if ((Math.sqrt(x) == y)) {
                    isFound = true;
                    break;
                }
            }
            if (isFound == false) {
                return false;
            }
        }
        return true;
    }
}
