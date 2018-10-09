import java.util.ArrayList;

public class Books {

    private String title;
    private String author;
    private String genre;

    public Books(String title, String author, String genre){
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public String hasTitle() {
        return this.title;
    }


    public String hasAuthor() {
        return this.author;
    }

    public String hasGenre() {
        return this.genre;
    }
}
