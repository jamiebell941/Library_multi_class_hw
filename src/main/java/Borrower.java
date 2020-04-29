import java.util.ArrayList;

public class Borrower {

    private ArrayList<Book> collection;

    public Borrower() {
        this.collection = new ArrayList<Book>();
    }



    public void addBook(Book books) {
        this.collection.add(books);
    }

    public int totalBooks() {
        return this.collection.size();
    }
}