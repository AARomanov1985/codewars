package ru.aaromanov1985.interview.booking.exercise;

public class TaskRectangle {
    public int solve(int A, int B, int C, int D) {
        if (A == B && C == D) {
            return 1;
        } else if (A == C && B == D) {
            return 1;
        } else if (A == D && B == C) {
            return 1;
        } else {
            return 0;
        }
    }
}
