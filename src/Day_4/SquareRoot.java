package Day_4;

public class SquareRoot {
        public static int findSquareRoot(int number) {
            if (number < 0) {
                throw new IllegalArgumentException("Number must be non-negative");
            }
            if (number == 0 || number == 1) {
                return number;
            }
            int left = 1, right = number, result = 0;
            while (left <= right) {
                int mid = (left + right ) / 2;
                // Check if mid is the square root
                if (mid == number / mid) {
                    return mid;
                }
                // If mid*mid is less than number, discard left half
                if (mid <= number / mid) {
                    left = mid + 1;
                    result = mid;
                } else {
                    right = mid - 1;
                }
            }
            return result;
        }
        public static void main(String[] args) {
            int number = 29;
            int sqrt = findSquareRoot(number);
            System.out.println("Square root of " + number + " is: " + sqrt);
        }
}
