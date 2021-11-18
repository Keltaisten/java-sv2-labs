package introexceptionthrow.patient;

public class SsnValidator {

    public boolean IsValidSsn(String socialSecurityNumber) {
        int number;

//            number = Integer.parseInt(socialSecurityNumber);
        try {
            number = Integer.parseInt(socialSecurityNumber);
        }catch (NumberFormatException nfe){
            nfe.getMessage();
        }
        if(!(socialSecurityNumber.length() == 9)){
            throw new IllegalArgumentException("The socialSecurityNumber is not nine length");
        }

        int numberSum = 0;
        for(int i = 0; i < (socialSecurityNumber.length() - 1); i++){
            if(i%2 == 0){
                numberSum += socialSecurityNumber.charAt(i) * 7;
            }else{
                numberSum += socialSecurityNumber.charAt(i) * 3;
            }
        }

        int calculatedNinthNumber = numberSum%10;
        String calculatedNinthNumberString = String.valueOf(calculatedNinthNumber);
        String ninthNumber = String.valueOf(socialSecurityNumber.charAt(8));
        return ninthNumber.equals(calculatedNinthNumberString);
    }
}
