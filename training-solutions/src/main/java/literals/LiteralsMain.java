package literals;

import java.util.Locale;

public class LiteralsMain {
    private String j = "" + 1 + 2;
    private String k = "1" + "2";

    private double quotient = 3/4.0;

    private long big = 3_244_444_444L;

    private String word;

    int one = 1;
    int minusTwo = -2;

    public static void main(String[] args) {
        LiteralsMain literalsMain = new LiteralsMain();
        System.out.println(literalsMain.quotient);
        literalsMain.quotient = 3/4D;
        System.out.println(literalsMain.quotient);
        literalsMain.word = "title".toUpperCase(Locale.ROOT);
        System.out.println(literalsMain.word);
        System.out.println(Integer.toBinaryString(literalsMain.one));
        System.out.println(Integer.toBinaryString(literalsMain.minusTwo));
    }
}
