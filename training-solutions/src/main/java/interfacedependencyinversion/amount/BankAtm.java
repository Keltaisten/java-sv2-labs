package interfacedependencyinversion.amount;

public class BankAtm implements Payable{
    @Override
    public int getPayableAmount(int amount) {
        return roundTothousand(amount);
    }

    private int roundTothousand(int amount) {
        int rounded = amount / 1000;
        rounded += 1;
        return rounded * 1000;
    }
}
