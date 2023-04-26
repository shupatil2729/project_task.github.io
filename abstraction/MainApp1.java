package abstraction;

public class MainApp1 {
    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setEmpsalary(20000);
        System.out.println("SALARY IS : "+ e1.getEmpsalary());
        e1.setEmpsalary(32000);
        System.out.println("SALARY IS : "+  e1.getEmpsalary());
    }
}
