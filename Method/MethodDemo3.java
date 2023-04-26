package Method;

public class MethodDemo3 {
    //external method
    static void add(double a,double b)
    {
        double c= a+b;
        System.out.println("add "+c);

    }

    public static void main(String[] args) {
        add(1,3);
        add(5,5);

    }

}
