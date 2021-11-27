package immutable;

import java.time.LocalDate;

public class Monument {
    private final String name;
    private final String address;
    private final LocalDate date;
    private final String number;

    public Monument(String name, String address, LocalDate date, String number) {
        if(isEmpty(name)){
            this.name = name;
        }
        else {
            throw new IllegalArgumentException("Name, address or registry number cannot be empty!");
        }
        if(isEmpty(address)){
            this.address = address;
        }
        else {
            throw new IllegalArgumentException("Name, address or registry number cannot be empty!");
        }
        this.date = date;
        if(isEmpty(number)){
            this.number = number;
        }
        else {
            throw new IllegalArgumentException("Name, address or registry number cannot be empty!");
        }
    }

    private boolean isEmpty(String text){
        if(text == null || text.trim().isEmpty()){
            return false;
        }else{
            return true;
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getNumber() {
        return number;
    }
}
