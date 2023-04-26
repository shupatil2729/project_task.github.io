package abstraction;

public class Employee {
    private double empsalary=15000;
    public double getEmpsalary(){     //read class
        return empsalary;
    }
    public void setEmpsalary(double empsalary){
        if(empsalary>25000) {      //write access
            this.empsalary = empsalary;
        }
        else {
            System.out.println("INVALID SALARY AMOUNT");
        }

    }
}
