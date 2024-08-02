package Day_4;
import java.util.*;

public class CharOccurance {
    public static int CharOccuranceCount(String arr, char target ) {
        int cnt = 0;
        for (int i = 0; i < arr.length(); i++) {
            if(arr.charAt(i) == target)
                cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String arr=sc.next();
        char target= sc.next().charAt(0);
        int ans=CharOccuranceCount(arr,target);
        System.out.println(ans);
    }
}
