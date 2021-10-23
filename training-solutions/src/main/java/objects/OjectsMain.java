package objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OjectsMain {
    public static void main(String[] args) {
    new Book();
        System.out.println("Tudom példányosítani, de nem tudok hozzáférni.");
        System.out.println(new Book());

        Book emptyBook;
//        System.out.println(emptyBook);
        System.out.println("Nem tudom kiiratni az érték nélküli változót.");

        emptyBook = null;
        System.out.println(emptyBook);

        System.out.println(emptyBook == null);

        Book book = new Book();
        System.out.println(book);

        book = null;
        System.out.println(book);

        book = new Book();

        System.out.println(book);

        Book anotherBook = new Book();

        System.out.println(book == anotherBook);

        anotherBook = book;

        System.out.println(book == anotherBook);

        Book[] bookBlock = {book, emptyBook, anotherBook};

        List<Book> bookList = Arrays.asList(book, emptyBook, anotherBook);

        List<Book> bookList2 = new ArrayList<>();

        bookList2.add(book);
        bookList2.add(emptyBook);
        bookList2.add(anotherBook);

        System.out.println(Arrays.toString(bookBlock));
        System.out.println(bookList);
        System.out.println(bookList2);

    }
}
