
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Library library;
    Books book1;
    Books book2;
    Borrower borrower;

    @Before
    public void before() {
        library = new Library(3);
        book1 = new Books("Computing");
        book2 = new Books("Fantasy");
        borrower = new Borrower();
    }

    @Test
    public void borrowBook(){
        library.addBook(book1);
        library.addBook(book2);
        borrower.addBook(library);
        borrower.addBook(library);
        assertEquals(2,  borrower.bookCount());
    }

}