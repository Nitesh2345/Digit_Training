package Assignment_Day2;

import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int req_num= 5*7;
        if(num%req_num==0)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
