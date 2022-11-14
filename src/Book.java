import java.util.ArrayList;
import java.util.List;

public class Book {

    public static List<Book> books = new ArrayList<>();
    private String author;
    private String title;


    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }


    public static void main(String[] args) {
        String name = "Стивен Кинг";
        Book book = new Book("Стивен Кинг", "Кристина, Сияние, Кэрри");

        System.out.println();

        books.add(book);
        for (Book x : books) {
            if (name.equals(x.getAuthor()))
                System.out.println(x.getAuthor());
        }
        for (Book x : books) {
            if (name.equals(x.getAuthor()))
                System.out.println(x.getTitle());
        }


    }
}
