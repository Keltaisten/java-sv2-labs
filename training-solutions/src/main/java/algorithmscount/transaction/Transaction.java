package algorithmscount.transaction;

public class Transaction {
    private int accountNumber;
    private TransactionType transactionType;
    private int amount;

    public Transaction(int accountNumber, TransactionType transactionType, int amount) {
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public int getAmount() {
        return amount;
    }
}
