package Assignment_Day2;

import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int []arr=new int[num];

        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        float sum=0;
        for(int i=0;i<num;i++){
            System.out.println("print arr[i]: "+arr[i]);
            sum+=arr[i];
        }
        System.out.println("print sum:"+sum);
        float avg = sum / num;

        System.out.println("Print Avg:"+avg);
    }
}
