package castingUpcasting;

public class MainApp1 {
    public static void main(String[] args) {

        Bike b1;
        b1=new PetrolBike();
        b1.getType();

        b1=new ElectricBike();
        b1.getType();
    }
}
