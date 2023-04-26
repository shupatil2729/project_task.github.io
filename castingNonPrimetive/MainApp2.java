package castingNonPrimetive;

public class MainApp2 {
    public static void main(String[] args) {
        //Accessing general info
        Mobile m1;

        //upcasting
        m1=new Smartphone();
        m1.getInfo("samsung",15000.00);

        m1=new Featurephone();
        m1.getInfo("NOKIA",2500.00);


        System.out.println("=======");

        //Accesing special info
        Smartphone s1=new Smartphone();
        s1.specification();

        Featurephone f1=new Featurephone();
        f1.specification();


    }
}
