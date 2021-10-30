package typeconversion;

import java.util.Arrays;

public class ConversionMain {
    public static void main(String[] args) {
        Conversion conversion = new Conversion();
        int[] array = {5, -14, 6, 2, 125, 354, 9738, 3};
        String arrayString = Arrays.toString(conversion.convertIntArrayToByteArray(array));
        System.out.println(arrayString);
        System.out.println(conversion.getFirstDecimal(742.356));
    }
}
