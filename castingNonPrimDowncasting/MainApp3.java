package castingNonPrimDowncasting;

public class MainApp3 {
    public static void main(String[] args) {
        Machine m1=new Machine();   //upcasting
        m1.getType();
        System.out.println("=====");

        Laptop l1=new Laptop();   //downcasting
        l1.GetType();
        l1.specification("HP",45000.00);



    }
}
