package Assignment_Day2;

public class Duplicate_element {
    public static void main(String[] args) {
        int[] arr={1,2,4,2,6};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j])
                    System.out.println("Duplicate element in array are:"+arr[i]);
            }
        }

    }
}
