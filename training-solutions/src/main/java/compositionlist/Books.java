package compositionlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Books {
    List<String> titleOfBooks = new ArrayList<>();

    public void addBook(String title){
        titleOfBooks.add(title);
    }

    public void findBookAndSetAuthor(String title, String author){
        int index = titleOfBooks.indexOf(title);
        if(index >= 0){
            titleOfBooks.set(index, author + ": " + title);
        }
    }

    public List<String> getTitleOfBooks() {
        return titleOfBooks;
    }

    public static void main(String[] args) {
        int numberOfBooks;
        Books books = new Books();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg hány könyvet szeretne eltárolni");
        numberOfBooks = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0;i< numberOfBooks; i++){
            System.out.println("Kérem adja meg a könyv címét");
            books.addBook(scanner.nextLine());
        }
        books.findBookAndSetAuthor("A sátán kutyája", "Sir Arthur Conan Doyle");
        System.out.println(books.getTitleOfBooks());
    }
}
