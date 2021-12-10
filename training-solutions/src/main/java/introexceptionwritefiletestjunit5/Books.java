package introexceptionwritefiletestjunit5;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Books {
    List<String> bookList = new ArrayList<>();

    public void readAllBooks(Path path){
        try {
            bookList = Files.readAllLines(path);
        }catch (IOException ioe){
            throw new IllegalStateException("File not found", ioe);
        }
    }

    public void writeBookstoFile(Path path){
        List<String> modifiedBookList = new ArrayList<>();
        for(String book: bookList){
            String[] bookArray = book.split(";");
            modifiedBookList.add(bookArray[2] + ": " + bookArray[1]);
        }
        try {
            Files.write(path,modifiedBookList);
        }catch (IOException ioe){
            throw new IllegalStateException("File not found", ioe);
        }
    }
}
