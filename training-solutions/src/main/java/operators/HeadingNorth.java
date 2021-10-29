package operators;

public class HeadingNorth {
    public int getNumberOfNewDirections(){
        int deg = 0;
        for(int i = 1;i<100;i++){
            deg += 10*i;
            if(deg == 360){
                return i;
            }
        }
        return -1;

    }
}
