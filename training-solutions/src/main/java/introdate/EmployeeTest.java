package introdate;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("Olivér", LocalDate.of(1988,07,19), LocalDateTime.now());
        System.out.println("Az ön neve: " + employee.getName() +
                "\r\nSzületési dátuma: " + employee.getDateOfBirth() +
                "\r\nBelépési ideje: " + employee.getBeginEmployment());
        employee.name = "Zsolti";
        System.out.println("Az ön új neve :" + employee.getName() +
                "\r\nSzületési dátuma: " + employee.getDateOfBirth() +
                "\r\nBelépési ideje: " + employee.getBeginEmployment());
    }
}
