package composition.realestate;

public class RealEstateDotCom {
    public static void main(String[] args) {
        System.out.println(new RealEstate("Ez a cím helye",2550.2,
                new Details("Ez egy leírás", new Address("Helsinki",
                        "HA4220","Ranger str", 15),100,20)));
    }
}
