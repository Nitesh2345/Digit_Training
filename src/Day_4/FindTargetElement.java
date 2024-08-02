package Day_4;
public class FindTargetElement {

        public static void main(String[] args) {
            int[] array = {4, 5, 6, 7, 0, 1, 2};
            int target = 3;
            boolean result = search(array, target);
            System.out.println("Target found: " + result);
        }
        public static boolean search(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    return true;
                }
                // Check if the left half is sorted
                if (nums[left] <= nums[mid]) {
                    if (nums[left] <= target && target < nums[mid]) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                }
                // Otherwise, the right half must be sorted
                else {
                    if (nums[mid] < target && target <= nums[right]) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
            return false;
        }
}
