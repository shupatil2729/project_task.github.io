package castingNonPrimDowncasting;

public class MainApp1 {
    public static void main(String[] args) {
        AC a1=new SplitAC();  //upcasting
        a1.getType();
        SplitAC s1=(SplitAC) new AC();
        s1.getType();

        //Exception in thread "main" java.lang.ClassCastException
    }
}
