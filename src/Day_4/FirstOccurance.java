package Day_4;
import java.util.*;
public class FirstOccurance {
    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
       // int []arr={0,1,1,4,5};
      //  int target=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int idx=search(arr,target);
        System.out.println(idx);
    }
}
