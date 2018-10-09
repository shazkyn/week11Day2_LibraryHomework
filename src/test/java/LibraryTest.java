import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class LibraryTest {

    Library library;
    Books book1;
    Books book2;
    Books book3;
    Books book4;
    Books book5;
    Books book6;

    @Before
    public void before() {
        library = new Library(3);
        book1 = new Books("Ornithology");
        book2 = new Books("Science Fiction");
        book3 = new Books("True Crime");
        book4 = new Books("Fantasy");
        book5 = new Books("Computing");
        book6 = new Books("Computing");
    }

    @Test
    public void bookCount() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void checkCapacity() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void borrowBook() {
        library.addBook(book1);
        library.addBook(book2);
        library.borrowBook();
        assertEquals(1, library.bookCount());
    }




}
