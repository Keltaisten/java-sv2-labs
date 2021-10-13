package statements;

public class Investment {
    private double cost = 0.3;  //Kezelési költség
    private int fund;           //tőke
    private int interestRate;   //kamatláb
    private boolean active;

    public Investment(int fund, int interestRate) {
        this.fund = fund;
        this.interestRate = interestRate;
        active = true;
    }

    public int getFund() {
        return fund;
    }

    public double getYield(double days){
        double part;
        part = fund * interestRate / 100.0 * days / 365.0;
        return part;
    }

    public double close(double days){
        double whole;

        //Ez miért ad más eredményt 100_000 és 8 bemeneti értékek esetén mint az eggyel lejjeb lévő sor? (Eredmény: 99700.0)
        //whole = (1 + interestRate / 100 * days / 365) * fund * (1 - cost / 100);

        //Miért számít, hogy valós számokat és nem egészeket adok meg?
        whole = (1.0 + interestRate / 100.0 * days / 365.0) * fund * (1.0 - cost / 100.0);

        //Ez miért nem működik? (Eredmény: 1.7491613835616437E8)
        //whole = (1.0 + getYield(days)) * fund * (1.0 - cost / 100.0);

        whole = active ? whole : 0;
        active =false;
        return whole;
    }
}
