package controladvanced.numbers;

public class train {
    public static void main(String[] args) {
        int x = 5;
//        y = 2;
//        z = x + (x - x) * x;
//
//        Még az első + bal oldali kiértékelése előtt növeljük x-et 1-el
//        x=x+1(6);
//      | 6  6 6 6  6 6 6  6
//                | |  | | | /  | | /
        int z = ++x + (x - x)   * x;  // z = 5 + (6 - 6) * 6 = 5, x = 6
        System.out.println(z);


    }
}
