package introexceptionwritefiletestjunit5;

import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BooksTest {

    @TempDir
    File tempFolder;

    @Test
    void readAllBooks() {
        Books books = new Books();
        Path path = Paths.get("src/test/resources/books.txt");
        books.readAllBooks(path);
        assertEquals("F 37;Tüskevár;Fekete István", books.bookList.get(2));
    }

    @Test
    void readAllBooksWithWrongPath() {
        Books books = new Books();
        Path path = Paths.get("src/test/resources/wrongPath.txt");
        IllegalStateException ise = assertThrows(IllegalStateException.class,
                ()-> books.readAllBooks(path));
        assertEquals("File not found", ise.getMessage());
    }

    @Test
    void writeBookstoFile() throws IOException {
        Path pathTemp = tempFolder.toPath().resolve("something.txt");
        Books books = new Books();
        Path path = Paths.get("src/test/resources/books.txt");
        books.readAllBooks(path);
        books.writeBookstoFile(pathTemp);
        List<String> readBookList = Files.readAllLines(pathTemp);
        assertEquals("Fekete István: Tüskevár", readBookList.get(2));
    }
}