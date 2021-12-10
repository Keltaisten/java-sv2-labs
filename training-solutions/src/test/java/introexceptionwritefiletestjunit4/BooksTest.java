package introexceptionwritefiletestjunit4;

import objects.Book;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import static org.junit.Assert.*;

public class BooksTest {

    @Rule
    public TemporaryFolder temporaryFolder = new TemporaryFolder();

    @Test
    public void testWriteTheBook() throws IOException{
        Books books = new Books();
        Path path = temporaryFolder.newFile().toPath();
        List<String> bookList = books.writeBooks();
        assertEquals("Gárdonyi Géza: Egri csillagok", bookList.get(0));
    }
}