package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello ";
        String name = "John Doe";
        String message = prefix + name;
        boolean b;
        boolean c;
        String conc = "" + "";
        String abc = "Abcde";

        message = message + 444;
        b = message.equals("Hello John Doe");
        c = message.equals("Hello John Doe444");

        System.out.println(prefix);
        System.out.println(name);
        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        System.out.println(conc);
        System.out.println(conc.length());

        System.out.println(abc.length());
        System.out.println(abc.substring(0,1) + ", " + abc.substring(2,3));
        System.out.println(abc.substring(0,3));

    }
}
