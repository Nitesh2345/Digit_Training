package Assignment_Day1;
import java.util.Scanner;
public class Problem_6 {
    public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int N= sc.nextInt();
    if(N > 0 && N<=31){
        System.out.println("Enter a valid value of N.");
    }
    for(int i=0;i<=N;i++){
        System.out.println("2^"+i+" = " +(1 << i));
    }
    }
}
