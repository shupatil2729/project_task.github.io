package Method;

public class MethodDemo1 {
    //internal method
    public static void main(String[] args) {
        System.out.println("MAIN METHOD");
        display(1);//method call
        display(2);
        //external method
    }
        public static void display(int a)
        {
            System.out.println("DISPLAY METHOD");
        }


}
