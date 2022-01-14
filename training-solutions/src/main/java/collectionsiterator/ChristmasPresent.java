package collectionsiterator;

public class ChristmasPresent {
    private String descriptionOfTheGift;
    private String nameOfPerson;
    private int price;

    public ChristmasPresent(String descriptionOfTheGift, String nameOfPerson, int price) {
        this.descriptionOfTheGift = descriptionOfTheGift;
        this.nameOfPerson = nameOfPerson;
        this.price = price;
    }

    public String getDescriptionOfTheGift() {
        return descriptionOfTheGift;
    }

    public String getNameOfPerson() {
        return nameOfPerson;
    }

    public int getPrice() {
        return price;
    }
}
