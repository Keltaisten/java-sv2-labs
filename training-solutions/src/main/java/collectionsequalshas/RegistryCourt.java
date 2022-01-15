package collectionsequalshas;

import java.util.ArrayList;
import java.util.List;

public class RegistryCourt {
    public static void main(String[] args) {
        List<Company> companies = new ArrayList<>();
        companies.add(new Company("Cég Kft", "1234"));
        System.out.println(companies.contains(new Company("Cég Kft", "1234")));
        companies.add(new Company("Cég Kft", "1111"));
        companies.add(new Company("Cég2 Kft", "1112"));
        companies.add(new Company("Cég3 Kft", "1113"));
        companies.add(new Company("Cég4 Kft", "1114"));
        System.out.println(companies.contains(new Company("Cég4 Kft", "1114")));
        System.out.println(companies.contains(new Company("Cég10 Kft", "1114")));
        System.out.println(companies.contains(new Company("Cég5 Kft", "1234")));

    }
}
