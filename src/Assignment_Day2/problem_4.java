package Assignment_Day2;

import java.util.Scanner;

public class problem_4 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        double Area=3.14*(n*n);
        double Perimeter=(2*3.14)*n;
        System.out.println("Area of Circle:"+Area+","+" Perimeter of Circle: "+Perimeter);
    }
}
