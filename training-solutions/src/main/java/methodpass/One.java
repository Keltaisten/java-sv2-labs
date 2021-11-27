package methodpass;

public class One {
    public static void main(String[] args) {
        One one = new One();
        int number = 0;
        System.out.println(number);
        number++;
        System.out.println(number);
        System.out.println(one.oddOne(number));
        System.out.println(number);
    }

    public int oddOne(int number){
        return number++;
    }
}
