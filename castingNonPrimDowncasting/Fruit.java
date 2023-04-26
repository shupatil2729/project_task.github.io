package castingNonPrimDowncasting;
//subclass
public class Fruit extends Food {
    @Override
    void getFoodType() {
        System.out.println("FOOD TYPE IS FRUIT");
    }

    void getFruitType() {
        System.out.println("DISPLAY FRUIT TYPE");
    }
}