package Day_4;
import java.util.ArrayList;
import java.util.Collections;

public class LargestSmallestElement {

        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            int min = Collections.min(list);
            int max = Collections.max(list);

            System.out.println("Smallest element: " + min);
            System.out.println("Largest element: " + max);
        }
}
