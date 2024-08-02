package Day_4;
import java.util.Scanner;
public class String_Search {
    public static int String_search(String[] arr, String target){
            for(int i=0;i<arr.length;i++){
                if(arr[i].equals(target)){
                    return i;
            }
    }
    return -1;
}
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    String[] arr= new String[n];

    for(int i=0;i<n;i++){
        arr[i]=sc.next();
    }
    for(String str: arr){
        System.out.print(str+",");
    }
    String target=sc.next();
    //String[] arr={"apple", "banana","date"};
    //String target= "apple";
    int index=String_search(arr, target);
    System.out.println(index);
}
}

