package algorithmsmax;

public class Plane {
    public int getLongestOcean(String map){
        int numberActual = 0;
        int numberPreviousMax = 0;
        for(char c: map.toCharArray()){
            if(c == '0'){
                numberActual++;
            }
            else if(numberActual > numberPreviousMax){
                numberPreviousMax = numberActual;
            }
            if(c == '1'){
                numberActual = 0;
            }
        }
        return numberPreviousMax;
    }
}
