package genericsusage.withgenerics;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public Book getFirstBook(List<Book> books){
        if(books == null){
            throw new NullPointerException("The collection is null");
        }
        if(books.isEmpty()){
            throw new IllegalArgumentException("The collection is empty");
        }
        return books.get(0);
    }
}
