package Day_4;

public class CountingSort {
        public static void countingSort(int[] arr) {
            int n = arr.length;

            // Find the maximum element in the array
            int max = arr[0];
            for (int i = 1; i < n; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            // Create a count array to store the count of each unique object
            int[] count = new int[max + 1];

            // Store the count of each element
            for (int i = 0; i < n; i++) {
                count[arr[i]]++;
            }

            // Store the cumulative count of each array
            for (int i = 1; i <= max; i++) {
                count[i] += count[i - 1];
            }

            // Find the index of each element of the original array in the count array,
            // and place the elements in the output array
            int[] output = new int[n];
            for (int i = n - 1; i >= 0; i--) {
                output[count[arr[i]] - 1] = arr[i];
                count[arr[i]]--;
            }

            // Copy the sorted elements into the original array
            for (int i = 0; i < n; i++) {
                arr[i] = output[i];
            }
        }

        public static void main(String[] args) {
            int[] arr = {4, 2, 2, 8, 3, 3, 1};
            countingSort(arr);
            System.out.println("Sorted array:");
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }

}
