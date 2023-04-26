package castingNonPrimDowncasting;
//subclass
public class Laptop extends Machine{
   // @Override
    void GetType(){
        System.out.println("Machine type is Laptop");

    }

    void specification(String company,double price){
        System.out.println("LAPTOP COMPANY IS "+company);
        System.out.println("LAPTOP PRICE IS "+price);

    }

}
