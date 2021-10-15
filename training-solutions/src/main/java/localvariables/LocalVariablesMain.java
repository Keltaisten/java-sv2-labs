package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {

        boolean b;
        //System.out.println(b);    Nem lehet mert nincs inicializálva 'b'.
        b =false;
        System.out.println(b);

        int a = 2;
        System.out.println(a);

        int i = 3, j = 4;
        int k = i;
        System.out.println(i + ", " + j + ", " + k);

        //System.out.println(valtozo);   Nem lehet ilyet, mert csak a lokális változót csak a definiálásától lehet használni.
        // Kezdőértéke nincs ezért azt is meg kell adni kiiratás előtt.
        String valtozo;

        String s = "Hello World";
        System.out.println(s);

        String t = s;
        System.out.println(t);

        {
            int x = 0;
            System.out.println(x);
            System.out.println(a);
        }

        //System.out.println(x);  Nem engedi mert a blokkon kívül van.
    }
}
