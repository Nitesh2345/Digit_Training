package Day_4;

public class BinarySearchTargetElement {
        public static int binarySearch(int[] array, int target) {
            int left = 0;
            int right = array.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (array[mid] == target) {
                    return mid; // Target found
                } else if (array[mid] < target) {
                    left = mid + 1; // Search in the right half
                } else {
                    right = mid - 1; // Search in the left half
                }
            }
            return -1; // Target not found
        }
        public static void main(String[] args) {
            int[] array = {2, 3, 4, 10, 40};
            int target = 10;
            int result = binarySearch(array, target);
            if (result != -1) {
                System.out.println("Element found at index: " + result);
            } else {
                System.out.println("Element not found in the array.");
            }
        }
}
