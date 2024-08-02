import java.util.*;

public class Method_Example {
    public int addNumbers(int a, int b){
        int add=a+b;
        return add;
    }
    public static void main(String[] args) {
        //int i=10;
        //int j=20;
        Method_Example sc= new Method_Example();
        int result = sc.addNumbers(10, 27);
        System.out.println(result);
    }
}
