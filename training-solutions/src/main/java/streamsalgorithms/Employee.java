package streamsalgorithms;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Employee implements Comparable<Employee> {
    private String name;
    private int dateOfBirth;

    public Employee(String name, int dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 1990));
        employees.add(new Employee("Jack", 1980));
        employees.add(new Employee("Jane", 1975));
        employees.add(new Employee("Jetta", 1995));
        employees.add(new Employee("Joe", 2000));
        employees.add(new Employee("Joey", 1970));

        long sumDateOfBirth = employees.stream()
                .map(Employee::getDateOfBirth)
                .reduce(0,Integer::sum);

        System.out.println(sumDateOfBirth);

        long sumAge = employees.stream()
                .map(Employee::getDateOfBirth)
                .map(employee -> LocalDate.now().getYear() - employee)
                .reduce(0, Integer::sum);

        System.out.println(sumAge);

        long sumNumberOfEmployees = employees.stream()
                .count();

        System.out.println(sumNumberOfEmployees);

        long howManyBefore1990 = employees.stream()
                .map(Employee::getDateOfBirth)
                .filter(employee -> employee < 1990)
                .count();

        System.out.println(howManyBefore1990);

        OptionalInt oldestEmployeesBirthYear = employees.stream()
                .map(Employee::getDateOfBirth)
                .mapToInt(i -> i)
                .min();

        System.out.println(oldestEmployeesBirthYear);

        Optional<Employee> oldestEmployeesName = employees.stream()
                .sorted()
                .findFirst();

        System.out.println(oldestEmployeesName);

        boolean isEveryEmployeeBirthBefore1980 = employees.stream()
                .map(Employee::getDateOfBirth)
                .allMatch(birthYear -> birthYear < 1980);

        System.out.println(isEveryEmployeeBirthBefore1980);

        List<Employee> allEmployeesBefore1990 = employees.stream()
                .filter(employee -> employee.dateOfBirth < 1990)
                .toList();

        System.out.println(allEmployeesBefore1990);

        List<String> allEmployeesName = employees.stream()
                .map(Employee::getName)
                .toList();

        System.out.println(allEmployeesName);

        List<String> allEmployeesNamesBirthYearBefore1990 = employees.stream()
                .filter(employee -> employee.dateOfBirth < 1990)
                .map(Employee::getName)
                .toList();

        System.out.println(allEmployeesNamesBirthYearBefore1990);
    }


    @Override
    public int compareTo(Employee o) {
        return dateOfBirth - o.dateOfBirth;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
