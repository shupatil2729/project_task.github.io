package objectClass;

public class Employee {
    int empId;
    double empSalary;
    String empDesignation;
    public Employee(int empId,double empSalary,String empDesignation){
        this.empId=empId;
        this.empSalary=empSalary;
        this.empDesignation=empDesignation;

    }
    @Override
    public String toString() {
        return empId + "\t" + empSalary + "\t" + empDesignation;

    }
}
