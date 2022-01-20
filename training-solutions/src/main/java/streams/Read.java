package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Read {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public List<String> listBookTitlesShorterThanGiven(int maxNumberOfPages){
        return books.stream()
                .filter(book -> book.getPages() < maxNumberOfPages)
                .map(book -> book.getTitle())
                .collect(Collectors.toList());
    }

    public List<String> listBookTitlesWithGivenAuthor(String author){
        return books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .map(Book::getTitle)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<String> listAuthors(){
        return books.stream()
                .map(Book::getAuthor)
                .distinct()
                .collect(Collectors.toList());
    }
}
