import java.util.*;

public class Main {
    public static void main(String[] args) {
        /// first task
        word_counter();

        /// second task
        int[] arr = {1, 2, 5, 6, 7, 8};
        int target = 11;
        twoSum(arr, target);

        /// third task
        library();

        /// fourth task
        int[] nums = {1, 1, 1, 2, 2, 3, 3, 3, 3};
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

    public static int two_pointers(int[] nums) {
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

    public static void library() {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Kitob qo‘shish");
            System.out.println("2. Barcha kitoblar ro‘yxati");
            System.out.println("3. ID bo‘yicha kitob olish");
            System.out.println("4. Kitobni o‘chirish");
            System.out.println("5. Chiqish");
            System.out.print("Tanlang: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Sarlavha: ");
                    String title = sc.nextLine();
                    System.out.print("Muallif: ");
                    String author = sc.nextLine();
                    library.addBook(new Book(id, title, author));
                    System.out.println("Kitob qo‘shildi!");
                    break;
                case 2:
                    System.out.println("Barcha kitoblar:");
                    for (Book b : library.getAllBooks()) {
                        System.out.println(b);
                    }
                    break;
                case 3:
                    System.out.print("Qidiriladigan ID: ");
                    int searchId = sc.nextInt();
                    Book book = library.getBookById(searchId);
                    if (book != null) System.out.println(book);
                    else System.out.println("Kitob topilmadi");
                    break;
                case 4:
                    System.out.print("O‘chirish uchun ID: ");
                    int removeId = sc.nextInt();
                    if (library.removeBook(removeId)) System.out.println("Kitob o‘chirildi");
                    else System.out.println("Kitob topilmadi");
                    break;
                case 5:
                    System.out.println("Dastur tugadi!");
                    return;
                default:
                    System.out.println("Noto‘g‘ri tanlov!");
            }
        }
    }
}