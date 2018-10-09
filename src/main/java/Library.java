import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private ArrayList<Books> libraryBooks;
    private int capacity;
    private HashMap<String, Integer> bookGenre;

    public Library(int capacity) {
        this.libraryBooks = new ArrayList();
        this.capacity = capacity;
    }

    public int bookCount() {
        return this.libraryBooks.size();
    }

    public void addBook(Books book) {
        if (this.libraryBooks.size() < this.capacity) {
            this.libraryBooks.add(book);

        }
    }


    public Books borrowBook() {
        Books newBook = this.libraryBooks.remove(0);
        return newBook;
    }

    public int getBookGenreValue(String genre) {
        return bookGenre.get(genre);
    }


}
