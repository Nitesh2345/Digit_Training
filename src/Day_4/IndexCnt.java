package Day_4;
import java.util.ArrayList;
import java.util.List;

public class IndexCnt{
    public static List<Integer> findAllIndices(int[] array, int target) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                indices.add(i);
            }
        }
        return indices;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 2, 5};
        int target = 2;
        List<Integer> indices = findAllIndices(array, target);
        System.out.println("Indices of " + target + ": " + indices);
    }
}
