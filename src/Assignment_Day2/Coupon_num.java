package Assignment_Day2;
import java.util.*;

class Coupon_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int counter= 0;

        while (set.size() != num) {
            int random = new Random().nextInt(num+1);
            set.add(random);
            counter++;
        }
        System.out.println("no of attempts: "+counter);
        System.out.println(set);
    }
}
