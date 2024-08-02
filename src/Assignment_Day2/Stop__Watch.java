package Assignment_Day2;
import java.util.Scanner;

public class Stop__Watch {
    public static void main(String[] args) {
        long start=0;
        long end=0;
        Scanner sc=new Scanner(System.in);
        start=sc.nextLong();
        start=System.currentTimeMillis();
        end=System.currentTimeMillis();
        end=sc.nextLong();
        System.out.println("Total time:"+(end-start));
    }
}
