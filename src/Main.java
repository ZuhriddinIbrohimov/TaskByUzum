import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /// first task
        word_counter();

        /// second task
        int[] arr = {1, 2, 5, 6, 7, 8};
        int target = 11;
        twoSum(arr, target);

    }

    public static void word_counter() {
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

    public static void twoSum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }
    }




}