package ru.aaromanov1985.codewars.kata;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumTest{

    Sum s = new Sum();

    @Test
    public void Test1()
    {
        assertEquals(-1, s.GetSum(0, -1));
        assertEquals(1, s.GetSum(0, 1));
        assertEquals(-2, s.GetSum(-2, 1));
        assertEquals(-3, s.GetSum(-2, 0));
        assertEquals(-3, s.GetSum(-2, -1));
    }

}