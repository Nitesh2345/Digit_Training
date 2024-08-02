package Day_4;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class UnionOfTwoList {

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

            ArrayList<Integer> unionList = findUnion(list1, list2);
            System.out.println("Union of the two lists: " + unionList);
        }

        public static ArrayList<Integer> findUnion(ArrayList<Integer> list1, ArrayList<Integer> list2) {
            LinkedHashSet<Integer> set = new LinkedHashSet<>(list1);
            set.addAll(list2);
            return new ArrayList<>(set);
        }
}
