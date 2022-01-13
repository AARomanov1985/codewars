package ru.aaromanov1985.interview.booking.codetest;

import java.util.*;

public class Task2 {

    /*
     * Complete the 'missingReservations' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY firstReservationList
     *  2. 2D_INTEGER_ARRAY secondReservationList
     */

    public static List<Integer> missingReservations(List<List<Integer>> firstReservationList,
                                                    List<List<Integer>> secondReservationList) {
        Set<Integer> firstSet = new HashSet<>();
        for (List<Integer> list : firstReservationList) {
            firstSet.add(list.get(0));
        }

        Map<Integer, Integer> tempResult = new TreeMap<>();
        for (List<Integer> list : secondReservationList) {
            Integer id = list.get(0);
            Integer timestamp = list.get(1);
            if (!firstSet.contains(id)) {
                tempResult.put(timestamp, id);
            }
        }

        List<Integer> result = new ArrayList<>();
        for (Integer timeStamp : tempResult.keySet()) {
            result.add(tempResult.get(timeStamp));
        }

        return result;
    }
}
