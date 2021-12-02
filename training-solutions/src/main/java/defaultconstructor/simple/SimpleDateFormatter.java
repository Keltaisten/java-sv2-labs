package defaultconstructor.simple;

public class SimpleDateFormatter {
    private CountryCode countryCode;

    public SimpleDateFormatter() {
    }

    public String formatDateString(SimpleDate simpleDate){
        return simpleDate.getYear() + "-" + simpleDate.getMonth() + "-" + simpleDate.getDay();
    }

    public String formatDateStringByCountryCode(CountryCode countryCode,SimpleDate simpleDate){
        if(countryCode == CountryCode.EN){
            return simpleDate.getDay() + "-" + simpleDate.getMonth() + "-" + simpleDate.getYear();
        }
        else if(countryCode == CountryCode.US){
            return simpleDate.getMonth() + "-" + simpleDate.getDay() + "-" + simpleDate.getYear();
        }
        else{
            return simpleDate.getYear() + "-" + simpleDate.getMonth() + "-" + simpleDate.getDay();
        }
    }
}
