package ru.aaromanov1985.interview.booking.exercise;

import java.util.ArrayList;
import java.util.List;

public class TaskArrays {

    /**
     * Problem Description
     * <p>
     * https://www.interviewbit.com/problems/multiple-left-rotations-of-the-array/
     * <p>
     * <p>
     * Given an array of integers A and multiple values in B which represents the indices of the array A
     * around which left rotation of the array A needs to be performed.
     * <p>
     * Find the rotated array for each value and return the result in the from of a matrix where i'th row
     * represents the rotated array for the i'th value in B.
     * <p>
     * <p>
     * <p>
     * Problem Constraints
     * <p>
     * 1 <= length of both arrays <= 2000
     * <p>
     * -109 <= A[i] <= 109
     * <p>
     * 0 <= B[i] <= 2000
     * <p>
     * <p>
     * Input Format
     * <p>
     * The first argument given is the integer array A.
     * <p>
     * The second argument given is the integer array B.
     * <p>
     * <p>
     * Output Format
     * <p>
     * Return the resultant matrix.
     * <p>
     * <p>
     * Example Input
     * <p>
     * Input 1:
     * <p>
     * A = [1, 2, 3, 4, 5]
     * B = [2, 3]
     * <p>
     * Input 2:
     * <p>
     * A = [5, 17, 100, 11]
     * B = [1]
     * <p>
     * <p>
     * <p>
     * Example Output
     * <p>
     * Output 1:
     * <p>
     * [ [3, 4, 5, 1, 2]
     * [4, 5, 1, 2, 3] ]
     * <p>
     * Output 2:
     * <p>
     * [ [17, 100, 11, 5] ]
     *
     * @param A
     * @param B
     */
    public List<List<Integer>> solve(List<Integer> A, List<Integer> B) {
        List<List<Integer>> result = new ArrayList<>(A.size());
        for (Integer index : B) {
            List<Integer> subList = new ArrayList<>(A.size());
            int realIndex = index%A.size();
            subList.addAll(A.subList(realIndex, A.size()));
            if (realIndex != 0) {
                subList.addAll(A.subList(0, realIndex));
            }
            result.add(subList);
        }
        return result;
    }
}
