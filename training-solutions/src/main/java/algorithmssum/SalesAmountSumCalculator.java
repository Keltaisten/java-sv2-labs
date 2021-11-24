package algorithmssum;

import java.util.List;

public class SalesAmountSumCalculator {
    public int sumSalesperson(List<Salesperson> salespersonList){
        int sum = 0;
        for(Salesperson sal: salespersonList){
            sum += sal.getAmount();
        }
        return sum;
    }
}
