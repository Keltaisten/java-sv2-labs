package intromethods.employee;

import java.time.LocalDate;

public class Employee {
    private String name;
    private LocalDate hiringYear;
    private int salary;

    public Employee(String name, LocalDate hiringYear, int salary) {
        this.name = name;
        this.hiringYear = hiringYear;
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void raiseSalary(int price){
        salary += price;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hiringYear=" + hiringYear +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public LocalDate getHiringYear() {
        return hiringYear;
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Adam", LocalDate.of(2017,04,03),280_000);

        employee.setName("Adam Kiss");
        employee.raiseSalary(35_000);

        System.out.println(employee.toString());
    }

}
