package Day_4;
import java.util.Scanner;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target_Num = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
            for(int i=0;i<size;i++) {
                if (arr[i] == target_Num) {
                    System.out.println(i);
                    return;
                }
            }
                System.out.println("-1");
              // return;
        }
}
