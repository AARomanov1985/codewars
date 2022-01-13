package ru.aaromanov1985.interview.booking.codetest;

import java.util.*;

public class Task3 {
    /*
     * Complete the 'employeeWithLesserThanKBreaks' function below.
     *
     * The function is expected to return a 2D_INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. 2D_INTEGER_ARRAY employeeCalls
     *  2. INTEGER k
     */

    public static List<List<Integer>> employeeWithLesserThanKBreaks(List<List<Integer>> employeeCalls, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (List<Integer> list : employeeCalls) {
            Integer id = list.get(0);
            Integer startTime = list.get(1);
            Integer endTime = list.get(2);

            if (map.containsKey(id)) {
                List<Integer> data = map.get(id);
                Integer lastTime = data.get(0);
                Integer breaks = data.get(1);
                if (lastTime < startTime) {
                    map.put(id, Arrays.asList(endTime, breaks + 1));
                }
            } else {
                map.put(id, Arrays.asList(endTime, 0));
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        for (Integer id : map.keySet()) {
            List<Integer> data = map.get(id);
            Integer breaks = data.get(1);
            if (breaks < k) {
                result.add(Arrays.asList(id, breaks));
            }
        }

        return result;
    }

}
