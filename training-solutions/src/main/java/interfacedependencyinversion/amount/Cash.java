package interfacedependencyinversion.amount;

public class Cash implements Payable{
    @Override
    public int getPayableAmount(int amount) {
        return makeTheRound(amount);
    }

    private int makeTheRound(int amount) {
        String amountConvertedToString = String.valueOf(amount);
        String lastIndex = String.valueOf(amountConvertedToString.charAt(amountConvertedToString.length() - 1));
        int lastIndexConvertedToInt = Integer.parseInt(lastIndex);
        switch (lastIndexConvertedToInt){
            case 1, 2:
                return  amount - lastIndexConvertedToInt;
            case 3, 4, 6, 7:
                return amount + 5 - lastIndexConvertedToInt;
            case 8, 9:
                return amount + 10 - lastIndexConvertedToInt;
        }
        return amount;
    }
}
