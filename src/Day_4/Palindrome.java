package Day_4;
import java.util.ArrayList;
public class Palindrome {

        public static void main(String[] args) {
            ArrayList<Character> list = new ArrayList<>();
            list.add('r');
            list.add('a');
            list.add('c');
            list.add('e');
            list.add('c');
            list.add('a');
            list.add('r');

            boolean isPalindrome = isPalindrome(list);
            System.out.println("Is the list a palindrome? " + isPalindrome);
        }

        public static boolean isPalindrome(ArrayList<Character> list) {
            int n = list.size();
            for (int i = 0; i < n / 2; i++) {
                if (!list.get(i).equals(list.get(n - i - 1))) {
                    return false;
                }
            }
            return true;
        }
    }


