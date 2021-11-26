package algorithmsdecision;

public class Prime {
    public boolean isPrime(int number){
        boolean bool = true;
        for(int i = 2; i < number/2; i++){
            if(i != number && number%i == 0 && bool){
                bool = false;
            }
        }
        return bool;
    }
}
