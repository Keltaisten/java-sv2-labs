package inheritancemethods.employee;

import com.sun.security.auth.NTUserPrincipal;

public class Boss extends Employee {
    private double LEADERSHIP_FACTOR = 0.1;
    private int numberOfEmployees;

    public Boss(String name, String address, double salary, int numberOfEmployees) {
        super(name, address, salary);
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getLEADERSHIP_FACTOR() {
        return LEADERSHIP_FACTOR;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    @Override
    public double getSalary() {
        return super.getSalary() * (1 +  LEADERSHIP_FACTOR * numberOfEmployees);
    }
}
