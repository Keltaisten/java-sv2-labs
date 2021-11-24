package algorithmsmax.sales;

import java.util.List;

public class Sales {
    public Salesperson selectSalesPersonWithMaxSalesAmount(List<Salesperson> sales){
        Salesperson salesPersonWithMaxAmount = null;
        for(Salesperson sp: sales){
            if(salesPersonWithMaxAmount == null || sp.getAmount() > salesPersonWithMaxAmount.getAmount()){
                salesPersonWithMaxAmount = sp;
            }
        }
        return salesPersonWithMaxAmount;
    }

    public Salesperson selectSalesPersonWithFurthestAboveTarget(List<Salesperson> sales){
        Salesperson salesPersonWithHighestTargetDiff = null;
        int prevMaxDiff = 0;
        for(Salesperson sp: sales){
            int actualMaxDiff = sp.getAmount() - sp.getTarget();
            if(salesPersonWithHighestTargetDiff == null || sp.getDiffFromTarget() > salesPersonWithHighestTargetDiff.getDiffFromTarget()){
                salesPersonWithHighestTargetDiff = sp;
            }
        }
        return salesPersonWithHighestTargetDiff;
    }

    public Salesperson selectSalesPersonWithFurthestBelowTarget(List<Salesperson> sales){
        Salesperson salesPersonWithLowestTargetDiff = null;
        for(Salesperson sp: sales){
            int actualMinDiff = sp.getTarget() - sp.getAmount();
            if(salesPersonWithLowestTargetDiff == null || sp.getDiffFromTarget() < salesPersonWithLowestTargetDiff.getDiffFromTarget()){
                salesPersonWithLowestTargetDiff = sp;
            }
        }
        return salesPersonWithLowestTargetDiff;
    }
}
