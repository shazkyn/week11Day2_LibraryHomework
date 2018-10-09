import java.util.ArrayList;

public class Borrower {

    private ArrayList<Books> borrowedBooks;

    public Borrower() {
        this.borrowedBooks = new ArrayList();
    }

    public void addBook(Library library) {
        this.borrowedBooks.add(library.borrowBook());
    }

    public int bookCount() {
        return this.borrowedBooks.size();
    }

}
