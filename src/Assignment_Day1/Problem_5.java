package Assignment_Day1;

import java.util.Scanner;

public class Problem_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();
        if (Year >= 1000 && Year <= 9999) {
            if (Year % 400 == 0) {
                System.out.println(Year + ": Is a leap year.");
            } else if (Year % 4 == 0 && Year % 100 != 0) {
                System.out.println(Year + ":Is a leap year.");
            } else {
                System.out.println(Year + ":Is not a leap year.");
            }
        } else {
            System.out.println("Invalid number.");
        }
    }
}
