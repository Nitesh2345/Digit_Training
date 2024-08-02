package Day_4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(2);
            list.add(4);
            list.add(1);

            Set<Integer> duplicates = findDuplicates(list);
            System.out.println("Duplicate elements: " + duplicates);
        }
        public static Set<Integer> findDuplicates(ArrayList<Integer> list) {
            Set<Integer> duplicates = new HashSet<>();
            Set<Integer> uniqueElements = new HashSet<>();

            for (Integer element : list) {
                if (!uniqueElements.add(element)) {
                    duplicates.add(element);
                }
            }
            return duplicates;
        }
}

