public class train {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;

        int z = ++x + (x-4)*y -2;
        System.out.println(x + " " + z);    // 6 8

        x = 5;
        y = 2;
        z = x++ + (x-4)*y -2;
        System.out.println(x + " " + z);    // 6 7

        int a = 10;
        double b = (15 - a) / 2 * (double) 3;
        System.out.println(b);
    }
}
