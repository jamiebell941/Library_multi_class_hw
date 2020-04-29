import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book books;
    private Borrower borrower;
    private int capacity;

    @Before

    public void before() {
        library = new Library(5);
        books = new Book("The Blade Artist", "Irvine Welsh", "Drama");
        borrower = new Borrower();
    }

    @Test

    public void libraryStartsEmpty() {
        assertEquals(0, library.totalStock());
    }

    @Test

    public void canAddBook() {
        library.addBook(books);
        assertEquals(1, library.totalStock());
    }

    @Test

    public void cantAddBook() {
        library.addBook(books);
        library.addBook(books);
        library.addBook(books);
        library.addBook(books);
        library.addBook(books);
        library.addBook(books);
        assertEquals(5, library.totalStock());
    }

    @Test

    public void canRemoveBook(){
        library.addBook(books);
        library.removeBook(books);
        assertEquals(0, library.totalStock());
    }

    @Test

    public void canGiveBookToBorrower(){
        library.addBook(books);
        library.loanBook(books, borrower);
        assertEquals(0, library.totalStock());
        assertEquals(1, borrower.totalBooks());

    }

}