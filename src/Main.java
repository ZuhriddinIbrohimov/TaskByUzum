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

        /// fourth task
        int [] nums = {1,1,1,2,2,3,3,3,3};
        two_pointers(nums);
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

    public static int two_pointers(int[] nums){
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        // unikal elementlarni chiqaramiz
        for (int k = 0; k <= j; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println();
        return j + 1;
    }

}