package ru.aaromanov1985.codewars.kata;

public class BitCounting {

    /**
     * Write a function that takes an integer as input,
     * and returns the number of bits that are equal to one
     * in the binary representation of that number.
     * You can guarantee that input is non-negative.
     * <p>
     * Example: The binary representation of 1234 is 10011010010,
     * so the function should return 5 in this case
     */
    public static int countBits(int n) {
        return Integer.bitCount(n);
    }

    public static int countBitsVer2(int n) {
        int ret = n % 2;
        while ((n /= 2) > 0) ret += n % 2;
        return ret;
    }

    public static int countBitsVer3(int n) {
        return (int) Integer.toBinaryString(n).chars()
                .filter(c -> c == '1')
                .count();
    }

    public static int countBitsVer4(int n) {
        int i = 0;

        for (int j = n; j > 0; j >>= 1) {
            i += j & 1;
        }

        return i;
    }
}