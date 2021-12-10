package initializer;

import java.util.ArrayList;
import java.util.List;

public class CreditCard {
    private static final List<Rate> ACTUAL_RATES = new ArrayList<>();
    private long balance;

    public CreditCard(long balance, initializer.Currency currency, List<Rate> upload){
        ACTUAL_RATES.addAll(upload);
        this.balance = Math.round(balance * getConversionRate(currency));
    }
    public CreditCard(long balance){
        this.balance = balance;
    }

    private double getConversionRate(initializer.Currency currency) {
        for (Rate rate : ACTUAL_RATES) {
            if (currency == rate.getCurrency()) {
                return rate.getConversionFactor();
            }
        }
        return 1.0;
    }

    public long getBalance(){
        return balance;
    }
    public boolean payment(long amount, initializer.Currency currency){
        long value = Math.round(amount * getConversionRate(currency));
        if (value <= balance) {
            balance -= value;
            return true;
        }
        return false;
    }
    public boolean payment(long amount){
        return payment(amount, Currency.HUF);
    }
}
