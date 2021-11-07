package stringconcat.nameconcat;

public class NameMain {
    public static void main(String[] args) {
        System.out.println(new Name("Doe", "Jill", "Jane", Title.MRS).concatNameWesternStyle());
        System.out.println(new Name("Doe", "", "Jane", Title.DR).concatNameWesternStyle());
        System.out.println(new Name("Doe", "Jill", "Jane", null).concatNameWesternStyle());
        System.out.println(new Name("Doe", null, "Jane", Title.MS).concatNameWesternStyle());

        System.out.println(new Name("Doe", "Jill", "Jane", null).concatNameHungarianStyle());
        System.out.println(new Name("Doe", "", "Jane", Title.MS).concatNameHungarianStyle());
        System.out.println(new Name("Doe", "Jill", "Jane", Title.DR).concatNameHungarianStyle());
        System.out.println(new Name("Doe", "Jill", "Jane", Title.MRS).concatNameHungarianStyle());
    }
}
