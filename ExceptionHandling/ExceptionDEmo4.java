package ExceptionHandling;

public class ExceptionDEmo4 {
    public static void main(String[] args) {
        System.out.println("main method");
        int []data=new int [3];
        int a=20,b=0;
        try {
            try {

                data[2]=200;
                System.out.println(data[2]);

            }catch (ArithmeticException e){
                System.out.println(e);
            }
            System.out.println(a/b);
        }catch (ArithmeticException f){
            System.out.println(f);
        }





        System.out.println("main ended");
    }
}
