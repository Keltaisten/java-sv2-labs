package enumtype.university;

public class UniversityMain {
    public static void main(String[] args) {

        University oe = University.OE;
        String nameOfUni = oe.name();
        System.out.println(nameOfUni);
        System.out.println(University.valueOf("OE"));
        System.out.println(oe.getName());

        System.out.println(University.SZOTE);
        System.out.println(University.SZOTE.getName());
    }
}
