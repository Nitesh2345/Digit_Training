package Day_4;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class CommonElement {
        public static void main(String[] args) {
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(1);
            list1.add(2);
            list1.add(3);
            list1.add(4);

            ArrayList<Integer> list2 = new ArrayList<>();
            list2.add(3);
            list2.add(4);
            list2.add(5);
            list2.add(6);

            Set<Integer> commonElements = findCommonElements(list1, list2);
            System.out.println("Common elements: " + commonElements);
        }
        public static Set<Integer> findCommonElements(ArrayList<Integer> list1, ArrayList<Integer> list2) {
            Set<Integer> set1 = new HashSet<>(list1);
            Set<Integer> commonElements = new HashSet<>();

            for (Integer element : list2) {
                if (set1.contains(element)) {
                    commonElements.add(element);
                }
            }
            return commonElements;
        }
}
