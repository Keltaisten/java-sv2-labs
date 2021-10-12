package classstructureintegrate;

public class BankAccount {
    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount(String accountNumber, String owner, int balance) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
    }

    public int deposit(int numb){
        return balance = balance + numb;
    }

    public int withdraw(int numb){
        return balance = balance - numb;
    }

    public String getInfo(){
        return owner + " (" + accountNumber + "): " + balance + " Ft";
    }
}
