package Day_4;
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicate {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(2);
            list.add(4);
            list.add(1);

            ArrayList<Integer> result = removeDuplicates(list);
            System.out.println("ArrayList after removing duplicates: " + result);
        }

        public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list) {
            LinkedHashSet<Integer> set = new LinkedHashSet<>(list);
            return new ArrayList<>(set);
        }
}
