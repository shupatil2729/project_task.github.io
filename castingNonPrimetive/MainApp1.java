package castingNonPrimetive;

public class MainApp1 {
    public static void main(String[] args) {
        Sample s1=new Sample();
        s1.test();
        s1.display();

        System.out.println("========");

        //upcasting
        Demo d1=new Sample();
        d1.test();

        }
    }

