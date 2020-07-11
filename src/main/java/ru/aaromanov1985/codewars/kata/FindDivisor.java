package ru.aaromanov1985.codewars.kata;

import java.util.stream.IntStream;

public class FindDivisor {

    public long numberOfDivisors(int n) {
        int result = 0;
        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                result++;            }
        }
        return result;
    }

    public long numberOfDivisorsStream(int n) {
        return IntStream.range(1, n+1).filter(i -> n%i==0).count();
    }

}