package Day_4;
import java.util.Arrays;

public class SmallestElementEqualToTarget {
        public static void main(String[] args) {
            int[] array = {5, 3, 8, 6, 2, 7, 4, 10};
            int target = 6;

            Arrays.sort(array);
            Integer smallest = null;
            Integer largest = null;

            for (int num : array) {
                if (num >= target) {
                    if (smallest == null) {
                        smallest = num;
                    }
                    largest = num;
                }
            }
            if (smallest != null && largest != null) {
                System.out.println("Smallest element >= target: " + smallest);
                System.out.println("Largest element >= target: " + largest);
            } else {
                System.out.println("No elements greater than or equal to the target.");
            }
        }
}
