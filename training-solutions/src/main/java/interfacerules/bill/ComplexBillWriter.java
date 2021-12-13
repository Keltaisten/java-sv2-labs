package interfacerules.bill;

import java.util.List;

public class ComplexBillWriter implements BillWriter{
    @Override
    public String writeBill(List<String> billItems) {
        StringBuilder billBuilder = new StringBuilder();
        for(String bill: billItems){
            String[] bills = bill.split(";");
            int multiply = Integer.parseInt(bills[1]) * Integer.parseInt(bills[2]);
            billBuilder.append(bills[0] + "; darabszám: " + bills[2] + ", egységár: " +
                    bills[1] + ", összesen: " + multiply + " Ft\n");
        }
        return String.valueOf(billBuilder);
    }
}
