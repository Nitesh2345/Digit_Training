package Day_4;

public class First_LastOccurance {
        public static int findFirstOccurrence(int[] array, int target) {
            int left = 0;
            int right = array.length - 1;
            int result = -1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (array[mid] == target) {
                    result = mid;
                    right = mid - 1; // Continue searching in the left half
                } else if (array[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return result;
        }
        public static int findLastOccurrence(int[] array, int target) {
            int left = 0;
            int right = array.length - 1;
            int result = -1;

            while (left <= right) {
                int mid = (left + right) / 2;

                if (array[mid] == target) {
                    result = mid;
                    left = mid + 1; // Continue searching in the right half
                } else if (array[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return result;
        }
        public static void main(String[] args) {
            int[] array = {2, 4, 10, 10, 10, 18, 20};
            int target = 10;
            int firstOccurrence = findFirstOccurrence(array, target);
            int lastOccurrence = findLastOccurrence(array, target);

            if (firstOccurrence != -1 && lastOccurrence != -1) {
                System.out.println("First occurrence of " + target + " is at index: " + firstOccurrence);
                System.out.println("Last occurrence of " + target + " is at index: " + lastOccurrence);
            } else {
                System.out.println("Element not found in the array.");
            }
        }
}
