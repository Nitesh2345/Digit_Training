package Day_4;

import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int mx=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>mx){
                mx=arr[i];

            }
        }
        System.out.println("Max element in Array:"+mx);
    }
}
