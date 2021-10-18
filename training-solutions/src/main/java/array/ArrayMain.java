package array;

public class ArrayMain {
    public static void main(String[] args) {
        String[] days = new String[7];
        days[0] = "hetfő";
        days[1] = "kedd";
        days[2] = "szerda";
        days[3] = "csütörtök";
        days[4] = "péntek";
        days[5] = "szombat";
        days[6] = "vasárnap";
        System.out.println(days[1]);

        int[] twoPower = new int[5];
        twoPower[0] = 1;
        for(int i = 1; i<twoPower.length;i++){
            twoPower[i] = twoPower[i-1] * 2;
        }

        String twoPowerConcatenate = "";
        for(int two: twoPower){
            twoPowerConcatenate = twoPowerConcatenate + two + ", ";
        }
            System.out.println(twoPowerConcatenate);

    }
}
