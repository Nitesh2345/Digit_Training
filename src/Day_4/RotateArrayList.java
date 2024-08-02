package Day_4;
import java.util.ArrayList;
import java.util.Collections;

public class RotateArrayList {

        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);
            list.add(3);
            list.add(4);
            list.add(5);

            System.out.println("Original list: " + list);

            // Rotate the list by 2 positions to the right
            Collections.rotate(list, 2);

            System.out.println("Rotated list: " + list);
        }
    }

