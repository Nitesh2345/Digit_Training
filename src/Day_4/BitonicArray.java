package Day_4;

public class BitonicArray {
        public static int findPeakElement(int[] arr) {
            int left = 0;
            int right = arr.length - 1;
            while (left <= right) {
                int mid = (left + right) / 2;

                // Check if mid is the peak element
                if ((mid == 0 || arr[mid - 1] <= arr[mid]) && (mid == arr.length -1 || arr[mid + 1] <= arr[mid])){
                    return mid;
                }
                // If the middle element is part of the increasing sequence
                else if (mid > 0 && arr[mid - 1] > arr[mid]) {
                    right = mid - 1;
                }
                // If the middle element is part of the decreasing sequence
                else {
                    left = mid + 1;
                }
            }
            return -1; // This line will never be reached if the input array is bitonic.
        }
        public static void main(String[] args) {
            int[] bitonicArray = {1, 3, 8, 7, 4, 2};
            int peakIndex = findPeakElement(bitonicArray);
            System.out.println("Peak element is at index: " + peakIndex);
        }
}
