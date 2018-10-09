import org.junit.Before;
import org.junit.Test;
import org.junit.Before;


import static org.junit.Assert.assertEquals;

public class BooksTest {
        Books book;

        @Before
        public void before(){
            book = new Books( "Java Gently", "I Ken Code", "Reference" );
        }

        @Test
        public void hasTitle(){
            assertEquals("Java Gently", book.hasTitle());
        }

        @Test
        public void hasAuthor(){
            assertEquals("I Ken Code", book.hasAuthor());
        }

        @Test
        public void hasGenre(){
            assertEquals("Reference", book.hasGenre());
        }

}
