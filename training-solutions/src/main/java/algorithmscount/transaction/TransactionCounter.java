package algorithmscount.transaction;

import java.util.List;

public class TransactionCounter {
    public int lowerThan(List<Transaction> transactionList, int countLimit){
        int sum = 0;
        for(Transaction trans: transactionList){
            if(trans.getTransactionType() == TransactionType.CREDIT && trans.getAmount() < countLimit){
                sum++;
            }
        }
        return sum;
    }
}
