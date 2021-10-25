package attributes.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Eredet");
        System.out.println(book.getTitle());
        book.setTitle("Inferno");
        System.out.println(book.getTitle());
    }
}
