package searching;

import java.util.Collections;
import java.util.List;

public class BookSearch {
    private List<Book> books;

    public BookSearch(List<Book> books) {
        this.books = books;
    }

    public Book findBookByAuthorTitle(String author, String title){
        validate(author);
        validate(title);
        Book key = new Book(author,title);
        int index = Collections.binarySearch(books,key);
        if(index < 0){
            throw new IllegalArgumentException("No book found by " + author + " with title " + title);
        }
        return books.get(index);
    }

    private void validate(String word) {
        if(word == null || word.trim().equals("")){
            throw new IllegalArgumentException("Author or title must not be empty!");
        }
    }
}
