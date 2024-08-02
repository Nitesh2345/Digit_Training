package Day_4;
import java.util.*;

public class ReverseArrayList {
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            System.out.println("Original list: " + list);
            Collections.reverse(list);
            System.out.println("Reversed list: " + list);
        }
}
