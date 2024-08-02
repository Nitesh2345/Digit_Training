package Assignment_Day2;

import java.util.Scanner;

public class Odd_Even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        if((num1 & 1)==0){
            System.out.println(num1+" : is a evev num.");
        }
        else{
            System.out.println(num1+": Num1 is not a evev num.");
        }
    }
}
