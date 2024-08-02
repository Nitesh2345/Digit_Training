package Assignment_Day1;

import java.util.Scanner;

public class Problem_4 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int times=sc.nextInt();
        int heads=0;
        int tails=0;
        for(int i=1;i<=times;i++){
            if(Math.random()<0.5){
               tails++;
            }
            else{
                heads++;
            }
        }
        System.out.println("Tails :"+((float)tails/times)*100 +" & heads:"+((float)heads/times)*100);
    }
}
