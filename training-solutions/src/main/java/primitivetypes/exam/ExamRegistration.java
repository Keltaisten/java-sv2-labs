package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
        private String name;
        private String dateOfBirth;
        private String zipCode;
        private String averageGrades;

    public static void main(String[] args) {
        ExamRegistration examReg = new ExamRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kérem adja meg a nevét");
        examReg.name = scanner.nextLine();
        System.out.println("Kérem adja meg a születési idejét");
        examReg.dateOfBirth = scanner.nextLine();
        System.out.println("Kérem adja meg az irányítószámát");
        examReg.zipCode = scanner.nextLine();
        System.out.println("Kérem adja meg a tanfolyamon szerzett osztályzatainak átlagát");
        examReg.averageGrades = scanner.nextLine();

        Person person = new Person(examReg.name, examReg.transformDate(examReg.dateOfBirth),
                examReg.transformzipCode(examReg.zipCode), examReg.transformzipCode(examReg.averageGrades));
        System.out.println(person);
    }

    public LocalDate transformDate(String dateOfBirth){
        int year = Integer.parseInt(dateOfBirth.substring(0,4));
        int month = Integer.parseInt(dateOfBirth.substring(5,7));
        int day = Integer.parseInt(dateOfBirth.substring(8,10));
        return LocalDate.of(year,month,day);
    }

    public int transformzipCode(String zipCode){
        return Integer.parseInt(zipCode);
    }

    public double transformGrades(String averageGrades){
        return Double.parseDouble(averageGrades);
    }

}
