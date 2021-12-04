package dynamictypes.school;

public class SchoolMain {
    public static void main(String[] args) {
        School school = new School("Suli", 12);
        School primarySchool = new PrimarySchool("Általános suli", 8);
        School secondarySchool = new SecondarySchool("Közép suli", 4);

        System.out.println(school.getName());
        System.out.println(school.getNumberOfYears());
        System.out.println(primarySchool.getName());
        System.out.println(primarySchool.getNumberOfYears());
        System.out.println(secondarySchool.getName());
        System.out.println(secondarySchool.getNumberOfYears());
    }
}
