import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> books;

    public Library(int capacity) {
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int totalStock() {
        return this.books.size();
    }

    public void addBook(Book books) {
        if ( this.totalStock() < this.capacity )
            this.books.add(books);
    }


    public void removeBook(Book book) {
        this.books.remove(book);
    }

    public void loanBook(Book books, Borrower borrower) {
        this.books.remove(books);
        borrower.addBook(books);
    }
}