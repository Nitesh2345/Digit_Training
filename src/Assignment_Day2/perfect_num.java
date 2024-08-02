package Assignment_Day2;

import java.util.Scanner;

public class perfect_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0)
                num=num+i;

        }
        if(num==n){
            System.out.println("Perfect Num");
        }
        else{
            System.out.println("Not a Perfect Num.");
        }
    }
}
