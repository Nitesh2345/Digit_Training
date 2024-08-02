package Assignment_Day2;

import java.util.*;

public class Problem_3 {
    public static void main(String[] args){
        Scanner pc=new Scanner(System.in);
//        int n1= pc.nextInt();
//        int n2= pc.nextInt();
//        int n3= pc.nextInt();
//        int n4= pc.nextInt();
//        int n5= pc.nextInt();
        int res=0;
        for(int i=1;i<=5;i++){
            int num=pc.nextInt();
            res=res+num;
        }
        System.out.println((res/5.0));
    }
}
