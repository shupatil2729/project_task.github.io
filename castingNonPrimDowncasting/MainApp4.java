package castingNonPrimDowncasting;

public class MainApp4 {
    //frist level upasting
    public static void main(String[] args) {
        Fruit f1 = new Apple();
        f1.getFoodType();
        f1.getFruitType();
        System.out.println("==================================================");

        //second level upcasting
        Food d1 = new Fruit();
        d1.getFoodType();
        System.out.println("============================================");

        //first level down casting
        Fruit r1 = (Fruit) d1;
        r1.getFoodType();
        r1.getFruitType();
        System.out.println("=======================================");

        //second level down casting
        Apple a1 = (Apple) f1;
        a1.getFoodType();
        a1.getFruitType();
        a1.GetFruitName();


    }
}
