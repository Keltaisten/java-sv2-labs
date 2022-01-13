package collectionslist;

import java.util.ArrayList;
import java.util.List;

public class Postman {
    List<String> addressesForDelivery = new ArrayList<>();

    public void addAddress(String address){
        addressesForDelivery.add(address);
    }

    public List<String> getAddressesForDelivery() {
        return addressesForDelivery;
    }

    public void removeAddress(String address){
        addressesForDelivery.remove(address);
    }
}
