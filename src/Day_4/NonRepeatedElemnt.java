package Day_4;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatedElemnt {
    
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(4);
            list.add(5);
            list.add(1);
            list.add(2);
            list.add(2);
            list.add(1);
            list.add(4);
            list.add(3);

            Integer firstNonRepeating = findFirstNonRepeating(list);
            if (firstNonRepeating != null) {
                System.out.println("The first non-repeating element is: " + firstNonRepeating);
            } else {
                System.out.println("There are no non-repeating elements.");
            }
        }

        public static Integer findFirstNonRepeating(ArrayList<Integer> list) {
            Map<Integer, Integer> countMap = new LinkedHashMap<>();

            // Count the occurrences of each element
            for (Integer num : list) {
                countMap.put(num, countMap.getOrDefault(num, 0) + 1);
            }

            // Find the first element with a count of 1
            for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }

            return null;
        }
    }
