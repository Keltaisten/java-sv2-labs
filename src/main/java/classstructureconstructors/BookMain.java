package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("J.R.R. Martin", "Gyűrűk Ura");
        book.register("ABC456");

        System.out.println("Szerő: "+ book.getAuthor());
        System.out.println("Cím: " + book.getTitle());
        System.out.println("Regisztrációs szám" + book.getRegNumber());
    }
}
