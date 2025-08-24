import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();

    // kitob qo‘shish
    public void addBook(Book book) {
        books.add(book);
    }

    // barcha kitoblar
    public List<Book> getAllBooks() {
        return books;
    }

    // id bo‘yicha qidirish
    public Book getBookById(int id) {
        for (Book b : books) {
            if (b.getId() == id) return b;
        }
        return null;
    }

    // id bo‘yicha o‘chirish
    public boolean removeBook(int id) {
        return books.removeIf(b -> b.getId() == id);
    }
}
