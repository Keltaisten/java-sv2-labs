package introexceptionwritefiletestjunit4;

import objects.Book;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Books {
        List<String> changedBookList = new ArrayList<>();
        List<String> bookList = new ArrayList<>();

    public List<String> writeBooks() {
        Books books = new Books();
        books.readLines(Paths.get("src/test/resources/books.txt"));
        return books.setupTheBooks();
    }

    private List<String> setupTheBooks() {
        for(String s: bookList){
            String writer = s.substring(s.lastIndexOf(';') + 1);
            String title = s.substring((s.indexOf(';') + 1), s.lastIndexOf(';'));
            changedBookList.add(writer + ": " + title);
        }
        return changedBookList;
    }

    public void readLines(Path path){
        try {
            bookList = Files.readAllLines(path);
        }catch (IOException ioe){
            throw new IllegalStateException("File not found", ioe);
        }

    }
}
