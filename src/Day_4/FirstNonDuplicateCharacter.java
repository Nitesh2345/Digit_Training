
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonDuplicateCharacter {
    public static char findFirstNonDuplicate(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        String str = "swiss";
        char result = findFirstNonDuplicate(str);
        System.out.println(result != '\0' ? "The first non-duplicate character is: " + result : "No non-duplicate character found.");
    }
}
