package Assignment_Day2;

public class Conditional_operator1 {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int even_cnt=0;
        int odd_cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                even_cnt++;
            else
                odd_cnt++;
        }
        System.out.println("even_cnt:"+even_cnt+","+"odd_cnt"+odd_cnt);
    }
}
