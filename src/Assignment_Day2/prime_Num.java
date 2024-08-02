package Assignment_Day2;

import java.util.Scanner;

public class prime_Num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num = sc.nextInt();
        int cnt = 0;
        for(int i=1; i<=num; i++)

        {
            if (num % i == 0) {
                cnt++;
            }
        }if(cnt>2)

        {
            System.out.println("Not a prime num");
        }
        else

        {
            System.out.println("Prime num.");

        }
    }
}
