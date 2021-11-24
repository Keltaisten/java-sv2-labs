package algorithmscount.bankaccount;

import java.util.List;

public class BankAccountConditionCounter {
    public int countWithBalanceGreaterThan(List<BankAccount> bankAccount, int number){
        int count = 0;
        for(BankAccount bank: bankAccount){
            if(bank.getBalance() > number){
                count++;
            }
        }
        return count;
    }
}
