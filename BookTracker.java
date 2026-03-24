import java.util.ArrayList;
public class BookTracker {
    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book b) {
        books.add(b);
        System.out.println("Book added");
    }

    public Book findBook(String title) {

        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    public void startReading(String title, String date) {
        Book b = findBook(title);

        if (b != null) {
            b.startReading(date);
            System.out.println("Started reading");
        } else {
            System.out.println("Book not found");
        }
    }

    public void finishReading(String title, String date) {
        Book b = findBook(title);
        if (b != null) {
            b.finishReading(date);
            System.out.println("Finished reading");
        } else {
            System.out.println("Book not found");
        }
    }

    public void addReviews(String title, String review) {
        Book b = findBook(title);
        if (b != null) {
            b.addReviews(review);
            System.out.println("Review added");
        } else {
            System.out.println("Book not found");
        }
    }

    public void showLibrary() {
        System.out.println("\n----- UNREAD -----");
        for (Book b : books) {
            if (b.getStatus().equals("Not Started")) {
                b.display();
            }
        }

        System.out.println("\n----- READING -----");
        for (Book b : books) {
            if (b.getStatus().equals("Reading")) {
                b.display();
            }
        }

        System.out.println("\n----- FINISHED -----");
        for (Book b : books) {
            if (b.getStatus().equals("Finished")) {
                b.display();
            }
        }
    }
}
