package typeconversion;

import java.util.ArrayList;
import java.util.Arrays;

public class Conversion {
        public double convertDoubleToDouble(double number){
            int i = (int) number;
            return i;
        }

        public byte[] convertIntArrayToByteArray(int[] arrayInt){
            byte[] arrayByte = new byte[arrayInt.length];
            for(int i = 0; i<arrayInt.length;i++){
                if(arrayInt[i]<0 || arrayInt[i]>127){
                    arrayByte[i] = -1;
                }
                else{
                    arrayByte[i] = (byte)arrayInt[i];
                }
            }
            return arrayByte;
        }

        public double getFirstDecimal(double number){
            int wholeNumber = (int) number;
            double fraction = number - wholeNumber;
            fraction *= 10;
            int fractionToWhole = (int) fraction;
            return wholeNumber + (fractionToWhole/10.0);
        }
}
