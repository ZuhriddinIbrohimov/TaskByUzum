import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        word_counter();
    }

    public static void word_counter(){
        String str = "hello world qwerty world";
        int n = 2;

        String[] words = str.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == n) {
                System.out.println(entry.getKey());
            }
        }
    }

}